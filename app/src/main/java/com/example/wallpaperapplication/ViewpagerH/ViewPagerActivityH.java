package com.example.wallpaperapplication.ViewpagerH;

import android.app.Activity;
import android.app.DownloadManager;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.telephony.mbms.DownloadRequest;
import android.telephony.mbms.DownloadStatusListener;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.viewpager.widget.ViewPager;

import com.ToxicBakery.viewpager.transforms.BackgroundToForegroundTransformer;
import com.ToxicBakery.viewpager.transforms.CubeInTransformer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
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
import com.example.wallpaperapplication.MyPefrence;
import com.example.wallpaperapplication.R;
import com.example.wallpaperapplication.draweractivity.account.AccountFragment;
import com.example.wallpaperapplication.draweractivity.favourite.FavouriteFragment;
import com.thin.downloadmanager.DefaultRetryPolicy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.xml.xpath.XPath;

public class ViewPagerActivityH extends AppCompatActivity {

    ViewPager vp;
    ArrayList<ListItem> list = new ArrayList<>();
    int data;
    String path;
    LinearLayout home, sharedata, download, dp, fav, account;
    String dd ="https://images.unsplash.com/photo-1501706362039-c06b2d715385?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60";

    ViewpagerAdepter viewpagerAdepter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpagerh_activity);

        vp = findViewById(R.id.vp);

        home = findViewById(R.id.home);
        download = findViewById(R.id.hdownload);
        dp = findViewById(R.id.hdp);
        account = findViewById(R.id.account);
        fav = findViewById(R.id.fav);
        sharedata = findViewById(R.id.sharedata);



        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            data = bundle.getInt("pos");
        }

        path = Integer.toString(data);

        ViewpagerAdepter viewpagerAdepter = new ViewpagerAdepter(ViewPagerActivityH.this, MyPefrence.getlist());
        vp.setAdapter(viewpagerAdepter);
        vp.setCurrentItem(data);

        vp.setPageTransformer(true, new CubeInTransformer());

        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setWallpaper();

            }
        });


        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewPagerActivityH.this, AccountFragment.class));
                finish();
            }
        });




        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewPagerActivityH.this, MainActivity.class);
                startActivity(intent);


            }


        });
        sharedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedata();
            }
        });
//        Glide.with(context).load(album).into(img);

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



//                download(dd);
            }

        });

    }

    private void download() {

        Uri uri = Uri.parse(""); // Path where you want to download file.
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE | DownloadManager.Request.NETWORK_WIFI);  // Tell on which network you want to download file.
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);  // This will show notification on top when downloading the file.
        request.setTitle("Downloading a file"); // Title for notification.
        request.setVisibleInDownloadsUi(true);
        request.setDestinationInExternalPublicDir("", uri.getLastPathSegment());  // Storage directory path
        ((DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE)).enqueue(request); // This will start downloading
    }


    private void setWallpaper() {
        Context context = this.getBaseContext();
        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), data);

        try {

            getApplicationContext().setWallpaper(mBitmap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void sharedata() {

            String shareBody = "pos";
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("*/*");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.app_name)));


    }


}
