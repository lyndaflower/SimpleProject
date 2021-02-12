package com.example.mpractice.api;

import com.example.mpractice.model.MySliderList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MySliderApi {


    @GET("onbording.php")
    Call<List<MySliderList>> getonbordingdata();
}
