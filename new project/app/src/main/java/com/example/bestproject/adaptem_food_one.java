package com.example.bestproject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class adaptem_food_one extends RecyclerView.Adapter{

    ArrayList<food_one> farry ;
    Context context;

    public adaptem_food_one(ArrayList<food_one> farry, Context context) {
        this.farry = farry;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list,parent,false);
    ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(farry.get(position).getImage());

        ((ViewHolder)holder).name.setText(farry.get(position).getName());
        ((ViewHolder)holder).timer.setText(farry.get(position).getTimer());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(context,MainActivity6_for_on.class);
                i1.putExtra("foodon",farry.get(position));
                context.startActivity(i1);







            }
        });
        final  AlertDialog.Builder builder = new AlertDialog.Builder(context);

        ((ViewHolder)holder).delete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                builder.setTitle("Delet");
                builder.setMessage("Are you sure you want to delete");
                builder.setCancelable(false).setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        farry.remove(position);
                        notifyDataSetChanged();


                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog alertDialog  =builder.create();
                alertDialog.show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return farry.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView timer ;
        public ImageView img ;
        public TextView name ;
        public View view ;
        public  ImageView  delete;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);



            view = itemView ;
            img = itemView.findViewById(R.id.imageView4);
            name = itemView.findViewById(R.id.textView);
            delete = itemView.findViewById(R.id.imageView6);

            timer = itemView.findViewById(R.id.textView2);







        }
    }
}
