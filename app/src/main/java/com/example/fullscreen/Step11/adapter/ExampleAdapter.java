package com.example.fullscreen.Step11.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.fullscreen.R;
import com.example.fullscreen.Step11.model.ExampleModel;


import java.util.ArrayList;
import java.util.List;

public class ExampleAdapter extends ArrayAdapter<ExampleModel> {

    private LayoutInflater inflater;
    private int layout;
    private List<ExampleModel> states;

    public ExampleAdapter(Context context, int resource, ArrayList<ExampleModel> states) {
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView==null){
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ExampleModel state = states.get(position);

        viewHolder.imageView.setImageResource(state.getFlagResource());
        viewHolder.nameView.setText(state.getName());
        viewHolder.capitalView.setText(state.getCapital());

        return convertView;
    }
    private class ViewHolder {
        final ImageView imageView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            imageView = (ImageView)view.findViewById(R.id.step9Image);
            nameView = (TextView) view.findViewById(R.id.step9text1);
            capitalView = (TextView) view.findViewById(R.id.step9text2);
        }
    }
}
