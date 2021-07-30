package com.example.fullscreen.Step9.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.fullscreen.R;
import com.example.fullscreen.Step9.model.StateModel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StateAdapter extends ArrayAdapter<StateModel> {

    private LayoutInflater inflater;
    private int layout;
    private List<StateModel> stateModels;

    public StateAdapter(Context context, int resource, List<StateModel> stateModels) {
        super(context, resource, stateModels);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        this.stateModels = stateModels;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(this.layout, parent, false);

        ImageView flagView = view.findViewById(R.id.step9Image);
        TextView nameView = view.findViewById(R.id.step9text1);
        TextView capitalView = view.findViewById(R.id.step9text2);

        StateModel stateModel = stateModels.get(position);
        flagView.setImageResource(stateModel.getFlagResource());
        nameView.setText(stateModel.getName());
        capitalView.setText(stateModel.getCapital());
        return view;
    }
}
