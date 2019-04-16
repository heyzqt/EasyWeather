package com.heyzqt.easyweather.data.main;

import android.content.Context;

import com.heyzqt.easyweather.data.BaseLocalDataSource;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class MainLocalDataSource extends BaseLocalDataSource implements MainDataSource {

    private static MainLocalDataSource INSTANCE;

    private MainLocalDataSource(@Nonnull Context context) {
        super(context);
        checkNotNull(context);
    }

    public static MainLocalDataSource getInstance(@Nonnull Context context) {
        if (INSTANCE == null) {
            INSTANCE = new MainLocalDataSource(context);
        }
        return INSTANCE;
    }
}
