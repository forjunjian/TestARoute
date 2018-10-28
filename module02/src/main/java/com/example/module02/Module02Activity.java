package com.example.module02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;


/**
 * Created by forjun on 2018/10/28.
 */
@Route(path = "/module02/module02")
public class Module02Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module02);
    }

    public void routeTest(View v) {
        ARouter.getInstance().build("/main/main").navigation();
    }

}
