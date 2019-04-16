package com.heyzqt.easyweather.data;

import android.content.Context;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class BaseRemoteDataSource implements BaseDataSource {

    private Context mContext;

    public BaseRemoteDataSource(@Nonnull Context context) {
        mContext = checkNotNull(context);
    }
}
