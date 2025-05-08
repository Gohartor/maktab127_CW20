package org.example;

import org.example.question06.User;

public class Main {
    public static void main(String[] args) {

//        Connection c = ApplicationContextLazy.getInstance().getConnection();

//        Connection c = ApplicationContextEager.getInstance().getConnection();


//        User u = new User("ali", "alavi", "mohammad", 25, LocalDate.of(1990,05,05), "IT", true, "here", "aliali", "1234");


        User ub = User.builder().userName("hasan").password("1234").build();
        System.out.println(ub.toString());
    }
}