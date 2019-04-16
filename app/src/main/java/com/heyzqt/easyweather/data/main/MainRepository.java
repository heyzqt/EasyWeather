package com.heyzqt.easyweather.data.main;

import android.support.annotation.NonNull;

import com.heyzqt.easyweather.data.BaseRepository;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class MainRepository extends BaseRepository implements MainDataSource {

    private static MainRepository INSTANCE = null;

    private final MainDataSource mMainRemoteDataSource;

    private final MainDataSource mMainLocalDataSource;

    private MainRepository(@NonNull MainDataSource remoteDataSource,
                           @NonNull MainDataSource localDataSource) {
        super(remoteDataSource, localDataSource);
        mMainRemoteDataSource = checkNotNull(remoteDataSource);
        mMainLocalDataSource = checkNotNull(localDataSource);
    }

    public static MainRepository getInstance(MainDataSource remoteDataSource, MainDataSource localDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new MainRepository(remoteDataSource, localDataSource);
        }
        return INSTANCE;
    }
}
