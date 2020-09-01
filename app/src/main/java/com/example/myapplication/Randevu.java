package com.example.myapplication;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import java.time.LocalDate;

public class Randevu implements Serializable {
    @SerializedName("randevuId")
    @Expose
    private long randevuId;
    @SerializedName("tarih")
    @Expose
    private String tarih;
    @SerializedName("donemId")
    @Expose
    public String Isim;
    @SerializedName("Isim")
    @Expose
    private long donemId;
    public void setRandevuId(long randevuId) {
        this.randevuId = randevuId;
    }
    public long getRandevuId() {
        return randevuId;
    }
    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    public String getTarih() {
        return tarih;
    }
    public void setDonemId(long donemId) {
        this.donemId = donemId;
    }
    public long getDonemId() {
        return donemId;
    }
    public String getIsim(){
        return Isim;
    }
}
