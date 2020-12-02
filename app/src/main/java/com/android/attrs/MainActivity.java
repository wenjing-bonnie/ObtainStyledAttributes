package com.android.attrs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootLayout = findViewById(R.id.ll_root_layout);
        //获取系统资源id
        int layoutRes = getResources().getIdentifier("transient_notification", "layout", "android");

        View notView = LayoutInflater.from(MainActivity.this).inflate(layoutRes, null);

        rootLayout.addView(notView);
    }


    public void animationDrawable(){
//        int[] RES_IDS = new int[]{
//                R.drawable.loading_1840000,
//                R.drawable.loading_1840001,
//                R.drawable.loading_1840002,
//                R.drawable.loading_1840003,
//                R.drawable.loading_1840004,
//                R.drawable.loading_1840005,
//                R.drawable.loading_1840006,
//                R.drawable.loading_1840007,
//                R.drawable.loading_1840008
//        };

        AnimationDrawable drawable = new AnimationDrawable();
        //drawable.in
        drawable.start();
    }
}