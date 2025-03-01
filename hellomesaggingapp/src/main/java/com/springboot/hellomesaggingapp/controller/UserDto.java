package com.springboot.hellomesaggingapp.controller;

public class UserDto {
    private String firstname;
    private String lastname;

    UserDto(String firstname, String lastname) {
        this.firstname=firstname;
        this.lastname=lastname;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname=firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname=lastname;
    }
}
