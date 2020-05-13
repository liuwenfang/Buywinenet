package com.ccp.buywinenet.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.ccp.buywinenet.R;

import org.jetbrains.annotations.Nullable;

/**
 * 作者：刘小芳2020-05-12 16:33
 * 邮箱：ccpchick@163.com
 * desc：蜡笔小新的烦恼
 */
public class StatusBarHeightView  extends LinearLayout {
    private int statusBarHeight;
    private int type;

    public StatusBarHeightView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public StatusBarHeightView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public StatusBarHeightView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        init(attrs);


    }

    private void init(@Nullable AttributeSet attrs) {

        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if(resourceId>0) {
                statusBarHeight = getResources().getDimensionPixelSize(resourceId);
            }
        }else{
            //低版本 直接设置0
            statusBarHeight = 0;
        }
        if (attrs != null) {
            TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.StatusBarHeightView);
            type = typedArray.getInt(R.styleable.StatusBarHeightView_use_type, 0);
            typedArray.recycle();
        }
        if (type == 1) {
            setPadding(getPaddingLeft(), statusBarHeight, getPaddingRight(), getPaddingBottom());
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (type == 0) {
            setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec),
                    statusBarHeight);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
