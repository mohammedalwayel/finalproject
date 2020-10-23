package com.example.bestproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter_food_too extends RecyclerView.Adapter {
    ArrayList<food_too>tArry ;
    Context context ;

    public adapter_food_too(ArrayList<food_too> tArry, Context context) {
        this.tArry = tArry;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v2 = LayoutInflater.from(parent.getContext()) .inflate(R.layout.xml_salat_food_too,parent,false);
       ViewHolder vh2 = new ViewHolder(v2);

        return vh2;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img2.setImageResource(tArry.get(position).getImage());
        ((ViewHolder)holder).timeer.setText(tArry.get(position).getTimer());
        ((ViewHolder)holder).time.setText(tArry.get(position).getTime()+"");
        ((ViewHolder)holder).name2.setText(tArry.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(context,MainActivity10.class);
                i.putExtra("food",tArry.get(position));
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return tArry.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img2 ;
        public TextView  name2;
        public TextView  timeer ;
        public TextView time ;
        public View view ;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView ;
            img2 = itemView.findViewById(R.id.imageView7);
            time = itemView.findViewById(R.id.textView6);
            name2 = itemView.findViewById(R.id.textView4);
            timeer = itemView.findViewById(R.id.textView5);
        }
    }
}
