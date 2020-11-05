package com.example.wallpaperapplication.ViewpagerH;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.downloader.Error;
import com.downloader.OnCancelListener;
import com.downloader.OnDownloadListener;
import com.downloader.OnPauseListener;
import com.downloader.OnProgressListener;
import com.downloader.OnStartOrResumeListener;
import com.downloader.PRDownloader;
import com.downloader.Progress;
import com.example.wallpaperapplication.Adepter_item.ListItem;
import com.example.wallpaperapplication.BuildConfig;
import com.example.wallpaperapplication.MainActivity;
import com.example.wallpaperapplication.R;
import com.example.wallpaperapplication.draweractivity.account.AccountFragment;
import com.example.wallpaperapplication.draweractivity.favourite.FavouriteFragment;

import java.io.File;
import java.util.ArrayList;

public class ViewpagerAdepter extends PagerAdapter {

    Context context;
    ArrayList<ListItem> listitems;
    ImageView img;


    public ViewpagerAdepter(Context context, ArrayList<ListItem> listitems) {
        this.context = context;
        this.listitems = listitems;
    }


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
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.viewpagerh_item, collection, false);
        collection.addView(layout);


        final String album = listitems.get(position).getPath();


        img = layout.findViewById(R.id.img);

        AnimationDrawable animationDrawable;
        RelativeLayout my = layout.findViewById(R.id.my);

        animationDrawable = (AnimationDrawable) my.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

        Glide.with(context).load(album).into(img);


        return layout;
    }


}



