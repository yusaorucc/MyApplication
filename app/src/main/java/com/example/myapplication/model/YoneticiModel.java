package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class YoneticiModel {

    @SerializedName("YoneticiId")
    @Expose
    public Integer YoneticiId;
    @SerializedName("Isim")
    @Expose
    public String Isim;
    @SerializedName("Ofis")
    @Expose
    public String Ofis;
    
    public Integer getYoneticiId() {
        return YoneticiId;
    }

    public void setDonemId(Integer yoneticiId) {
        YoneticiId = yoneticiId;
    }
    
    public String getIsim() {
        return Isim;
    }

    public void setIsim(String isim) {
        Isim = isim;
    }

    public String getOfis() {
        return Ofis;
    }

    public void setBolum(String ofis) {
        Ofis = ofis;
    }
}
