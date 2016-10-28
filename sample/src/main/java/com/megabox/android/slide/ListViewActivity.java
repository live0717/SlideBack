package com.megabox.android.slide;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

/**
 * @author lihong
 * @since 2016/10/28
 */
public class ListViewActivity extends SlideBackActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(30);
        textView.setBackgroundColor(Color.parseColor("#eeff0000"));
        textView.setText("This is TEXTVIEW");
        textView.setTextColor(Color.WHITE);
        setContentView(textView);
    }
}
