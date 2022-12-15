package com.example.cycleviewcriticalrole;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>
{
    private ArrayList<DataModel> dataSet;
    private final RecyclerViewInterface recyclerViewInterface;

    public CustomAdapter(ArrayList<DataModel> dataSet, RecyclerViewInterface recyclerViewInterface)
    {
        this.dataSet = dataSet;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
       CardView cardView;
       TextView textViewName;
       TextView textViewClass;
       ImageView imageViewIcon;

       public MyViewHolder (View itemView, RecyclerViewInterface recyclerViewInterface)
       {
           super(itemView);

           cardView = itemView.findViewById(R.id.card_view);
           textViewName = itemView.findViewById(R.id.textViewName);
           textViewClass = itemView.findViewById(R.id.textViewClass);
           imageViewIcon = itemView.findViewById(R.id.imageView);

           itemView.setOnClickListener(new View.OnClickListener()
           {
               @Override
               public void onClick(View view)
               {
                   if(recyclerViewInterface != null)
                   {
                       int position = getAdapterPosition();
                       if (position != RecyclerView.NO_POSITION)
                       {
                           recyclerViewInterface.OnCharacterClick(position);
                       }
                   }
               }
           });
       }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i)
    {
        View view = LayoutInflater.from(parent.getContext() ).inflate(R.layout.cards_layout, parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view, recyclerViewInterface);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int listPosition)
    {
        TextView textViewName = viewHolder.textViewName;
        TextView textViewClass = viewHolder.textViewClass;
        ImageView imageView = viewHolder.imageViewIcon;
        CardView cardView = viewHolder.cardView;

        textViewName.setText(dataSet.get(listPosition).getName());
        textViewClass.setText(dataSet.get(listPosition).getCharacterClass());
        imageView.setImageResource(dataSet.get(listPosition).getImageID());
    }

    @Override
    public int getItemCount() {return dataSet.size();}
}


