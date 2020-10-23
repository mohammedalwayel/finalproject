package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        Button b12 = findViewById(R.id.button29);
        Button b13 = findViewById(R.id.button30);
        Button b14 = findViewById(R.id.button31);


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=jIDxS49K-7s"));
                startActivity(browserIntent);

            }
        });

         b13.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                 browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=2ygsCN9v20I"));
                 startActivity(browserIntent);

             }
         });

         b14.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                 browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=rkKjZOJw9dg&t=158s"));
                 startActivity(browserIntent);

             }
         });
    }
}