package com.example.wallpaperapplication.ViewpagerV;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.ToxicBakery.viewpager.transforms.BackgroundToForegroundTransformer;
import com.example.wallpaperapplication.Adepter_item.ListItem;
import com.example.wallpaperapplication.MyPefrence;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class ViewPagerVActivity extends AppCompatActivity {


    ViewPager vp;
    ArrayList<ListItem> list = new ArrayList<>();
    int datav;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpagerv_activity);
        vp = findViewById(R.id.vp);







        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            datav = bundle.getInt("vertical");
        }


        ViewPagerVAdepter viewpagerAdepter = new ViewPagerVAdepter(ViewPagerVActivity.this, MyPefrence.getlistv());
        vp.setAdapter(viewpagerAdepter);
        vp.setCurrentItem(datav);

        vp.setPageTransformer(true, new BackgroundToForegroundTransformer());

    }
}


