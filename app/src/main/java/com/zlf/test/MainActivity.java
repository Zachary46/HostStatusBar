package com.zlf.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zlf.widget.StatusBarHost;
import com.zlf.widget.StatusBarHostLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarHostLayout statusBarHost = StatusBarHost.inject(this)
                .setStatusBarImmersive(true)
                .setStatusBarWhiteText();
        findViewById(R.id.btOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statusBarHost.setViewFitsStatusBarView(findViewById(R.id.tvTwo));
            }
        });
    }
}