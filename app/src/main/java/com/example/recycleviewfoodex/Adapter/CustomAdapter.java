package com.example.recycleviewfoodex.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewfoodex.Model.Model;
import com.example.recycleviewfoodex.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewholder> {

    List<Model> modelList;
    Context context;

    public CustomAdapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new viewholder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        Model model = modelList.get(position);

        holder.imageView.setImageResource(model.getFoodImage());
        holder.textView.setText(model.getFoodName());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }


    public static class viewholder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            this.textView = textView;
            this.imageView = imageView;

            textView = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
