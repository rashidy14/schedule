package com.fym.cse.dto;

import enums.Role;

public class Admin  {
    private int iD;
    private String email;
    private String password;
    private Role role = Role.Admin;


    public void setID(int iD) {
        this.iD = iD;
    }

    public int getID() {
        return iD;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
