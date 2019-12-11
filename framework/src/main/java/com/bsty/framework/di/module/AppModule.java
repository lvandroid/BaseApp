package com.bsty.framework.di.module;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.bsty.framework.BuildConfig;
import com.bsty.framework.R;
import com.bsty.framework.constants.AppConstants;
import com.bsty.framework.data.AppDatabase;
import com.bsty.framework.data.DataManager;
import com.bsty.framework.demo.AppApiHelper;
import com.bsty.framework.demo.AppDataManager;
import com.bsty.framework.demo.AppDbHelper;
import com.bsty.framework.demo.AppPreferencesHelper;
import com.bsty.framework.di.ApiInfo;
import com.bsty.framework.di.DatabaseInfo;
import com.bsty.framework.di.PreferenceInfo;
import com.bsty.framework.helper.ApiHeader;
import com.bsty.framework.helper.ApiHelper;
import com.bsty.framework.helper.DbHelper;
import com.bsty.framework.helper.PreferencesHelper;
import com.bsty.framework.rx.AppSchedulerProvider;
import com.bsty.framework.rx.SchedulerProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.github.inflationx.calligraphy3.CalligraphyConfig;

@Module
public class AppModule {

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.LIBRARY_PACKAGE_NAME;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(@DatabaseInfo String dbName, Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, dbName).fallbackToDestructiveMigration()
                .build();
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }


    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }


    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PreferencesHelper preferencesHelper) {
//        return new ApiHeader.ProtectedApiHeader(
//                apiKey,
//                preferencesHelper.getCurrentUserId(),
//                preferencesHelper.getAccessToken());
        return null;
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }
}
