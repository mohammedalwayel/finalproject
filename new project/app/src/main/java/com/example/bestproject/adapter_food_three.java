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

public class adapter_food_three extends RecyclerView.Adapter {
    ArrayList<food_three> pArry3 ;
    Context context ;

    public adapter_food_three(ArrayList<food_three> pArry3, Context context) {
        this.pArry3 = pArry3;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.xml_three,parent,false);
        ViewHolder vh3 = new ViewHolder(v3);
        return vh3;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(pArry3.get(position).getImage());
        ((ViewHolder)holder).name.setText(pArry3.get(position).getName());
        ((ViewHolder)holder).time.setText(pArry3.get(position).getTime());
        ((ViewHolder)holder).timer.setText(pArry3.get(position).getTimer());

        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(context,MainActivity5.class);
                i1.putExtra("food",pArry3.get(position));
                context.startActivity(i1);

            }
        });

    }

    @Override
    public int getItemCount() {
        return pArry3.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img ;
        public TextView name ;
        public TextView timer ;
        public TextView time ;
        public View view ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView ;
            img = itemView.findViewById(R.id.imageView10);
           name  = itemView.findViewById(R.id.textView8);
            time = itemView.findViewById(R.id.textView9);
            timer = itemView.findViewById(R.id.textView11);
        }
    }
}
