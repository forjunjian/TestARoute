package com.example.forjun.aroute.act;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.forjun.aroute.R;

@Route(path = "/main/main")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void routeTest01(View v) {
        ARouter.getInstance().build("/module/module01").navigation();
    }

    public void routeTest02(View v) {
        ARouter.getInstance().build("/module02/module02").navigation();
    }
}
