package com.example.wallpaperapplication.Collection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class CollectionActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<CollectionItem> collectionItems = new ArrayList<>();
    CollectionAdapter collectionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        rv = findViewById(R.id.rv);

        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(1,LinearLayoutManager.HORIZONTAL);

        rv.setLayoutManager(staggeredGridLayoutManager);


        collectionItems.add(new CollectionItem("Red", "https://images.pexels.com/photos/2916450/pexels-photo-2916450.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/691510/red-shade-lamp-perspective-691510.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/1161751/pexels-photo-1161751.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/934121/pexels-photo-934121.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        collectionItems.add(new CollectionItem("Green", "https://images.pexels.com/photos/531871/pexels-photo-531871.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/298695/pexels-photo-298695.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/370616/pexels-photo-370616.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/732423/pexels-photo-732423.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        collectionItems.add(new CollectionItem("Blue", "https://images.pexels.com/photos/443413/pexels-photo-443413.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/382297/pexels-photo-382297.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/2418645/pexels-photo-2418645.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/818713/pexels-photo-818713.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        collectionItems.add(new CollectionItem("Yellow", "https://images.pexels.com/photos/1330645/pexels-photo-1330645.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/2872767/pexels-photo-2872767.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/5836/yellow-metal-design-decoration.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/3791630/pexels-photo-3791630.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        collectionItems.add(new CollectionItem("White", "https://images.pexels.com/photos/2451265/pexels-photo-2451265.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/1420709/pexels-photo-1420709.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/4066847/pexels-photo-4066847.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/1108193/pexels-photo-1108193.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        collectionItems.add(new CollectionItem("Black", "https://images.pexels.com/photos/623147/pexels-photo-623147.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/696080/pexels-photo-696080.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/1011100/pexels-photo-1011100.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","https://images.pexels.com/photos/1275227/pexels-photo-1275227.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));

        collectionAdapter
                = new CollectionAdapter(collectionItems, CollectionActivity.this);
        rv.setAdapter(collectionAdapter);


    }
}
