package com.techprimers.springbootsoapexample.endpoint;

import com.techprimers.spring_boot.GetUserRequest;
import com.techprimers.spring_boot.GetUserResponce;
import com.techprimers.spring_boot.User;
import com.techprimers.springbootsoapexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "htttp://techprimers.com/spring-boot-soap-example",
    localPart = "getUserRequest")

    @ResponsePayload
   public GetUserResponce getUserRequest(@RequestPayload GetUserRequest request){

        GetUserResponce responce = new GetUserResponce();
        responce.setUser(userService.getUsers(request.getName()));
        return responce;

    }

}
