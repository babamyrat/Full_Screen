package com.example.fullscreen.Step12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.fullscreen.R;



import java.util.ArrayList;

public class Step12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step12);

        ArrayList<ExampleModel> products = new ArrayList<ExampleModel>();
        if(products.size()==0){
            products.add(new ExampleModel("Картофель", "кг."));
            products.add(new ExampleModel("Чай", "шт."));
            products.add(new ExampleModel("Яйца", "шт."));
            products.add(new ExampleModel("Молоко", "л."));
            products.add(new ExampleModel("Макароны", "кг."));
        }
        ListView productList = (ListView) findViewById(R.id.step12ListView);
        ExampleAdapter adapter = new ExampleAdapter(this, R.layout.list_item12, products);
        productList.setAdapter(adapter);
    }
}