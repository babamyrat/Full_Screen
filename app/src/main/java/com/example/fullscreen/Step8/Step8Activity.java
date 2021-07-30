package com.example.fullscreen.Step8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.fullscreen.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Step8Activity extends AppCompatActivity {
    ArrayList<String> users = new ArrayList<>();
    ArrayList<String> selectedUsers = new ArrayList<>();
    ArrayAdapter<String> adapter;
    ListView usersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step8);

        // add begin element
        Collections.addAll(users, "hello", "heard", "world", "this", "Margin");

        //get element ListView
        usersList = findViewById(R.id.step8ListView);

        //create adapter
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, users);

        //Me set for list adapter
        usersList.setAdapter(adapter);

        //treatment set and un marking in list
        usersList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //set pressed element
                String user = adapter.getItem(position);
                if (usersList.isItemChecked(position))
                    selectedUsers.add(user);
                else
                    selectedUsers.remove(user);
            }
        });

    }
    public void add(View view){
        EditText userName = findViewById(R.id.step8EditText);
        String user = userName.getText().toString();
        if (!user.isEmpty()){
            adapter.add(user);
            userName.setText("");
            adapter.notifyDataSetChanged();
        }
    }
    public void remove(View view){
        //Me get and remove highlighted items
        for (int i=0; i<selectedUsers.size(); i++){
            adapter.remove(selectedUsers.get(i));
        }

        //take off all previously set marks
        usersList.clearChoices();
        //clear the array of selected objects
        selectedUsers.clear();
        adapter.notifyDataSetChanged();
    }
}