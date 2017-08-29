package com.liuguangqiang.swiplebacksample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.widget.HorizontalScrollView;
import com.liuguangqiang.swipeback.SwipeBackActivity;

/**
 * auther: baiiu
 * time: 17/8/28 28 22:52
 * description:
 */
public class MultiViewActivity extends SwipeBackActivity {

    private HorizontalScrollView mHorizontalView;
    private RecyclerView mRecyclerView;
    private ViewPager mViewPager;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutiview);
        mHorizontalView = (HorizontalScrollView) findViewById(R.id.horizontalView);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycleView);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
    }

}
