package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        ArrayList<food_too> pfood2 = new ArrayList<>();

        food_too ff1 = new food_too("ميلك شيك نوتيلا",10,"دقائق ",R.drawable.melk_shak_notela);
        food_too ff2 = new food_too("ميلك شيك لوتس",10,"دقائق",R.drawable.milk_shake_lotes);
        food_too ff3 = new food_too("ميلك شيك اوريو",10,"دقائق",R.drawable.milke_shake_oryou);
        food_too ff4 = new food_too("عصير عوار قلب",10,"دقائق",R.drawable.asear_ahar_gab);
        food_too ff5 = new food_too("عصير تفاح",7,"دقائق",R.drawable.asear_apple);
        food_too ff6 = new food_too("عصير أفوكادو",10,"دقائق",R.drawable.asear_avokado);
        food_too ff7 = new food_too("عصير رمان",5,"دقائق",R.drawable.asear_roman);

        pfood2.add(ff1);
        pfood2.add(ff2);
        pfood2.add(ff3);
        pfood2.add(ff4);
        pfood2.add(ff5);
        pfood2.add(ff6);
        pfood2.add(ff7);


        RecyclerView rr1 = findViewById(R.id.recyclerview2);

        rr1.setHasFixedSize(true);
        RecyclerView.LayoutManager Im = new LinearLayoutManager(this);
        rr1.setLayoutManager(Im);

        adapter_food_too patoo = new adapter_food_too(pfood2,this);
        rr1.setAdapter(patoo);
    }
}