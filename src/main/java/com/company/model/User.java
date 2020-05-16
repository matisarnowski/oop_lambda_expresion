package com.company.model;

import java.time.LocalDateTime;

public class User {
    //pola klasowe prywatne
    private String name;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime registrationDate = LocalDateTime.now();
    private boolean status = true;
    private Role role = Role.ROLE_USER;


}
