package com.example.fullscreen.Step12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.fullscreen.R;

import java.util.ArrayList;

class ExampleAdapter extends ArrayAdapter<ExampleModel> {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<ExampleModel> productList;

    ExampleAdapter(Context context, int resource, ArrayList<ExampleModel> products) {
        super(context, resource, products);
        this.productList = products;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;
        if(convertView==null){
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final ExampleModel product = productList.get(position);

        viewHolder.nameView.setText(product.getName());
        viewHolder.countView.setText(product.getCount() + " " + product.getUnit());

        viewHolder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = product.getCount()-1;
                if(count<0) count=0;
                product.setCount(count);
                viewHolder.countView.setText(count + " " + product.getUnit());
            }
        });
        viewHolder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = product.getCount()+1;
                product.setCount(count);
                viewHolder.countView.setText(count + " " + product.getUnit());
            }
        });

        return convertView;
    }
    private class ViewHolder {
        final Button addButton, removeButton;
        final TextView nameView, countView;
        ViewHolder(View view){
            addButton = (Button) view.findViewById(R.id.step12button1);
            removeButton = (Button) view.findViewById(R.id.step12button2);
            nameView = (TextView) view.findViewById(R.id.step12name);
            countView = (TextView) view.findViewById(R.id.step12Num);
        }
    }
}

