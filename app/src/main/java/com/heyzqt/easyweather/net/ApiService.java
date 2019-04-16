package com.heyzqt.easyweather.net;

import com.heyzqt.easyweather.bean.ResultData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by heyzqt on 2019/4/11.
 */
public interface ApiService {

//    @GET("weather/city/{city_code}")
//    Call<String> testHttp(@Path("city_code") String cityCode);

    @GET("weather/city/{city_code}")
    Observable<ResultData> testHttp(@Path("city_code") String cityCode);

//    @GET("weather/city/{city_code}")
//    Observable<Weather> testHttp(@Path("city_code") String cityCode);
}
