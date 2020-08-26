package com.example.myapplication.network;
import com.example.myapplication.BikeStation;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
public interface Services {
    // @GET("BisikletDuraklariJSON")
    // Call<List<BikeStation>> getBikeStation();
    
    @GET("randevu")
    Call<List<Randevu>> getRandevular();
    
    @GET("randevu/{id}")
    Call<Randevu> getRandevu(@Path("id") int randevuId);
    
    @GET("randevu?guncel=true")
    Call<List<Randevu>> getRandevularGuncel();
    
    @POST("randevu")
    Call<Randevu> createRandevu(@Body Randevu randevu);
    
    @PUT("randevu/{id}")
    Call<void> changeRandevu(@Path("id") int randevuId, @Body Randevu randevu);
    
    @DELETE("randevu/{id}")
    Call<void> deleteRandevu(@Path("id") int randevuId);
}
