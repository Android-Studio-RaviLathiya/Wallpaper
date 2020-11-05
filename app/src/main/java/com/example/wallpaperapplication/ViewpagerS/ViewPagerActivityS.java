package com.example.wallpaperapplication.ViewpagerS;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.ToxicBakery.viewpager.transforms.AccordionTransformer;
import com.ToxicBakery.viewpager.transforms.CubeInTransformer;
import com.ToxicBakery.viewpager.transforms.DepthPageTransformer;
import com.ToxicBakery.viewpager.transforms.FlipVerticalTransformer;
import com.ToxicBakery.viewpager.transforms.TabletTransformer;
import com.ToxicBakery.viewpager.transforms.ZoomOutSlideTransformer;
import com.ToxicBakery.viewpager.transforms.ZoomOutTransformer;
import com.example.wallpaperapplication.Adepter_item.ListItem;
import com.example.wallpaperapplication.Adepter_item.ListSItem;
import com.example.wallpaperapplication.MyPefrence;
import com.example.wallpaperapplication.R;
import com.example.wallpaperapplication.ViewpagerH.ViewpagerAdepter;

import java.util.ArrayList;

public class ViewPagerActivityS extends AppCompatActivity {

    ViewPager vp;
    ArrayList<ListSItem> list = new ArrayList<>();
    int dataS;
    ViewpagerAdepterS viewpagerAdepter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpagers_activity);
        vp = findViewById(R.id.vp);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            dataS = bundle.getInt("posS");
        }


        ViewpagerAdepterS viewpagerAdepter = new ViewpagerAdepterS(ViewPagerActivityS.this, MyPefrence.getlists());
        vp.setAdapter(viewpagerAdepter);
        vp.setCurrentItem(dataS);

        vp.setPageTransformer(true, new ZoomOutTransformer());

    }
}
