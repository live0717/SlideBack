package com.megabox.android.slide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.megabox.android.slide.sample.R;

public class MainActivity extends SlideBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setSlideable(false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_click_me).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
