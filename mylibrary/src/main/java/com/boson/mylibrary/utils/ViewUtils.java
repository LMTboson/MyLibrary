package com.boson.mylibrary.utils;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by boson.
 * time: 2018/11/18.
 * describe:
 */
public class ViewUtils {

    public static void setText(View view, CharSequence content) {
        if (view == null) {
            return;
        }
        if (TextUtils.isEmpty(content)) {
            view.setVisibility(View.GONE);
            return;
        }
        view.setVisibility(View.VISIBLE);
        if (view instanceof EditText) {
            ((EditText) view).setText(content);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(content);
        }
    }

}
