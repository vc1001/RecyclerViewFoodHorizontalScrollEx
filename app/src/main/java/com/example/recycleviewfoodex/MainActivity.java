package com.example.recycleviewfoodex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.recycleviewfoodex.Adapter.CustomAdapter;
import com.example.recycleviewfoodex.Model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> modelList;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recyclerview);

        modelList = new ArrayList<>();

        Model f1=new Model("Burger",R.drawable.food1);
        Model f2=new Model("Pizza",R.drawable.food3);
        Model f3=new Model("Brocolin",R.drawable.food4);
        Model f4=new Model("Vegetables",R.drawable.food5);
        Model f5=new Model("Pizza",R.drawable.food1);
        Model f6=new Model("Noodles",R.drawable.food3);
        Model f7=new Model("Brocolin",R.drawable.food5);
        Model f8=new Model("Burger",R.drawable.food4);
        Model f9=new Model("Noodles",R.drawable.food3);


        modelList.add(f1);
        modelList.add(f2);
        modelList.add(f3);
        modelList.add(f4);
        modelList.add(f5);
        modelList.add(f6);
        modelList.add(f7);
        modelList.add(f8);
        modelList.add(f9);

        adapter = new CustomAdapter(modelList,this);
        recyclerView.setAdapter(adapter);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);
//        StaggeredGridLayoutManager staggered = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(staggered);
          LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
          recyclerView.setLayoutManager(layoutManager);

    }
}