package com.jc.latihanlist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] MataKuliah = new String[]{
            "Kalkulus","Jaringan Komputer","Pemrograman Mobile" ,"Sistem Operasi", "Basis Data", "Etika Komputer", "Information Retrieval","Pengolahan Citra Digital","Artificial Inteligence","Pemrograman Web lanjut"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Mohammad Andy Sampurno");
        getSupportActionBar().setSubtitle("Jadwal Mata Kuliah");
        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                android.R.id.text1, MataKuliah);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih : "+MataKuliah[position], Toast.LENGTH_LONG).show();

            }
        });
    }
}
