package com.heyzqt.easyweather.net.schedulers;

import javax.annotation.Nonnull;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by heyzqt on 2019/4/11.
 */
public class SchedulerProvider implements BaseSchedulerProvider {

    private static SchedulerProvider INSTANCE;

    private SchedulerProvider() {

    }

    public static SchedulerProvider getInstance() {
        if (INSTANCE == null) {
            synchronized (SchedulerProvider.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SchedulerProvider();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @Override
    public Scheduler io() {
        return Schedulers.io();
    }

    @Nonnull
    @Override
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }
}