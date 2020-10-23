package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);



        Bundle b = getIntent().getExtras();
        food_three f1 = (food_three) b.getSerializable("food");


        ImageView img = findViewById(R.id.imageView8);
        TextView name = findViewById(R.id.textView12);
        TextView time = findViewById(R.id.textView13);

        img.setImageResource(f1.getImage());
        name.setText(f1.getName());
        time.setText(f1.getTime());

        Button b5 = findViewById(R.id.button17);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(MainActivity5.this,MainActivity7.class);
                startActivity(i5);
            }
        });





    }
}