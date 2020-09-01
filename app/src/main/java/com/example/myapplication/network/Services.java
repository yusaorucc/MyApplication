package com.example.myapplication.network;
import com.example.myapplication.BikeStation;
import com.example.myapplication.Randevu;
import com.example.myapplication.model.DonemModel;
import com.example.myapplication.model.OgrenciModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Services {
    // @GET("BisikletDuraklariJSON")
    //Call<List<BikeStation>> getBikeStation();
    Call<List<Randevu>> getRandevu();
    @GET("randevu")
    Call<List<Randevu>> getRandevular();
    
    @GET("randevu/{id}")
    Call<Randevu> getRandevu(@Path("id") int randevuId);
    
    @GET("randevu?guncel=true")
    Call<List<Randevu>> getRandevularGuncel();
    
    @POST("randevu")
    Call<Randevu> createRandevu(@Body Randevu randevu);

    //User
    @POST("ogrenci")
    Call<OgrenciModel> creatOgrenci(@Body Randevu randevu);

    @GET("donem")
    Call<List<DonemModel>> getDonem();

}
