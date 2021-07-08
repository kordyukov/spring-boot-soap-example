package com.techprimers.springbootsoapexample.service;

import com.techprimers.spring_boot.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize(){

        User peter = new User();
        peter.setName("Peter");
        peter.setEmpId(11111);
        peter.setSalary(12000);

        User sam = new User();
        sam.setName("Sam");
        sam.setEmpId(113111);
        sam.setSalary(120200);

        User rayan = new User();
        rayan.setName("Rayanr");
        rayan.setEmpId(111111);
        rayan.setSalary(1322000);


        users.put(peter.getName(),peter);
        users.put(sam.getName(),sam);
        users.put(rayan.getName(),rayan);
    }

    public  User getUsers(String name) {
        return users.get(name);
    }
}
