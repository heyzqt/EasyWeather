package com.heyzqt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.heyzqt.easyweather.BaseActivity;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class BaseFragment extends Fragment {
    public BaseActivity base;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        base = (BaseActivity) getActivity();
    }
}
