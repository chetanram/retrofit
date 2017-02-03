package com.retrofit;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by agc-android on 3/2/17.
 */

public interface ApiInterface {
    @FormUrlEncoded
    @POST("?")
    Call<DataModel> getLotteryList(@FieldMap HashMap<String,String> param);

}
