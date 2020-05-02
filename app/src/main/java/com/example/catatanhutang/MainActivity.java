package com.example.catatanhutang;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //1. Membuat layout per item klik kanan Layout pilih LayoutResourceFile buat dengan nama item_catatan
    //2. Membuat data model klik kanan com.example pilih new Java Class buat CatatanAdapter dan CatatanModel
    //3. buka class CatatanModel
    //4. tambahkan di bawah protected void onCreate(Bundle savedInstanceState)
            /*CatatanModel catatan1 = new CatatanModel();
            catatan1.setId("1");
            catatan1.setJudul("Hutang Ke A");
            catatan1.setJumlahhutang("20000");
            catatan1.setTanggal("12-12-12");
            */
    //5. tambahkan di bawah public class main : List<CatatanModel> datacatatan = new ArrayList<>();
    //6. tambahkan perulangan di bawah catatan1. : for (int i = 0; i < 20 ; i++) {
    //            datacatatan.add(catatan1);
    //7. buka class CatatanAdapter
    //8. kenalkan RecyclerView recycler
    //9. deklarasikan RecyclerView findViewbyid
    //10. tambahkan recycler.setAdapter(new CatatanAdapter(MainActivity.this,datacatatan));
    //11. setlayoutmanager recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    //12. Atur setsize recylerview : recycler.setHasFixedSize(true);
    //13. tambahkan addsetItemdocarate untuk menghasilkan garis pemisah antar baris di reyclerView
    //14. tambahkan Activity baru dengan klik kanan com.example beridengan nama : TambahCatatanActivity
    //15. ganti snackbar pada Mainactivity dengan intents
    //16. buka class TambahCatatanAcitity deklarasikan ( edJudul, edJumlah, edTanggal )




    List<CatatanModel> datacatatan = new ArrayList<>();
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TambahCatatanActivity.class));
            }
        });

        CatatanModel catatan1 = new CatatanModel();
        catatan1.setId("1");
        catatan1.setJudul("Hutang Ke A");
        catatan1.setJumlahhutang("20000");
        catatan1.setTanggal("12-12-12");

        for (int i = 0; i < 20 ; i++) {
            datacatatan.add(catatan1);
        }

        recycler = findViewById(R.id.recyclerView);
        recycler.setAdapter(new CatatanAdapter(MainActivity.this,datacatatan));
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recycler.setHasFixedSize(true);
        recycler.addItemDecoration(new DividerItemDecoration(MainActivity.this, 1));

        //3. Membuat adapter
        //4. Membuat layoutadapter
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
