package com.example.fullscreen.Step3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.fullscreen.R;

public class Step3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);


    }
    // Two methods of class MainActivity in the file MainActivity.java.

    public void clickSprinkles(View view) {
        CheckBox checkBox = (CheckBox) view;
        String message;
        if (checkBox.isChecked()) {
            message = "Thanks for selecting sprinkles.";
        } else {
            message = "Thanks for not selecting sprinkles.";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void clickCherry(View view) {
        CheckBox checkBox = (CheckBox) view;
        int resourceId;
        if (checkBox.isChecked()) {
            resourceId = R.string.cherry;
        } else {
            resourceId = R.string.no_cherry;
        }
        checkBox.setText(getString(resourceId));
    }
}