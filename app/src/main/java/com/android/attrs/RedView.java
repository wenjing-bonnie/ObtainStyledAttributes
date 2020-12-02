package com.android.attrs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * Created by wenjing.liu on 2020/12/1 in J1.
 *
 * @author wenjing.liu
 */
public class RedView extends View {

    private final String TAG = "RedView";


    public RedView(Context context) {
        this(context, null);
    }

    public RedView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RedView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public RedView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initAttribute(attrs, defStyleAttr, defStyleRes);
    }


    private void initAttribute(AttributeSet attrs, int defStyleAttr, int defStyleRes) {


        if (attrs == null) {
            return;
        }

        int[] attrsArray = new int[]{android.R.attr.layout_width, android.R.attr.background};

        TypedArray array = getContext().obtainStyledAttributes(attrs, attrsArray);
        if (array == null) {
            return;
        }

        int width = getMeasuredWidth();
        Log.d(TAG, "initAttribute width = " + width);
        int layout_width = array.getLayoutDimension(0, -1);
        Log.d(TAG, "initAttribute getLayout width = " + layout_width);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        Log.d(TAG, "onMeasure width = " + width);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
