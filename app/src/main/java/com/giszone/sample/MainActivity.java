package com.giszone.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.giszone.tsnackbar.R;
import com.giszone.tsnackbar.TSnackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TSnackbar.show(this, "这是示例！");
    }

}
