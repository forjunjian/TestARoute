package com.example.forjun.aroute.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by forjun on 2018/10/28.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug()) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this);
    }

    public boolean isDebug() {
        return true;
    }
}
