package com.bayin.hencoder.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/****************************************
 * 功能说明:  
 *
 * Author: Created by bayin on 2017/10/13.
 ****************************************/

public class NumberView extends LinearLayout {

    private int mThumbNumber = 0;

    public NumberView(Context context) {
        this(context, null);
    }

    public NumberView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NumberView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setWillNotDraw(false);
        setOrientation(HORIZONTAL);
        refreshView();
    }

    /**
     * 更新ui
     */
    private void refreshView() {
        removeAllViews();
        String num = String.valueOf(mThumbNumber);
        for (int i = 0; i < num.length(); i++) {
            TextView textView = new TextView(getContext());
            textView.setText(num.charAt(i) + "");
            addView(textView);
        }
    }

    private void setThumbNumber(int number) {
        this.mThumbNumber = number;
        refreshView();
    }

    /**
     * 赞增加
     */
    public void thumbAdd() {
        synchronized (NumberView.class) {
            mThumbNumber++;
        }
    }

    /**
     * 赞减少
     */
    public void thumbReduce() {
        synchronized (NumberView.class) {
            if (mThumbNumber == 0) return;
            mThumbNumber--;
        }
    }
}
