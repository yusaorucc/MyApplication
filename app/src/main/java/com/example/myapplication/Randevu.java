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
    private LocalDate tarih;
    @SerializedName("donemId")
    @Expose
    private long donemId;
    public String getLat() {
        return lat;
    }
    public void setRandevuId(long randevuId) {
        this.randevuId = randevuId;
    }
    public long getRandevuId() {
        return randevuId;
    }
    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }
    public LocalDate getTarih() {
        return tarih;
    }
    public void setDonemId(long donemId) {
        this.donemId = donemId;
    }
    public long getDonemId() {
        return donemId;
    }
}
