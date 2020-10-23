package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Button b1 = findViewById(R.id.button6);
        Button i2 = findViewById(R.id.button7);
        Button i3 = findViewById(R.id.button8);
        Button i4 = findViewById(R.id.button9);

        Button i5 = findViewById(R.id.button13);

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity8.this,MainActivity9.class);
                startActivity(i1);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=Kx5cAMHxgwc"));
                startActivity(browserIntent);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=PEmuAAS2otE"));
                startActivity(browserIntent);
            }
        });



        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=coF8KcUHNv0"));
                startActivity(browserIntent);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=BfVgGxiD_4o"));
                startActivity(browserIntent);
            }
        });

    }
}