package com.example.yasin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edittextView2;
    EditText edittextView3;
    Button button_kontrol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_kontrol = findViewById(R.id.button_kontrol);
        edittextView2 = findViewById(R.id.textnumber1);
        edittextView3 = findViewById(R.id.textnumber2);
    }

    public void kontrol(View view){
        int sayi1 = Integer.parseInt(edittextView2.getText().toString());
        int sayi2 = Integer.parseInt(edittextView3.getText().toString());
        if(sayi1>sayi2){
            Toast.makeText(MainActivity.this, "1. Sayı Daha Büyüktür.", Toast.LENGTH_LONG).show();
        }
        if(sayi2>sayi1){
            Toast.makeText(MainActivity.this, "2. Sayı Daha Büyüktür.", Toast.LENGTH_LONG).show();
        }
        if(sayi1==sayi2){
            Toast.makeText(MainActivity.this,"Sayılar Birbirine Eşittir.", Toast.LENGTH_LONG).show();
        }
    }
}