package com.zorky.recyclerviewfinal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> // implements Filterable
{
    Context c;
    ArrayList <Model> models; //filterList;
    //CustomFilter filter;

    public MyAdapter (Context c, ArrayList <Model> models)
    {
        this.c = c;
        this.models = models;
        //this.filterList = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder (@NonNull ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from (viewGroup.getContext ()).inflate (R.layout.row, viewGroup, false);


        return new MyHolder (view);
    }

    @Override
    public void onBindViewHolder (@NonNull final MyHolder holder, int position)
    {
        holder.mTitle.setText (models.get (position).getTitle ());
        holder.mDes.setText (models.get (position).getDescription ());
        holder.mImaeView.setImageResource (models.get (position).getImg ());

        holder.setItemClickListener (new ItemClickListener ( )
        {
            @Override
            public void onItemClickListener (View v, int position)
            {
                String gTitle = models.get (position).getTitle ();
                String gDesc = models.get (position).getDescription ();

                if (models.get (position).getTitle ().equals ("New Feed"))
                {
                    Intent intent = new Intent (c, AnotherActivity.class);
                    intent.putExtra ("iTitle",gTitle);
                    intent.putExtra ("iDesc",gDesc);
                    c.startActivity (intent);
                }
            }
        });

    }

    @Override
    public int getItemCount ()
    {
        return models.size ();
    }

}
