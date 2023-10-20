package com.example.tesmasuya;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    public static final String BASE_URL = "http://masuya1.freeddns.org:91/cobaapp2/masuyates/technicaltest/";
    @GET("getlistuser.php")
    Call<List<Results>> getsuperHeroes();
}
