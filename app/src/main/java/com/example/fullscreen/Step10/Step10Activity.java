package com.example.fullscreen.Step10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.fullscreen.R;
import com.example.fullscreen.Step10.model.ExampleModel;
import com.example.fullscreen.Step10.adapter.ExampleAdapter;


import java.util.ArrayList;

public class Step10Activity extends AppCompatActivity {

    ArrayList<ExampleModel> states = new ArrayList();
    ListView countriesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step10);
        // начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        countriesList = (ListView) findViewById(R.id.step10LIstView);
        // создаем адаптер
        ExampleAdapter stateAdapter = new ExampleAdapter(this, R.layout.list_item9, states);
        // устанавливаем адаптер
        countriesList.setAdapter(stateAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                ExampleModel selectedState = (ExampleModel) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedState.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        countriesList.setOnItemClickListener(itemListener);
    }
    private void setInitialData(){
        states.add(new ExampleModel ("Бразилия", "Бразилиа", R.drawable.ic_launcher_background));
        states.add(new ExampleModel ("Аргентина", "Буэнос-Айрес", R.drawable.ic_launcher_background));
        states.add(new ExampleModel ("Колумбия", "Богота", R.drawable.ic_launcher_background));
        states.add(new ExampleModel ("Уругвай", "Монтевидео", R.drawable.ic_launcher_background));
        states.add(new ExampleModel ("Чили", "Сантьяго", R.drawable.ic_launcher_background));
        states.add(new ExampleModel ("Колумбия", "Богота", R.drawable.ic_launcher_background));
        states.add(new ExampleModel ("Уругвай", "Монтевидео", R.drawable.ic_launcher_background));
        states.add(new ExampleModel ("Чили", "Сантьяго", R.drawable.ic_launcher_background));
    }
}
