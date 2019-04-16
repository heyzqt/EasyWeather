package com.heyzqt.easyweather;

import android.content.Context;
import android.databinding.BaseObservable;

import com.heyzqt.easyweather.data.BaseRepository;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class BaseViewModel extends BaseObservable {

    private final Context mContext;

    private final BaseRepository mBaseRepository;

    public BaseViewModel(Context context, BaseRepository baseRepository) {
        mContext = context.getApplicationContext();
        mBaseRepository = baseRepository;
    }
}
