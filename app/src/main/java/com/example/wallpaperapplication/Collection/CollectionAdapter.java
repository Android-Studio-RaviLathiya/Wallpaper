package com.example.wallpaperapplication.Collection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class CollectionAdapter extends RecyclerView.Adapter<CollectionAdapter.COLLECTION> {

    ArrayList<CollectionItem> collectionItems;
    Context context;

    public CollectionAdapter(ArrayList<CollectionItem> collectionItems, Context context) {
        this.collectionItems = collectionItems;
        this.context = context;
    }

    @NonNull
    @Override
    public COLLECTION onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.collection_item,parent,false);
        return new COLLECTION(view);
    }

    @Override
    public void onBindViewHolder(@NonNull COLLECTION holder, int position) {

        Glide.with(context).load(collectionItems.get(position).getImg()).into(holder.img);
        Glide.with(context).load(collectionItems.get(position).getImgone()).into(holder.imgone);
        Glide.with(context).load(collectionItems.get(position).getImgtwo()).into(holder.imgtwo);
        Glide.with(context).load(collectionItems.get(position).getImgthree()).into(holder.imgthree);
        holder.name.setText(collectionItems.get(position).getName());




    }

    @Override
    public int getItemCount() {
        return collectionItems.size();
    }


    public class COLLECTION  extends RecyclerView.ViewHolder {

        ImageView img,imgone,imgtwo,imgthree;
        TextView name;

        public COLLECTION(@NonNull View itemView) {
            super(itemView);

                img = itemView.findViewById(R.id.img);
                imgtwo = itemView.findViewById(R.id.imgtwo);
                imgone = itemView.findViewById(R.id.imgone);
                imgthree = itemView.findViewById(R.id.imgthree);
                name = itemView.findViewById(R.id.name);

        }
    }
}
