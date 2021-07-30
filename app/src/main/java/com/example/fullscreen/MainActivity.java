package com.example.fullscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


import com.example.fullscreen.Step1.BaseActivity;
import com.example.fullscreen.Step1.Step1Activity;
import com.example.fullscreen.Step10.Step10Activity;
import com.example.fullscreen.Step11.Step11Activity;
import com.example.fullscreen.Step12.Step12Activity;
import com.example.fullscreen.Step2.Step2Activity;
import com.example.fullscreen.Step3.Step3Activity;
import com.example.fullscreen.Step4.Step4Activity;
import com.example.fullscreen.Step5.Step5Activity;
import com.example.fullscreen.Step6.Step6Activity;
import com.example.fullscreen.Step7.Step7Activity;
import com.example.fullscreen.Step8.Step8Activity;
import com.example.fullscreen.Step9.Step9Activity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnClick);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Step12Activity.class);
            startActivity(intent);

        });

    }

}