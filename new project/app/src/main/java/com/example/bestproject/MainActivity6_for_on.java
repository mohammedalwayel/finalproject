package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6_for_on extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity6_for_on);

        Bundle b1 = getIntent().getExtras();
        food_one f1 = (food_one) b1.getSerializable("foodon");


        ImageView img1 = findViewById(R.id.imageView9);
        TextView name = findViewById(R.id.textView15);
        TextView timer1 = findViewById(R.id.textView19);

        img1.setImageResource(f1.getImage());
        name.setText(f1.getName());
        timer1.setText(f1.getTimer());


        Button b6 = findViewById(R.id.button5);


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(MainActivity6_for_on.this,MainActivity8.class);
                startActivity(i6);
            }
        });
    }
}