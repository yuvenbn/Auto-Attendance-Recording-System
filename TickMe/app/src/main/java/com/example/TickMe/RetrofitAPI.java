package com.example.TickMe;

import com.example.TickMe.model.Person_Model_Class;
import retrofit2.Call;
import retrofit2.http.GET;
// Interface to handle different request like GET or POST
public interface RetrofitAPI {
        @GET("covidTracker/PHP/deletable.php")
        //Call<String> getRes();
        Call<Person_Model_Class> getPerson();
}
