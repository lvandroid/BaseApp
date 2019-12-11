package com.bsty.baseapp.ui.main;

import com.bsty.framework.base.BaseViewModel;
import com.bsty.framework.data.DataManager;
import com.bsty.framework.rx.SchedulerProvider;

public class MainViewModel extends BaseViewModel<MainNavigator> {
    public MainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
