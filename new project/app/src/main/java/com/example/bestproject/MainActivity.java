package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i1);


            }
        });

    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i2 = new Intent(MainActivity.this,MainActivity3.class);
            startActivity(i2);
        }
    });


   b3.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent i3 = new Intent(MainActivity.this,MainActivity4.class);
           startActivity(i3);
       }
   });








    }
}