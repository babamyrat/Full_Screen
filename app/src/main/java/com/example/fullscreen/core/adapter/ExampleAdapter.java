package com.example.fullscreen.core.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fullscreen.R;
import com.example.fullscreen.core.model.ExampleModel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.MyViewHolder> {
    private final List<ExampleModel> dateList;
    private final Context context;

    public ExampleAdapter(List<ExampleModel> dateList, Context context) {
        this.dateList = dateList;
        this.context = context;
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ExampleAdapter.MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull ExampleAdapter.MyViewHolder holder, int position) {
        holder.txtName.setText(dateList.get(position).getName());
        holder.txtNum.setText(dateList.get(position).getNum());

    }

    @Override
    public int getItemCount() {
        return dateList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtNum;
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtNum = itemView.findViewById(R.id.txtNum);
        }
    }
}
