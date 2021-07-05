package com.example.myapplication.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ApiClient {
    public static <S> S createService(Class<S> serviceClass) {
        
        // Secret: 0053F59E7BC37CD8631CC791E19A6202555697679D4231960802FB4D7672AD1C
        Retrofit.Builder builder =
                new Retrofit.Builder()
                        .baseUrl("https://randevuapi20200816175309.azurewebsites.net/api/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(new OkHttpClient());
        Retrofit retrofit = builder.build();
        return retrofit.create(serviceClass);
    }
}
