package com.liuguangqiang.swipeback;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Eric on 15/3/3.
 */
public class SwipeBackActivity extends AppCompatActivity implements SwipeBackLayout.SwipeBackListener {

    private static final SwipeBackLayout.DragEdge DEFAULT_DRAG_EDGE = SwipeBackLayout.DragEdge.LEFT;

    private SwipeBackLayout swipeBackLayout;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(getContainer());
        View view = LayoutInflater.from(this).inflate(layoutResID, null);
        swipeBackLayout.addView(view);
    }

    private View getContainer() {
        swipeBackLayout = new SwipeBackLayout(this);
        swipeBackLayout.setDragEdge(DEFAULT_DRAG_EDGE);
        swipeBackLayout.setOnSwipeBackListener(this);
        return swipeBackLayout;
    }

    public void setEnableSwipe(boolean enableSwipe) {
        swipeBackLayout.setEnablePullToBack(enableSwipe);
    }

    public void setDragEdge(SwipeBackLayout.DragEdge dragEdge) {
        swipeBackLayout.setDragEdge(dragEdge);
    }

    public SwipeBackLayout getSwipeBackLayout() {
        return swipeBackLayout;
    }

    @Override
    public void onViewPositionChanged(float fractionAnchor, float fractionScreen) {
    }

}
