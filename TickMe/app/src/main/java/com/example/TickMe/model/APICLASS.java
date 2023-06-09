package com.example.TickMe.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APICLASS {
    public static String BASE_URL ="http://192.168.43.107/";
    public static Retrofit retrofit;
    public static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}