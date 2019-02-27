package com.crashlytics.fhashemian.crashlyticssample;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

public class CrashlyticsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());

        Crashlytics.setUserIdentifier("1292");
    }
}
