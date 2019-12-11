package com.bsty.baseapp.di;

import android.app.Application;
import android.content.Context;

import com.bsty.baseapp.R;
import com.bsty.framework.data.DataManager;
import com.bsty.framework.demo.AppDataManager;
import com.bsty.framework.rx.AppSchedulerProvider;
import com.bsty.framework.rx.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.github.inflationx.calligraphy3.CalligraphyConfig;

@Module
public class AppModule {

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
    DataManager provideDataManager(AppDataManager dataManager) {
        return dataManager;
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }
}
