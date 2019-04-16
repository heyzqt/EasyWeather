package com.heyzqt.easyweather.data.main;

import android.content.Context;

import com.heyzqt.easyweather.data.BaseRemoteDataSource;

import javax.annotation.Nonnull;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class MainRemoteDataSource extends BaseRemoteDataSource implements MainDataSource {

    private static MainRemoteDataSource INSTANCE;

    private MainRemoteDataSource(@Nonnull Context context) {
        super(context);
    }

    public static MainRemoteDataSource getInstance(@Nonnull Context context) {
        if (INSTANCE == null) {
            INSTANCE = new MainRemoteDataSource(context);
        }
        return INSTANCE;
    }
}
