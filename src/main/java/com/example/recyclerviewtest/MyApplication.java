package com.example.recyclerviewtest;



import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * Created by TJTJL on 2017/9/11.
 *
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
