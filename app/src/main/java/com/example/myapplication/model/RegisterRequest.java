package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterRequest {

    @SerializedName("Username")
    @Expose
    public String Username;
    @SerializedName("Email")
    @Expose
    public String Email;
    @SerializedName("Password")
    @Expose
    public String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
  
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
  
    public String getPassword() {
        return Password;
    }

    public void setBolum(String password) {
        Password = password;
    }
}
