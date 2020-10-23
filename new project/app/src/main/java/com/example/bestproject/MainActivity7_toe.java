package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7_toe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity7_toe);


        Button b1 = findViewById(R.id.button16);
        Button b2 = findViewById(R.id.button18);
        Button b3 = findViewById(R.id.button21);








        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=ToiNmgS127M "));
                startActivity(browserIntent);
            }
        });



      b2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent browserIntent= new Intent(Intent.ACTION_VIEW);
              browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=nTDeyaLK7cY"));
              startActivity(browserIntent);
          }
      });



      b3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent browserIntent= new Intent(Intent.ACTION_VIEW);
              browserIntent.setData(Uri.parse("https://www.youtube.com/watch?v=Xo7z22t1MY8 "));
              startActivity(browserIntent);
          }
      });
    }
}