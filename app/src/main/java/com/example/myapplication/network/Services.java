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
    
    // Randevu
    @GET("randevu")
    Call<List<Randevu>> getRandevular();
    
    @GET("randevu/{id}")
    Call<Randevu> getRandevu(@Path("id") int randevuId);
    
    @GET("randevu?guncel=true")
    Call<List<Randevu>> getRandevularGuncel();
    
    @POST("randevu")
    Call<Randevu> createRandevu(@Body Randevu randevu);
    
    @DELETE("randevu/{id}")
    Call<ResponseBody> deleteRandevu(@Path("id") int randevuId);
    
    @PUT("randevu/{id}")
    Call<ResponseBody> updateRandevu(@Path("id") int randevuId, @Body Randevu randevu);
    
    
    // Ogrenci
    @GET("ogrenci")
    Call<List<OgrenciModel>> getOgrenciler();
    
    @GET("ogrenci/{id}")
    Call<OgrenciModel> getOgrenci(@Path("id") int ogrenciId);
    
    @POST("ogrenci")
    Call<OgrenciModel> createOgrenci(@Body OgrenciModel ogrenci);
    
    @DELETE("ogrenci/{id}")
    Call<ResponseBody> deleteOgrenci(@Path("id") int ogrenciId);
    
    @PUT("ogrenci/{id}")
    Call<ResponseBody> updateOgrenci(@Path("id") int ogrenciId, @Body OgrenciModel ogrenci);
    
    
    // Donem
    @GET("donem")
    Call<List<DonemModel>> getDonemler();
    
    @GET("donem/{id}")
    Call<DonemModel> getDonem(@Path("id") int donemId);
    
    @POST("donem")
    Call<DonemModel> createDonem(@Body DonemModel donem);
    
    @DELETE("donem/{id}")
    Call<ResponseBody> deleteDonem(@Path("id") int donemId);
    
    @PUT("donem/{id}")
    Call<ResponseBody> updateDonem(@Path("id") int donemId, @Body DonemModel donem);
    
    
    // Yonetici
    @GET("yonetici")
    Call<List<YoneticiModel>> getYoneticiler();
    
    @GET("yonetici/{id}")
    Call<YoneticiModel> getYonetici(@Path("id") int yoneticiId);
    
    @POST("yonetici")
    Call<YoneticiModel> createYonetici(@Body YoneticiModel yonetici);
    
    @DELETE("yonetici/{id}")
    Call<ResponseBody> deleteYonetici(@Path("id") int yoneticiId);
    
    @PUT("yonetici/{id}")
    Call<ResponseBody> updateYonetici(@Path("id") int yoneticiId, @Body YoneticiModel yonetici);
    
}
