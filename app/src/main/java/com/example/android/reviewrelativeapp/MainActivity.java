package com.example.android.reviewrelativeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMsg(View view) {
        TextView textViewHello = (TextView) findViewById(R.id.hello_text_view);
        textViewHello.setText("Hello I am Ali");
        Intent i = new Intent(this,InfoActivity.class);
        startActivity(i);
    }
    
}
