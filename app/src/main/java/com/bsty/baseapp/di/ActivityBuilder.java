package com.bsty.baseapp.di;

import com.bsty.baseapp.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
