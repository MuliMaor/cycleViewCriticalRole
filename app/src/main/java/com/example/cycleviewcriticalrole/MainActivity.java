package com.example.cycleviewcriticalrole;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface
{
    private ArrayList<DataModel> dataSet;
    private RecyclerView recycleView;
    private LinearLayoutManager layoutManager;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView = findViewById(R.id.charactersRecycledView);
        layoutManager = new LinearLayoutManager(this);
        recycleView.setLayoutManager(layoutManager);
        recycleView.setItemAnimator(new DefaultItemAnimator());
        dataSet = new ArrayList<DataModel>();

        for(int i = 0 ; i < MyData.characterNames.length ; i++)
        {
            dataSet.add(new DataModel(MyData.characterNames[i], MyData.characterClass[i], MyData.characterDrawableIDs[i],
                    MyData.characterBigDrawableIDs[i], MyData.characterInfos[i]));
        }

        adapter = new CustomAdapter(dataSet, this);
        recycleView.setAdapter(adapter);
    }

    @Override
    public void OnCharacterClick(int position)
    {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("clickedInfo", dataSet.get(position).getCharacterInfo());
        intent.putExtra("clickedBigImageID", dataSet.get(position).getBigImageID());
        startActivity(intent);
    }
}