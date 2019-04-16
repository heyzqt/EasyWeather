package com.heyzqt.easyweather.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.heyzqt.BaseFragment;
import com.heyzqt.easyweather.bean.Weather;
import com.heyzqt.easyweather.databinding.FragmentMainBinding;
import com.heyzqt.easyweather.net.Function;
import com.heyzqt.easyweather.net.RetrofitManager;

import org.json.JSONException;
import org.json.JSONObject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class MainFragment extends BaseFragment implements MainNavigator {
    private Context context;
    private View view;
    private static final String TAG = "MainFragment";
    private MainViewModel mMainViewModel;
    private FragmentMainBinding mMainBinding;
    private Gson gson = new Gson();

    public MainFragment() {
        // Requires empty public constructor
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = container.getContext();
        mMainBinding = FragmentMainBinding.inflate(inflater, container, false);

        mMainBinding.setView(this);

        mMainBinding.setViewmodel(mMainViewModel);
        mMainViewModel.setMainNavigator(this);


        View root = mMainBinding.getRoot();
//        DataBindingUtil.set
//                view = inflater.inflate(R.layout.fragment_main, container, false);
//        context = container.getContext();
        initContentView();
        return root;
    }

    public void setMainViewModel(MainViewModel viewModel) {
        this.mMainViewModel = viewModel;
    }

    private void initContentView() {

//        Call<String> call = RetrofitManager.getInstance().getRequestService().testHttp("101030100");
//
//        call.enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                Log.i("hello", "onResponse: ");
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//                Log.i("hello", "onFailure: ");
//            }
//        });
//        call.request();

        RetrofitManager.getInstance().getRequestService().testHttp("101030100")
                .subscribeOn(Schedulers.io())
                .map(new Function<Weather>(Weather.class))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Weather>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.i(TAG, "onSubscribe: ");
                    }

                    @Override
                    public void onNext(Weather weather) {
//                        Log.i(TAG, "onNext: data = " + data);
//                        try {
////                            String time = data.getString("time");
////                            Log.i(TAG, "onNext: " + time);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                        Weather weather = new Gson().fromJson(data, Weather.class);
                        mMainBinding.setWeather(weather);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG, "onError: ");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void onClick() {
        Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();
    }
}
