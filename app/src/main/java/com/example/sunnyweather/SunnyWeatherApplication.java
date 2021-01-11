package com.example.sunnyweather;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
      public static final String TOKEN = "kFDw0bLOHWLHhxRC";
      @SuppressLint("StaticFieldLeak")
      public static Context context;

      @Override
      public void onCreate() {
            super.onCreate();
            context=getApplicationContext();
      }
}
