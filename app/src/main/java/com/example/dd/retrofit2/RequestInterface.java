package com.example.dd.retrofit2;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dd on 09.05.2017.
 */

public interface RequestInterface {
    @GET("dds861/3932d2ad026a64ccea9c86e5d20ac9b5/raw/26c68320633242159631f263a35def193bc7c3a8/json.json")
    Call<JSONResponse> getJSON();
}
