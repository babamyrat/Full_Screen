package com.example.fullscreen.Step6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fullscreen.R;

public class Step6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step6);

        //Me get element ListView
        ListView listView = findViewById(R.id.listView);

        //Me set resource
        String[] countries = getResources().getStringArray(R.array.countries);

        //Me create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, countries);

       //Me set for list adapter
        listView.setAdapter(adapter);

    }

}