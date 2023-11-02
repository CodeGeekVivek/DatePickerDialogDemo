package com.example.datepickerdialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DatePickerDemo extends AppCompatActivity {
    TextView tv_date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_demo);
        tv_date=(TextView) findViewById(R.id.tv_date);
        Calendar c =Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day=c.get(Calendar.DAY_OF_MONTH);
        tv_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             DatePickerDialog   datePickerDialog=new DatePickerDialog(DatePickerDemo.this, new DatePickerDialog.OnDateSetListener() {
                 @Override
                 public void onDateSet(DatePicker view, int year, int month, int day_of_month) {
                    tv_date.setText(day_of_month +"/"+(month+1)+"/"+year);
                 }
             },year,month,day);
             datePickerDialog.show();
            }
        });

    }
}