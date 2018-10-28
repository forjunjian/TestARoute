package com.example.module01;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by forjun on 2018/10/28.
 */
@Route(path = "/module/module01")
public class Module01Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module01);
    }

    public void routeTest(View v) {
        ARouter.getInstance().build("/main/main").navigation();
    }

}
