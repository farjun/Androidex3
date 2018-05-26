package com.example.android.androidex3;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class SingleImageView extends android.support.v7.widget.AppCompatImageView {
    public SingleImageView(Context context) {
        super(context);
    }

    public SingleImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SingleImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressWarnings("SuspiciousNameCombination")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        // Dimensions will become (width x width)
        final int width = getMeasuredWidth();
        setMeasuredDimension(width, width);
    }
}
