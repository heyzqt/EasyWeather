package com.heyzqt.easyweather.net;

import com.heyzqt.easyweather.StaticConstant;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by heyzqt on 2019/4/11.
 */
public class RetrofitManager {

    private static RetrofitManager mInstance;
    private Retrofit retrofit;

    public static RetrofitManager getInstance() {
        if (mInstance == null) {
            synchronized (RetrofitManager.class) {
                if (mInstance == null) {
                    mInstance = new RetrofitManager();
                }
            }
        }
        return mInstance;
    }

    public Retrofit getRetrofit() {
        if (retrofit == null) {
            synchronized (RetrofitManager.class) {
                if (retrofit == null) {
                    retrofit = new Retrofit.Builder()
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .baseUrl(StaticConstant.BASE_API)
                            .build();
                }
            }
        }
        return retrofit;
    }

    public ApiService getRequestService() {
        return getRetrofit().create(ApiService.class);
    }
}
