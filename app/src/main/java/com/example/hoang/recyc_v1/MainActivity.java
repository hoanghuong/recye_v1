package com.example.hoang.recyc_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecceView;
    private recycelerviewAdapter mRecycelerviewAdapter;
    private List<Integer> mData;
    private List<Integer> mData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addcontroll();
        addevent();
    }

    private void addevent() {
        loadData();
        mRecycelerviewAdapter = new recycelerviewAdapter(mData, mData2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecceView.setLayoutManager(layoutManager);
        mRecceView.setAdapter(mRecycelerviewAdapter);
    }

    private void addcontroll() {
        mRecceView = findViewById(R.id.recycelerview);
    }

    private void loadData() {
        mData.add(R.string.name_one);
        mData.add(R.string.name_two);
        mData.add(R.string.name_three);
        mData2.add(R.drawable.avate_one);
        mData2.add(R.drawable.avata_two);
        mData2.add(R.drawable.avata_three);
    }
}



