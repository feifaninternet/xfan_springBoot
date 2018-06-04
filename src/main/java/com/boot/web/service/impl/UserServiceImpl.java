package com.boot.web.service.impl;

import com.boot.web.dao.mybatis.UserMapper;
import com.boot.web.models.entity.UserAndBook;
import com.boot.web.service.UserService;
import graphql.GraphQL;
import graphql.schema.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static graphql.Scalars.GraphQLInt;
import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;

/**
 * @author xfan
 * @date Created on 2018/5/25 -- 15:59
 * @desc UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Object getUserByGraphQl(String query) {
        List<UserAndBook> allUserAndBook = userMapper.findAllUserAndBook();

        // Create the book graphQL query type
        GraphQLObjectType bookType = newObject()
                .name("book")
                .field(newFieldDefinition()
                        .name("bid")
                        .type(GraphQLInt))
                .field(newFieldDefinition()
                        .name("userid")
                        .type(GraphQLInt))
                .field(newFieldDefinition()
                        .name("bookname")
                        .type(GraphQLString))
                .field(newFieldDefinition()
                        .name("bookprice")
                        .type(GraphQLInt))
                .build();

        // Create the user graphQL query type
        GraphQLObjectType userType = newObject()
                .name("user")
                .field(newFieldDefinition()
                        .name("id")
                        .type(GraphQLInt))
                .field(newFieldDefinition()
                        .name("username")
                        .type(GraphQLString))
                .field(newFieldDefinition()
                        .name("password")
                        .type(GraphQLString))
                // the son table book in user object
                .field(newFieldDefinition()
                        .name("book")
                        .type(new GraphQLList(bookType)))
                .build();

        // Get the request param { id }
        GraphQLFieldDefinition personDefinition = GraphQLFieldDefinition.newFieldDefinition()
                .name("user")
                .type(userType)
                .argument(GraphQLArgument.newArgument().name("name").type(GraphQLString))
                .dataFetcher(dataFetchingEnvironment -> {
                    String name = dataFetchingEnvironment.getArgument("name");
                    for (UserAndBook userAndBook : allUserAndBook) {
                        if (userAndBook.getUsername().equals(name)) {
                            return userAndBook;
                        }
                    }
                    return null;
                })
                .build();

        // Create schema to query
        GraphQLSchema schema = GraphQLSchema.newSchema()
                .query(newObject()
                        .name("userQuery")
                        .field(personDefinition)
                        .build())
                .build();

        // Take in schema user to query
        GraphQL graphQL = GraphQL.newGraphQL(schema).build();

        Object res = graphQL.execute(query).getData();
        return res;
    }
}
