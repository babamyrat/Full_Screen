package com.example.fullscreen.Step2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fullscreen.R;

public class Step2Activity extends AppCompatActivity {

    String[] countries = {"hello", "Bye", "Hi", "World", "Words", "Man"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);

        //set element ListView
        ListView listView = findViewById(R.id.listView);

        //crete adapter
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, countries);

        // set for list adapter
        listView.setAdapter(adapter);
    }
}