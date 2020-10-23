package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);


        Button b1 = findViewById(R.id.button24);
        Button b2 = findViewById(R.id.button25);
        Button b3 = findViewById(R.id.button26);
        Button b4 = findViewById(R.id.button27);

        Button b5 = findViewById(R.id.button28);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=vr1iPfMPexk"));
                startActivity(browserIntent);

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=SBvuqVTRnHA"));
                startActivity(browserIntent);

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=X8P5T1EiNZE"));
                startActivity(browserIntent);

            }
        });

           b4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                   browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=wQD4lY6vabA"));
                   startActivity(browserIntent);

               }
           });


           b5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent i10 = new Intent(MainActivity11.this,MainActivity12.class);
                   startActivity(i10);
               }
           });

    }
}