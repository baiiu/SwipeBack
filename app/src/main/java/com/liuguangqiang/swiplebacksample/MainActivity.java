package com.liuguangqiang.swiplebacksample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_common).setOnClickListener(this);
        findViewById(R.id.btn_ListView).setOnClickListener(this);
        findViewById(R.id.btn_viewpager).setOnClickListener(this);
        findViewById(R.id.btn_webview).setOnClickListener(this);
        findViewById(R.id.btn_mutiView).setOnClickListener(this);
    }

    @Override public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_common:
                skipActivity(CommonActivity.class);
                break;
            case R.id.btn_ListView:
                skipActivity(ListViewActivity.class);
                break;
            case R.id.btn_viewpager:
                skipActivity(ViewPagerActivity.class);
                break;
            case R.id.btn_webview:
                skipActivity(WebViewActivity.class);
                break;
            case R.id.btn_mutiView:
                skipActivity(MultiViewActivity.class);
                break;
        }
    }


    private void skipActivity(Class<?> classOf) {
        Intent intent = new Intent(this, classOf);
        startActivity(intent);
    }

}
