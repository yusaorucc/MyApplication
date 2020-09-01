package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class OgrenciModel {

    @SerializedName("Isim")
    @Expose
    public String Isim;
    @SerializedName("Bolum")
    @Expose
    public String Bolum;
    @SerializedName("YerlestigiBolum")
    @Expose
    public String YerlestigiBolum;
    @SerializedName("Burs")
    @Expose
    public Integer Burs;
    @SerializedName("DogumTarihi")
    @Expose
    public Integer DogumTarihi;
    @SerializedName("DonemId")
    @Expose
    public Integer DonemId;
    @SerializedName("RandevuId")
    @Expose
    public Integer RandevuId;

    public String getIsim() {
        return Isim;
    }

    public void setIsim(String isim) {
        Isim = isim;
    }

    public String getBolum() {
        return Bolum;
    }

    public void setBolum(String bolum) {
        Bolum = bolum;
    }

    public String getYerlestigiBolum() {
        return YerlestigiBolum;
    }

    public void setYerlestigiBolum(String yerlestigiBolum) {
        YerlestigiBolum = yerlestigiBolum;
    }

    public Integer getBurs() {
        return Burs;
    }

    public void setBurs(Integer burs) {
        Burs = burs;
    }

    public Integer getDogumTarihi() {
        return DogumTarihi;
    }

    public void setDogumTarihi(Integer dogumTarihi) {
        DogumTarihi = dogumTarihi;
    }

    public Integer getDonemId() {
        return DonemId;
    }

    public void setDonemId(Integer donemId) {
        DonemId = donemId;
    }

    public Integer getRandevuId() {
        return RandevuId;
    }

    public void setRandevuId(Integer randevuId) {
        RandevuId = randevuId;
    }
}
