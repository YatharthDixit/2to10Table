package com.yatharth.a2to10table;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    public void t(int n) {

        ListView l = findViewById(R.id.ListView);
        TextView info = (TextView) findViewById(R.id.textView2);
        info.setText("The table of " + n + " :");
        ArrayList<Integer> v = new ArrayList<Integer>();

        for(int j=0; j<=10;j++){
v.add(j*n);}
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, v);
        l.setAdapter(adapter);
    }
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar table= (SeekBar)findViewById(R.id.seekBar);

        table.setMax(8);
        int n = table.getProgress()+2;
        table.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                t((i+2));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });







    }
}