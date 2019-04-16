package com.heyzqt.easyweather.data;

import android.support.annotation.NonNull;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by heyzqt on 2019/4/13.
 */
public class BaseRepository implements BaseDataSource {

    private static BaseRepository INSTANCE = null;

    private final BaseDataSource mRemoteDataSource;

    private final BaseDataSource mLocalDataSource;

    public BaseRepository(@NonNull BaseDataSource remoteDataSource,
                          @NonNull BaseDataSource localDataSource) {
        mRemoteDataSource = checkNotNull(remoteDataSource);
        mLocalDataSource = checkNotNull(localDataSource);
    }

    private static BaseRepository getInstance(@Nonnull BaseDataSource remoteDataSource,
                                              @NonNull BaseDataSource localDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new BaseRepository(remoteDataSource, localDataSource);
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
