package com.example.pro0601;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;

    ImageView imageV;

    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        imageV= findViewById(R.id.imageV);


    }


    public void clicked(View view) {
        Random rnd = new Random();
        num= rnd.nextInt(3)+1;
        btn.setText(String.valueOf(num));
        if (num==1){
            imageV.setImageResource(R.drawable.image01);
        }
        if (num==2){
            imageV.setImageResource(R.drawable.image02);
        }
        if (num==3){
            imageV.setImageResource(R.drawable.image03);
        }
    }
}