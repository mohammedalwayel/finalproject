package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        Bundle b = getIntent().getExtras();
        food_too f = (food_too) b.getSerializable("food");

        ImageView img = findViewById(R.id.imageView);
        TextView name = findViewById(R.id.textView7);
        TextView time =  findViewById(R.id.textView10);

        img.setImageResource(f.getImage());
        name.setText(f.getName());
        time.setText(f.getTimer());

        Button b2 = findViewById(R.id.button23);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9 = new Intent(MainActivity10.this,MainActivity11.class);
                startActivity(i9);
            }
        });

    }
}