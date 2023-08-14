package com.example.fifthproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
    }

    public void increaseCount(View view) {
        count++;
        textView.setText(String.valueOf(count));
    }

    public void decreaseCount(View view) {
        count--;
        textView.setText(String.valueOf(count));
    }
}