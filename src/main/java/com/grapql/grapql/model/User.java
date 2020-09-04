package com.grapql.grapql.model;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    @GraphQLQuery(name = "firstName",deprecationReason = "first name")
    private String firstName;
    @GraphQLQuery(name = "lastName",deprecationReason = "last name")
    @Column(name = "last_name")
    private String lastName;
    @GraphQLQuery(name = "gender",deprecationReason = "gender")
    @Column(name = "gender")
    private String gender;
}
