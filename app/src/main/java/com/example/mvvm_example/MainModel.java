package com.example.mvvm_example;

import java.util.ArrayList;
import java.util.List;

public class MainModel {
    List<User> users = new ArrayList<>();

    public MainModel() {
        users.add(new User("김OO", "1A2B"));
        users.add(new User("이OO", "2A4B"));
        users.add(new User("최OO", "3A7B"));
        users.add(new User("박OO", "5A9B"));
        users.add(new User("배OO", "6A0B"));
        users.add(new User("나OO", "5JAB"));
        users.add(new User("균OO", "677B"));
        users.add(new User("마OO", "1ACB"));
        users.add(new User("한OO", "7NFE"));
        users.add(new User("강OO", "0QE2"));
        users.add(new User("도OO", "QVS9"));
        users.add(new User("유OO", "8QFF"));
    }

    public User getUser() {
        return users.get((int)(Math.random()*12));
    }
}
