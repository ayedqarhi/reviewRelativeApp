package com.example.android.reviewrelativeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMsg(View view) {
        TextView textViewHello = (TextView) findViewById(R.id.hello_text_view);
        textViewHello.setText("Hello I am Ali");
    }
}
