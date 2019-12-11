package com.bsty.framework.demo;

import com.bsty.framework.data.DataManager;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager {
    @Inject
    public AppDataManager() {
    }
}
