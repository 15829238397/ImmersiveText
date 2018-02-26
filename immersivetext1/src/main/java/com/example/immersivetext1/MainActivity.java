package com.example.immersivetext1;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_main);

        //判断是不是５．０以上的系统
        if(Build.VERSION.SDK_INT >= 21){

            //表示会让应用的主体内容占用系统状态栏的空间，最后再调用Window的setStatusBarColor()方法
            //将状态栏设置成透明色就可以了。
            View decorView = getWindow().getDecorView() ;
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE ;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);

            ActionBar actionBar = getSupportActionBar() ;
            actionBar.hide();
        }

    }
}
