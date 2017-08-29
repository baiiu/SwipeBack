package com.liuguangqiang.swiplebacksample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swiplebacksample.adapter.TestAdapter;

/**
 * auther: baiiu
 * time: 17/8/28 28 22:52
 * description:
 */
public class MultiViewActivity extends SwipeBackActivity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutiview);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycleView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mRecyclerView.setAdapter(new RecyclerView.Adapter() {
            @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View inflate = View.inflate(parent.getContext(), R.layout.item_test, null);
                return new ItemViewHolder(inflate);
            }

            @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            }

            @Override public int getItemCount() {
                return 10;
            }
        });

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TestAdapter adapter = new TestAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    private static class ItemViewHolder extends RecyclerView.ViewHolder {
        ItemViewHolder(View itemView) {
            super(itemView);
        }
    }

}
