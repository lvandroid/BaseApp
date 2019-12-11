package com.bsty.framework.demo;

import com.bsty.framework.helper.ApiHeader;
import com.bsty.framework.helper.ApiHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppApiHelper implements ApiHelper {
    private ApiHeader mApiHeader;

    @Inject
    public AppApiHelper(ApiHeader apiHeader) {
        this.mApiHeader = apiHeader;
    }

}
