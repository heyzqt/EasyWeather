package com.heyzqt.easyweather.net;

import com.google.gson.Gson;
import com.heyzqt.easyweather.bean.ResultData;

/**
 * Created by heyzqt on 2019/4/14.
 */
public class Function<T> implements io.reactivex.functions.Function<ResultData, T> {

    private Class mClass;
    private Gson gson = new Gson();

    public Function(Class mClass) {
        this.mClass = mClass;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T apply(ResultData response) throws Exception {
        if (response.getStatus() == 200) {
            return (T) gson.fromJson(response.getData().toString(), mClass);
        } else {
            throw new Exception(response.getMessage());
        }
    }
}
