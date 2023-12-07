package com.example.bouassida_roua_lsi3_messure_glycemie.model;

public class User {
    private String userNom;
    private String password;
    public User (String userNom,String password){
        this.userNom=userNom;
        this.password=password;
    }

    public String getUserNom() {
        return userNom;
    }

    public String getPassword() {
        return password;
    }
}
