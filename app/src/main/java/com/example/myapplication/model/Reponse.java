package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("Status")
    @Expose
    public String Status;
    @SerializedName("Response")
    @Expose
    public String Response;
    
    public String getStatus() {
        return Status;
    }
  
    public String getResponse() {
        return Reponse;
    }
}
