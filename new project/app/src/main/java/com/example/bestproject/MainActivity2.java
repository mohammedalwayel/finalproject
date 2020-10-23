package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ArrayList<food_one> foodArry_one = new ArrayList<>();

        food_one f1 = new food_one("مجبوس دياي",10,"دقائق 6",R.drawable.machboos_on);
        food_one f2 = new food_one("مطبق زبيدي",10,"دقائق 12",R.drawable.motabag_zbaidy_on);
        food_one f3 = new food_one("باستا",10," دقائق 10 ",R.drawable.basta_one);
        food_one f4 = new food_one("مجبوس لحم",10,"  دقائق  8",R.drawable.mahboos_laham_one);
        food_one f5 = new food_one(" بيتزا",10,"دقائق 10",R.drawable.pitza_one);
        food_one f6 = new food_one("سباقيتي",10,"دقائق 9",R.drawable.spagete_one);
        food_one f7 = new food_one("برياني",10,"دقائق 7",R.drawable.baryane_one);

        foodArry_one.add(f1);
        foodArry_one.add(f2);
        foodArry_one.add(f3);
        foodArry_one.add(f4);
        foodArry_one.add(f5);
        foodArry_one.add(f6);
        foodArry_one.add(f7);

        RecyclerView rv1 = findViewById(R.id.Recyclerview1);
        rv1.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv1.setLayoutManager(lm);


        adaptem_food_one adapteron = new adaptem_food_one(foodArry_one,this);
        rv1.setAdapter(adapteron);


    }
}