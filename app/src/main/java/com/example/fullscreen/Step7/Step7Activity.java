package com.example.fullscreen.Step7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.fullscreen.R;

public class Step7Activity extends AppCompatActivity {
    String[] countries = {"Hello", "Say", "World", "Codes", "Look me", "Say me"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step7);

//        countries = new String[]{"Hello", "Say", "World", "Codes", "Look me", "Say me"}

        //Me get element TextView
        TextView textView = findViewById(R.id.step7Text);

        //Me get element ListView
        ListView listView = findViewById(R.id.step7ListView);

        //Me create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, countries);
        //Me set for list adapter
        listView.setAdapter(adapter);

        //add for list listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // by position select element
                String selectedItem = countries[position];

                //set text element TextView
                textView.setText(selectedItem);

            }
        });




    }
}