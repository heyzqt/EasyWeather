package com.heyzqt.easyweather.ui;

import android.content.Context;

import com.heyzqt.easyweather.BaseViewModel;
import com.heyzqt.easyweather.data.main.MainRepository;

import javax.annotation.Nonnull;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class MainViewModel extends BaseViewModel {

    @Nonnull
    private MainNavigator mMainNavigator;

    public MainViewModel(Context context, MainRepository mainRepository) {
        super(context, mainRepository);
    }

    public void setMainNavigator(@Nonnull MainNavigator mainNavigator) {
        this.mMainNavigator = mainNavigator;
    }

    public void onActivityDestroyed() {
        // Clear references to avoid potential memory leaks.
        mMainNavigator = null;
    }

    public void onClick() {
        if (mMainNavigator != null) {
            mMainNavigator.onClick();
        }
    }
}
