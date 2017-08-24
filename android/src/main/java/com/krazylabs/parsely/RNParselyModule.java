
package com.krazylabs.parsely;

import android.support.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import com.parsely.parselyandroid.*;


public class RNParselyModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "RNParsely";
    private static ReactApplicationContext reactContext = null;

    public RNParselyModule(ReactApplicationContext context) {
        super(context);
        this.reactContext = context;

    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void track (String url) {
        ParselyTracker.sharedInstance("thekrazycouponlady.com", this.reactContext).trackURL(url);
    }
}
