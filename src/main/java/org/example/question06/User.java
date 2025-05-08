package org.example.question06;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String fatherName;
    private Integer age;
    private LocalDate birthDate;
    private String job;
    private boolean isMarried;
    private String address;

    @NonNull
    private String userName;
    @NonNull
    private String password;

//    public User(String firstName, String lastName, String fatherName,
//                Integer age, LocalDate birthDate, String job,
//                boolean isMarried, String address, String userName,
//                String password) {
//
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.fatherName = fatherName;
//        this.age = age;
//        this.birthDate = birthDate;
//        this.job = job;
//        this.isMarried = isMarried;
//        this.address = address;
//        this.userName = userName;
//        this.password = password;
//    }
}
