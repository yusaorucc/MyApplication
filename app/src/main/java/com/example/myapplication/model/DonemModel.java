package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.time;

public class DonemModel {

    @SerializedName("Isim")
    @Expose
    public String Isim;
    @SerializedName("Baslangic")
    @Expose
    public LocalDate Baslangic;
    @SerializedName("Bitis")
    @Expose
    public LocalDate Bitis;

    public String getIsim() {
        return Isim;
    }

    public void setIsim(String isim) {
        Isim = isim;
    }

    public LocalDate getBaslangic() {
        return Baslangic;
    }

    public void setBaslangic(LocalDate baslangic) {
        Baslangic = baslangic;
    }

    public LocalDate getBitis() {
        return Bitis;
    }

    public void setBitis(LocalDate bitis) {
        Bitis = bitis;
    }
}
