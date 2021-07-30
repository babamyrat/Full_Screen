package com.example.fullscreen.Step4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.fullscreen.R;

public class Step4Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);

        //create TExtView
        textView = findViewById(R.id.txtText4);

        //Set text in TextView
        textView.setText("Hello Android");

        //Set Size in TextView
        textView.setTextSize(22);

    }
}