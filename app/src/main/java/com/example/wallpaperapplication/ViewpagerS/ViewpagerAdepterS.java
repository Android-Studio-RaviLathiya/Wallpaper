package com.example.wallpaperapplication.ViewpagerS;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.wallpaperapplication.Adepter_item.ListItem;
import com.example.wallpaperapplication.Adepter_item.ListSItem;
import com.example.wallpaperapplication.MainActivity;
import com.example.wallpaperapplication.R;
import com.example.wallpaperapplication.draweractivity.account.AccountFragment;
import com.example.wallpaperapplication.draweractivity.favourite.FavouriteFragment;

import java.io.IOException;
import java.util.ArrayList;

public class ViewpagerAdepterS extends PagerAdapter {

    Context context;
    ArrayList<ListSItem> listitems;

    public ViewpagerAdepterS(Context context, ArrayList<ListSItem> listitems) {
        this.context = context;
        this.listitems = listitems;
    }

    ImageView img;
    int data;
    LinearLayout home, sharedata, download, dp, fav, account;



    @Override
    public int getCount() {
        return listitems.size();
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup collection, final int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.viewpagers_item, collection, false);
        collection.addView(layout);


        final String album = listitems.get(position).getPath();

        img = layout.findViewById(R.id.img);
        home = layout.findViewById(R.id.home);
        download = layout.findViewById(R.id.download);
        dp = layout.findViewById(R.id.sdp);
        account = layout.findViewById(R.id.account);
        fav = layout.findViewById(R.id.fav);
        sharedata = layout.findViewById(R.id.sharedata);


//amimation bachgrounf
        AnimationDrawable animationDrawable;
        RelativeLayout my = layout.findViewById(R.id.my);

        animationDrawable = (AnimationDrawable) my.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();


        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, FavouriteFragment.class));
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, AccountFragment.class));
                ((Activity)context).finish();
            }
        });


dp.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        setWallpaper();

    }
});

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                context.startActivity(new Intent(context, MainActivity.class));
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
                ((Activity)context).finish();


            }


        });

        sharedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedata();
            }
        });
        Glide.with(context).load(album).into(img);

        return layout;
    }

    private void setWallpaper() {

//        Context context1 = context.getBaseContext();
        Bitmap mBitmap = BitmapFactory.decodeResource(context.getResources(), data);

        try {

            context.getApplicationContext().setWallpaper(mBitmap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void sharedata() {
        String shareBody = "pos";
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("*/*");
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        context.startActivity(Intent.createChooser(sharingIntent, context.getResources().getString(R.string.app_name)));
    }


}



