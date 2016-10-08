package com.ramazeta.zodiak.rest;

import com.ramazeta.zodiak.models.Zodiak;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by rama on 10/9/16.
 */

public interface ApiInterface {

    @GET("zodiak")
    Call<Zodiak> getZodiak(@Query("nama") String nama, @Query("tgl") String tgl);
}
