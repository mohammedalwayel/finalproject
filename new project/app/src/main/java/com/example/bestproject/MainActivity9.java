package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        Button b1 = findViewById(R.id.button4);
        Button b2 = findViewById(R.id.button10);
        Button b3 = findViewById(R.id.button11);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=Q2CSX0YOKsk&t=66s"));
                startActivity(browserIntent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=JWejs6hCLgk"));
                startActivity(browserIntent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=OQGAMDVF51Y"));
                startActivity(browserIntent);
            }
        });
    }
}