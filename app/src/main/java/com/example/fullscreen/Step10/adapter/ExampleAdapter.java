package com.example.fullscreen.Step10.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.fullscreen.R;
import com.example.fullscreen.Step10.model.ExampleModel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ExampleAdapter extends ArrayAdapter<ExampleModel> {
private LayoutInflater inflater;
private int layout;
private List<ExampleModel> dateList;

    public ExampleAdapter(@NonNull @NotNull Context context, int resource,  List<ExampleModel> dateList) {
        super(context, resource);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        this.dateList = dateList;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);


        ImageView flagView = view.findViewById(R.id.step9Image);
        TextView nameView = view.findViewById(R.id.step9text1);
        TextView capitalView = view.findViewById(R.id.step9text2);

        ExampleModel eDateList = dateList.get(position);
        flagView.setImageResource(eDateList.getFlagResource());
        nameView.setText(eDateList.getName());
        capitalView.setText(eDateList.getCapital());

        return view;

    }
}
