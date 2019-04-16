package com.heyzqt.easyweather.net.schedulers;

import javax.annotation.Nonnull;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;

/**
 * Created by heyzqt on 2019/4/11.
 */
public interface BaseSchedulerProvider {

    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @Nonnull
    Scheduler ui();
}
