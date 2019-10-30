package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Keluarga("Suwito", "Bapak","22 September 1971" , R.drawable.bapak));
        mahasiswaArrayList.add(new Keluarga("Hartatik", "Ibu", "19 Oktober 1979" , R.drawable.ibuk));
        mahasiswaArrayList.add(new Keluarga("Hyan Bening Abimanyu", "Abang", "28 April 1998" , R.drawable.abang));
        mahasiswaArrayList.add(new Keluarga("Intan Bening Maharnani", "Adik ", "05 November 2002" , R.drawable.adik));

    }
}


