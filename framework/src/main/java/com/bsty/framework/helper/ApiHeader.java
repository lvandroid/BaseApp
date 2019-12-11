package com.bsty.framework.helper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ApiHeader {

    private ProtectedApiHeader mProtectedApiHeader;

    @Inject
    public ApiHeader(ProtectedApiHeader protectedApiHeader) {
        this.mProtectedApiHeader = protectedApiHeader;
    }

    public static final class ProtectedApiHeader {
        @Expose
        @SerializedName("access_token")
        private String mAccessToken;

        @Expose
        @SerializedName("api_key")
        private String mApiKey;

        public ProtectedApiHeader(String mAccessToken, String mApiKey) {
            this.mAccessToken = mAccessToken;
            this.mApiKey = mApiKey;
        }

        public String getmAccessToken() {
            return mAccessToken;
        }

        public void setmAccessToken(String mAccessToken) {
            this.mAccessToken = mAccessToken;
        }

        public String getmApiKey() {
            return mApiKey;
        }

        public void setmApiKey(String mApiKey) {
            this.mApiKey = mApiKey;
        }
    }
}
