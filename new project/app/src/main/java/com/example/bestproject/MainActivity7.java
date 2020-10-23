package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        Button b1 = findViewById(R.id.button12);
        Button b2 = findViewById(R.id.button14);
        Button b3 = findViewById(R.id.button15);
        Button b4 = findViewById(R.id.button19);

        Button b5 = findViewById(R.id.button20);


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i7 = new Intent(MainActivity7.this,MainActivity7_toe.class)  ;
              startActivity(i7);
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=pHFThs3JFDg "));
                startActivity(browserIntent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=H4ef6PPDnH8"));
                startActivity(browserIntent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=XZ7y_KEXdVI&t=79s "));
                startActivity(browserIntent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=3vUtRRZG0xY  "));
                startActivity(browserIntent);
            }
        });



    }


    }
