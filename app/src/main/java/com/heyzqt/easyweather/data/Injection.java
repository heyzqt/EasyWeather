package com.heyzqt.easyweather.data;

import android.content.Context;
import android.support.annotation.NonNull;

import com.heyzqt.easyweather.data.main.MainLocalDataSource;
import com.heyzqt.easyweather.data.main.MainRemoteDataSource;
import com.heyzqt.easyweather.data.main.MainRepository;
import com.heyzqt.easyweather.net.schedulers.BaseSchedulerProvider;
import com.heyzqt.easyweather.net.schedulers.SchedulerProvider;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class Injection {

    public static MainRepository provideMainRepository(@NonNull Context context) {
        checkNotNull(context);
        return MainRepository.getInstance(MainRemoteDataSource.getInstance(context),
                MainLocalDataSource.getInstance(context));
    }

    public static BaseSchedulerProvider provideSchedulerProvider() {
        return SchedulerProvider.getInstance();
    }
}
