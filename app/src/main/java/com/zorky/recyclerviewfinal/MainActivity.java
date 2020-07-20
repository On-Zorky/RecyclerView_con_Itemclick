package com.zorky.recyclerviewfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;


    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        mRecyclerView = findViewById (R.id.recyclerView);
        mRecyclerView.setLayoutManager (new LinearLayoutManager (this, LinearLayoutManager.VERTICAL, false));
        myAdapter = new MyAdapter (this,getMyList ());
        mRecyclerView.setAdapter (myAdapter);

    }

    private ArrayList<Model> getMyList()
    {
        ArrayList <Model> models = new ArrayList<> ();

        Model m = new Model ();
        m.setTitle ("New Feed");
        m.setDescription ("This is newsfeed description");
        m.setImg (R.drawable.iphone_11_pro);
        models.add (m);

        m = new Model ();
        m.setTitle ("Business");
        m.setDescription ("This is business description");
        m.setImg (R.drawable.instagram);
        models.add (m);

        m = new Model ();
        m.setTitle ("People");
        m.setDescription ("This is People description");
        m.setImg (R.drawable.tic_toc);
        models.add (m);

        m = new Model ();
        m.setTitle ("Notes");
        m.setDescription ("This is Notes description");
        m.setImg (R.drawable.what_s_app);
        models.add (m);

        m = new Model ();
        m.setTitle ("FeedBack");
        m.setDescription ("This is feedback description");
        m.setImg (R.drawable.youtube);
        models.add (m);

        m = new Model ();
        m.setTitle ("People");
        m.setDescription ("This is People description");
        m.setImg (R.drawable.tic_toc);
        models.add (m);

        m = new Model ();
        m.setTitle ("Notes");
        m.setDescription ("This is Notes description");
        m.setImg (R.drawable.what_s_app);
        models.add (m);

        m = new Model ();
        m.setTitle ("FeedBack");
        m.setDescription ("This is feedback description");
        m.setImg (R.drawable.youtube);
        models.add (m);

        return models;
    }

}