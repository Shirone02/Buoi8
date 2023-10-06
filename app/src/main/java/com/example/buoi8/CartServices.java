package com.example.buoi8;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CartServices {

    @GET("carts")
    Call<CartsResponse> getCarts();

}
