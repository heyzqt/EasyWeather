package com.heyzqt.easyweather.ui;

import android.os.Bundle;

import com.heyzqt.easyweather.BaseActivity;
import com.heyzqt.easyweather.R;
import com.heyzqt.easyweather.ViewModelHolder;
import com.heyzqt.easyweather.data.Injection;
import com.heyzqt.easyweather.utils.ActivityUtils;

import javax.annotation.Nonnull;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";
    public static final String TASKDETAIL_VIEWMODEL_TAG = "TASKDETAIL_VIEWMODEL_TAG";
    private MainFragment mainFragment;
    private MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = findOrCreateViewFragment();
        mViewModel = findOrCreateViewModel();

        // Link View and ViewModel
        mainFragment.setMainViewModel(mViewModel);
    }

    @Nonnull
    private MainFragment findOrCreateViewFragment() {
        mainFragment = (MainFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    mainFragment, R.id.contentFrame);
        }
        return mainFragment;
    }

    private MainViewModel findOrCreateViewModel() {
        @SuppressWarnings("unchecked")
        ViewModelHolder<MainViewModel> retainedViewModel =
                (ViewModelHolder<MainViewModel>) getSupportFragmentManager().findFragmentByTag(TASKDETAIL_VIEWMODEL_TAG);

        if (retainedViewModel != null && retainedViewModel.getViewModel() != null) {
            return retainedViewModel.getViewModel();
        } else {
            MainViewModel viewModel = new MainViewModel(
                    getApplicationContext(),
                    Injection.provideMainRepository(getApplicationContext()));

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    ViewModelHolder.createContainer(viewModel),
                    TASKDETAIL_VIEWMODEL_TAG);
            return viewModel;
        }
    }
}
