package com.FabricaEscuela.API_REST.controller;


import com.FabricaEscuela.API_REST.model.User;
import com.FabricaEscuela.API_REST.service.UserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class UserResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final UserService userService;

    public UserResolver(UserService userService) {
        this.userService = userService;
    }

    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    public User createUser(String name, String email) {
        return userService.createUser(name, email);
    }
}
