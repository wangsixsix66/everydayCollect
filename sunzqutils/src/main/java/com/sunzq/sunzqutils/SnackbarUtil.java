package com.sunzq.sunzqutils;

import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author sunzq
 * @time 2016/10/10 16:01
 * @des ${Snackbar 自定义使用}
 */
public class SnackbarUtil {

    public static Snackbar obtainSnackbar(View view, String message) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
        return snackbar;
    }

    /**
     * 设置Snackbar Button颜色
     *
     * @param snackbar
     * @param ButtonColor
     */
    public static void setSnackbarButtonColor(Snackbar snackbar, int ButtonColor) {
        View view = snackbar.getView();
        if (view != null) {
            ((Button)view.findViewById(R.id.snackbar_action)).setTextColor(ButtonColor);
        }
    }

    /**
     * 设置Snackbar文本颜色
     * @param snackbar
     * @param messageColor
     */
    public static void setSnackbarTextColor(Snackbar snackbar, int messageColor) {
        View view = snackbar.getView();
        if (view != null) {
            ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(messageColor);
        }
    }

    /**
     * 设置Snackbar背景颜色
     *
     * @param snackbar
     * @param backgroundColor
     */
    public static void setSnackbarBackgroundColor(Snackbar snackbar, int backgroundColor) {
        View view = snackbar.getView();
        if (view != null) {
            view.setBackgroundColor(backgroundColor);
        }
    }
    /**
     * 设置Snackbar文字和背景颜色
     * @param snackbar
     * @param messageColor
     * @param backgroundColor
     */
    public static void setSnackbarColor(Snackbar snackbar, int messageColor, int backgroundColor) {
        setSnackbarBackgroundColor(snackbar,backgroundColor);
        setSnackbarTextColor(snackbar,messageColor);
    }

    /**
     * 设置Snackbar文字和背景颜色和点击按钮的颜色
     * @param snackbar
     * @param messageColor
     * @param ButtonColor
     * @param backgroundColor
     */
    public static void setSnackbarAllColor(Snackbar snackbar, int messageColor,int ButtonColor, int backgroundColor) {
        setSnackbarBackgroundColor(snackbar,backgroundColor);
        setSnackbarTextColor(snackbar,messageColor);
        setSnackbarButtonColor(snackbar,ButtonColor);
    }

    //======== 分割线 ========//
    /**
     * 短显示Snackbar，设置背景颜色Color.parseColor("#ffce43")
     *
     * @param view
     * @param message
     * @param color
     * @return
     */
    public static Snackbar ShortSnackbar(View view, String message, int color) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
        setSnackbarBackgroundColor(snackbar,color);
        return snackbar;
    }

    /**
     * 长显示Snackbar，可设置背景颜色Color.parseColor("#ffce43")
     *
     * @param view
     * @param message
     * @param color
     * @return
     */
    public static Snackbar LongSnackbar(View view, String message, int color) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        setSnackbarBackgroundColor(snackbar,color);
        return snackbar;
    }

    /**
     * 自定义时常显示Snackbar，设置背景颜色Color.parseColor("#ffce43")
     *
     * @param view
     * @param message
     * @param color
     * @return
     */
    public static Snackbar IndefiniteSnackbar(View view, String message, int duration, int color) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).setDuration
                (duration);
        setSnackbarBackgroundColor(snackbar,color);
        return snackbar;
    }

    //======== 分割线 ========//
    /**
     * 短显示Snackbar，自定义背景和文字颜色
     *
     * @param view
     * @param message
     * @param messageColor
     * @param backgroundColor
     * @return
     */
    public static Snackbar ShortSnackbar(View view, String message, int messageColor, int
            backgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
        setSnackbarColor(snackbar, messageColor, backgroundColor);
        return snackbar;
    }

    /**
     * 长显示Snackbar，自定义背景和文字颜色
     *
     * @param view
     * @param message
     * @param messageColor
     * @param backgroundColor
     * @return
     */
    public static Snackbar LongSnackbar(View view, String message, int messageColor, int
            backgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        setSnackbarColor(snackbar, messageColor, backgroundColor);
        return snackbar;
    }

    /**
     * 自定义时常显示Snackbar，自定义背景和文字颜色
     *
     * @param view
     * @param message
     * @param messageColor
     * @param backgroundColor
     * @return
     */
    public static Snackbar IndefiniteSnackbar(View view, String message, int duration, int
            messageColor, int backgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).setDuration
                (duration);
        setSnackbarColor(snackbar, messageColor, backgroundColor);
        return snackbar;
    }

    //======== 分割线 ========//


    /**
     * 短显示Snackbar，自定义背景和文字颜色和Button颜色
     * @param view
     * @param message
     * @param messageColor
     * @param buttonColor
     * @param backgroundColor
     * @return
     */
    public static Snackbar ShortSnackbar(View view, String message, int messageColor,int buttonColor, int
            backgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
        setSnackbarAllColor(snackbar,messageColor,buttonColor,backgroundColor);
        return snackbar;
    }


    /**
     * 长显示Snackbar，自定义背景和文字颜色和Button颜色
     * @param view
     * @param message
     * @param messageColor
     * @param buttonColor
     * @param backgroundColor
     * @return
     */
    public static Snackbar LongSnackbar(View view, String message, int messageColor,int buttonColor, int
            backgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        setSnackbarAllColor(snackbar,messageColor,buttonColor,backgroundColor);
        return snackbar;
    }


    /**
     * 自定义时常显示Snackbar，自定义背景和文字颜色和Button颜色
     * @param view
     * @param message
     * @param buttonColor
     * @param duration
     * @param messageColor
     * @param backgroundColor
     * @return
     */
    public static Snackbar IndefiniteSnackbar(View view, String message,int buttonColor, int duration, int
            messageColor, int backgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).setDuration(duration);
        setSnackbarAllColor(snackbar,messageColor,buttonColor,backgroundColor);
        return snackbar;
    }

    //======== 分割线 ========//


    /**
     * 向Snackbar中添加view
     *
     * @param snackbar
     * @param layoutId
     * @param index    新加布局在Snackbar中的位置
     */
    public static void SnackbarAddView(Snackbar snackbar,int layoutId,int index) {
        View snackbarview = snackbar.getView();//获取snackbar的View(其实就是SnackbarLayout)

        Snackbar.SnackbarLayout snackbarLayout=(Snackbar.SnackbarLayout)snackbarview;//将获取的View转换成SnackbarLayout

        View add_view = LayoutInflater.from(snackbarview.getContext()).inflate(layoutId,null);//加载布局文件新建View

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);//设置新建布局参数

        p.gravity= Gravity.CENTER_VERTICAL;//设置新建布局在Snackbar内垂直居中显示

        snackbarLayout.addView(add_view,index,p);//将新建布局添加进snackbarLayout相应位置
    }
}
