package com.android.fourthassignment.api;

import com.android.fourthassignment.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UsersAPI {

    @POST("login")
    Call<User> userLogin(@Body User user);

    @GET("users")
    Call<List<User>> showUser();

    @POST("signup")
    Call<Void> addUser(@Body User user);


//    @GET("tasks")
//    Call<List<Task>> getUsers(@Header("Authorization") String authHeader);


}
