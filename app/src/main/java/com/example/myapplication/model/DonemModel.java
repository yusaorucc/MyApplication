package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DonemModel {

    @SerializedName("Isim")
    @Expose
    public String Isim;
    @SerializedName("Baslangic")
    @Expose
    public Integer Baslangic;
    @SerializedName("Bitis")
    @Expose
    public Integer Bitis;

    public String getIsim() {
        return Isim;
    }

    public void setIsim(String isim) {
        Isim = isim;
    }

    public Integer getBaslangic() {
        return Baslangic;
    }

    public void setBaslangic(Integer baslangic) {
        Baslangic = baslangic;
    }

    public Integer getBitis() {
        return Bitis;
    }

    public void setBitis(Integer bitis) {
        Bitis = bitis;
    }
}
