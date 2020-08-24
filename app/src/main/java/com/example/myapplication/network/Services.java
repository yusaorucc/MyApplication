package com.example.myapplication.network;
import com.example.myapplication.BikeStation;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
public interface Services {
    @GET("BisikletDuraklariJSON")
    Call<List<BikeStation>> getBikeStation();
}