package com.example.pengbo.immersivetext;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_main);

        //ecorView是window中的最顶层view，可以从window中获取到decorView，
        // 然后decorView有个getWindowVisibleDisplayFrame方法可以获取到程序显示的区域，包括标题栏，但不包括状态栏。
        //下面是程序使得图片可以全屏显示
        View decorView = getWindow().getDecorView() ;
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN ;
        decorView.setSystemUiVisibility(option);

        //decorView　不能干涉到actionbar 所以下面要对actionbar进行隐藏.
        //隐藏显示actionbar
        ActionBar actionBar = getSupportActionBar() ;
        actionBar.hide();


    }
}
