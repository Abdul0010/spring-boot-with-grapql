package com.grapql.grapql.service;


import com.grapql.grapql.model.User;
import com.grapql.grapql.repository.UserRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@GraphQLApi
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GraphQLQuery(name = "getUser")
    Optional<User>getUser(Long id){
        return userRepository.findById(id);
    }

    @GraphQLQuery(name = "getAllUsers")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

}
