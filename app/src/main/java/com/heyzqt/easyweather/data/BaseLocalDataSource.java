package com.heyzqt.easyweather.data;

import android.content.Context;
import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class BaseLocalDataSource implements BaseDataSource {

    private Context mContext;

    public BaseLocalDataSource(@NonNull Context context) {
        mContext = checkNotNull(context);
    }
}
