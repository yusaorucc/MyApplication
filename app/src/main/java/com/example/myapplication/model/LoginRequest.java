package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginRequest {

    @SerializedName("Username")
    @Expose
    public String Username;
    @SerializedName("Password")
    @Expose
    public String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
  
    public String getPassword() {
        return Password;
    }

    public void setBolum(String password) {
        Password = password;
    }
}
