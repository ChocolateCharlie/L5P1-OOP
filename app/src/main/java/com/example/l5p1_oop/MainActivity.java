package com.example.l5p1_oop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.util.TypedValue.COMPLEX_UNIT_SP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView((this));

        textView.setText("Hello, World !");
        textView.setTextColor(0xFFFF0000);
        textView.setTextSize(COMPLEX_UNIT_SP, 72);

        setContentView(textView);
    }
}
