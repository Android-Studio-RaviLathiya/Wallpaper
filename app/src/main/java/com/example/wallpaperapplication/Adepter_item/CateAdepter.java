package com.example.wallpaperapplication.Adepter_item;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.util.Util;
import com.example.wallpaperapplication.Collection.CollectionActivity;
import com.example.wallpaperapplication.MaiMixActivity.AnimalVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.ArchitectureVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.BabyVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.BirthdayVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.CarVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.FestivalVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.FlowersVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.FoodVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.FunnyVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.LoveVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.SeaVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.SpaceVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.SportVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.WaterColourVPActivity;
import com.example.wallpaperapplication.MaiMixActivity.WeddingVPActivity;
import com.example.wallpaperapplication.R;
import com.example.wallpaperapplication.VHActivity.FragmentFunnyV;

import java.util.ArrayList;
import java.util.Locale;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class CateAdepter extends RecyclerView.Adapter<CateAdepter.MYHOLDER> {

    ArrayList<CateItem> cateItems;
    ArrayList<CateItem> templist;
    Context context;

    public CateAdepter(ArrayList<CateItem> cateItems, Context context) {
        this.cateItems = cateItems;
        this.context = context;
        templist = new ArrayList<>();
        templist.addAll(cateItems);
    }

    @NonNull
    @Override
    public MYHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        return new MYHOLDER(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MYHOLDER holder, final int position) {

        Glide.with(context).load(cateItems.get(position).getImg()).into(holder.main);
//        Glide.with(context).load(cateItems.get(position).getImg()).into(holder.main);
//        Glide.with(context).load(cateItems.get(position).getImgone()).into(holder.imgone);
//        Glide.with(context).load(cateItems.get(position).getImgtwo()).into(holder.imgtwo);
//        Glide.with(context).load(cateItems.get(position).getImgthree()).into(holder.imgthree);
        holder.name.setText(cateItems.get(position).getName());

        holder.click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0) {
                    context.startActivity(new Intent(context, CarVPActivity.class));

                } else if (position == 1) {
                    context.startActivity(new Intent(context, AnimalVPActivity.class));

                } else if (position == 2) {
                    context.startActivity(new Intent(context, FunnyVPActivity.class));

                } else if (position == 3) {
                    context.startActivity(new Intent(context, SportVPActivity.class));

                } else if (position == 4) {
                    context.startActivity(new Intent(context, BirthdayVPActivity.class));

                } else if (position == 5) {
                    context.startActivity(new Intent(context, SeaVPActivity.class));

                } else if (position == 6) {
                    context.startActivity(new Intent(context, FestivalVPActivity.class));

                } else if (position == 7) {
                    context.startActivity(new Intent(context, SpaceVPActivity.class));

                } else if (position == 8) {
                    context.startActivity(new Intent(context, FoodVPActivity.class));

                } else if (position == 9) {
                    context.startActivity(new Intent(context, WaterColourVPActivity.class));

                } else if (position == 10) {
                    context.startActivity(new Intent(context, FlowersVPActivity.class));

                } else if (position == 11) {
                    context.startActivity(new Intent(context, WeddingVPActivity.class));

                } else if (position == 12) {
                    context.startActivity(new Intent(context, ArchitectureVPActivity.class));

                } else if (position == 13) {
                    context.startActivity(new Intent(context, LoveVPActivity.class));

                } else if (position == 14) {
                    context.startActivity(new Intent(context, BabyVPActivity.class));

                }


            }
        });


    }

    @Override
    public int getItemCount() {
        return cateItems.size();
    }


    public class MYHOLDER extends RecyclerView.ViewHolder {


        ImageView main,img,imgone,imgtwo,imgthree;
        RelativeLayout click;
        TextView name;

        public MYHOLDER(@NonNull View itemView) {
            super(itemView);

            click = itemView.findViewById(R.id.one);

//            main = itemView.findViewById(R.id.main);
            main = itemView.findViewById(R.id.main);
//            imgtwo = itemView.findViewById(R.id.imgtwo);
//            imgone = itemView.findViewById(R.id.imgone);
//            imgthree = itemView.findViewById(R.id.imgthree);

            name = itemView.findViewById(R.id.name);
        }
    }

    public void filter(String newText) {

//        newText = newText.toLowerCase(Locale.getDefault());

        cateItems.clear();

        if (newText.length() == 0) {
            cateItems.addAll(templist);
        } else {
            for (CateItem item : templist) {
                if (newText.length() != 0 && item.getName().contains(newText)) {
                    cateItems.add(item);

                }

            }
        }
        notifyDataSetChanged();
    }

    private class onClickInterface {
    }
}
