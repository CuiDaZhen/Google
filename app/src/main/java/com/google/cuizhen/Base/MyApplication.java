package com.google.cuizhen.Base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by dell on 2017/7/8.
 */

public class MyApplication extends Application {

    private Handler mainThreadHandler;
    private Context mContext;
    private int mMainThreadId;

    @Override
    public void onCreate() {//程序的入口方法
        //上下文
        mContext = getApplicationContext();

        //主线程的Handler
        mainThreadHandler = new Handler();
        //主线程的线程id
            /*
            * myTid:Thread
            * myPid:Process
            * myUid:User
            * */
        mMainThreadId = android.os.Process.myTid();

        super.onCreate();
    }
}
