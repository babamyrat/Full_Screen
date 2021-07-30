package com.example.fullscreen.Step9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.fullscreen.R;
import com.example.fullscreen.Step9.adapter.StateAdapter;
import com.example.fullscreen.Step9.model.StateModel;

import java.util.ArrayList;

public class Step9Activity extends AppCompatActivity {

    ArrayList<StateModel> states = new ArrayList();
    ListView countriesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step9);
        // начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        countriesList = (ListView) findViewById(R.id.step9ListView);
        // создаем адаптер
        StateAdapter stateAdapter = new StateAdapter(this, R.layout.list_item9, states);
        // устанавливаем адаптер
        countriesList.setAdapter(stateAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                StateModel selectedState = (StateModel) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedState.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        countriesList.setOnItemClickListener(itemListener);
    }
    private void setInitialData(){
        states.add(new StateModel ("Бразилия", "Бразилиа", R.drawable.ic_launcher_background));
        states.add(new StateModel ("Аргентина", "Буэнос-Айрес", R.drawable.ic_launcher_background));
        states.add(new StateModel ("Колумбия", "Богота", R.drawable.ic_launcher_background));
        states.add(new StateModel ("Уругвай", "Монтевидео", R.drawable.ic_launcher_background));
        states.add(new StateModel ("Чили", "Сантьяго", R.drawable.ic_launcher_background));
        states.add(new StateModel ("Колумбия", "Богота", R.drawable.ic_launcher_background));
        states.add(new StateModel ("Уругвай", "Монтевидео", R.drawable.ic_launcher_background));
        states.add(new StateModel ("Чили", "Сантьяго", R.drawable.ic_launcher_background));
    }
}

