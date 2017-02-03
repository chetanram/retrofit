package com.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        HashMap<String,String> param = new HashMap<>();
        param.put("action","get_lottery_list");
        Call<DataModel> call  = apiService.getLotteryList(param);
        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {


                DataModel dataModel =  response.body();

                Log.e("success","success");
            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {
                Log.e("fail","fail");
            }
        });
    }
}
