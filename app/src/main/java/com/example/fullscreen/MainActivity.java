package com.example.fullscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fullscreen.Step1.BaseActivity;
import com.example.fullscreen.Step1.Step1Activity;
import com.example.fullscreen.Step2.Step2Activity;
import com.example.fullscreen.core.adapter.ExampleAdapter;
import com.example.fullscreen.core.model.ExampleModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnClick);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Step1Activity.class);
                startActivity(intent);
            }
        });



    }

}