package com.example.fruitstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruit> itemList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fruit Fruit1 = new Fruit("Pineapples", 1.50, R.drawable.picture1);
        Fruit Fruit2 = new Fruit("Strawberryes", 1.70, R.drawable.picture2);
        Fruit Fruit3 = new Fruit("Oranges", 1.0, R.drawable.picture3);
        Fruit Fruit5 = new Fruit("Mangoes", 2.0, R.drawable.picture5);
        Fruit Fruit6 = new Fruit("Watermelon", 2.5, R.drawable.picture6);

        itemList.add(Fruit1);
        itemList.add(Fruit2);
        itemList.add(Fruit3);
        itemList.add(Fruit5);
        itemList.add(Fruit6);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(itemList, this);
         recycler.setAdapter(adapter);



    }
}