package com.example.flagy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flagy.Recycler.StudyAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Study extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StudyAdapter adapter;
    private List<String> dataList;

    private Map<String,String> countries ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);


        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList = new ArrayList<>();
        // Add your data to the dataList

        countries = MapUtils.loadMap1(getApplicationContext());

        // for every item in countries map add the (key,value) pair to dataList as a string/
        // code = name for students to study
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            dataList.add(entry.getKey() + " = " + entry.getValue());
        }
        // sort the dataList alphabetically
        dataList.sort(String::compareToIgnoreCase);





        adapter = new StudyAdapter(dataList);
                recyclerView.setAdapter(adapter);
    }
}