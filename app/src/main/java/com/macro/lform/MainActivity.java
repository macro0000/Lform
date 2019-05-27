package com.macro.lform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.macro.lformcore.base.BaseList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView =  findViewById(R.id.show);
        BaseList baseList = new BaseList(null);
        baseList.build();
    }
}
