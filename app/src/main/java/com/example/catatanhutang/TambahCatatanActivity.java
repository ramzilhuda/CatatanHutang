package com.example.catatanhutang;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TambahCatatanActivity extends AppCompatActivity {

    //1. deklarisan edJudul, edJumlah, edTanggal
    //2. setting edTanggal setOnclikListener
    //3. setting datepicker : Calendar calendar = Calendar.getInstance();
    //4. Calendar calendar = Calendar.getInstance();
    //                // untuk mendapatkan tanggal dan tahun sekarang
    //                int nowyear = calendar.get(Calendar.YEAR);
    //                int nowmonth = calendar.get(Calendar.MONTH);
    //                int nowday = calendar.get(Calendar.DAY_OF_MONTH);
    //
    //                DatePickerDialog dialog = new DatePickerDialog(TambahCatatanActivity.this, new DatePickerDialog.OnDateSetListener() {
    //                    @Override
    //                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
    //                        Calendar cal = Calendar.getInstance();
    //                        cal.set(year,month,dayOfMonth);
    //                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
    //                        edTanggal.setText(dateFormat.format(cal.getTime()));
    //4. kembali ke mainAcitivity

    EditText edJudul, edJumlah, edTanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_catatan);
        edJudul = findViewById(R.id.edJudul);
        edJudul = findViewById(R.id.edJumlah);
        edTanggal = findViewById(R.id.edTanggal);

        edTanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                // untuk mendapatkan tanggal dan tahun sekarang
                int nowyear = calendar.get(Calendar.YEAR);
                int nowmonth = calendar.get(Calendar.MONTH);
                int nowday = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(TambahCatatanActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Calendar cal = Calendar.getInstance();
                        cal.set(year,month,dayOfMonth);
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
                        edTanggal.setText(dateFormat.format(cal.getTime()));



                    }
                }, nowyear, nowmonth, nowday);
                dialog.show();
            }
        });

    }
}
