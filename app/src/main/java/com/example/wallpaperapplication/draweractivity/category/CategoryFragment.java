package com.example.wallpaperapplication.draweractivity.category;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.load.engine.Resource;
import com.example.wallpaperapplication.Adepter_item.CateAdepter;
import com.example.wallpaperapplication.Adepter_item.CateItem;
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
import com.example.wallpaperapplication.MainActivity;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class CategoryFragment extends Fragment {

    private CategoryViewModel categoryViewModel;

    ArrayList<CateItem> cateItems = new ArrayList<>();
    RecyclerView rv;
    CateAdepter cateAdepter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        categoryViewModel =
                ViewModelProviders.of(this).get(CategoryViewModel.class);
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        final RecyclerView rv = view.findViewById(R.id.rv);

        categoryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

                GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
                rv.setLayoutManager(gridLayoutManager);

                cateItems.add(new CateItem("https://img.freepik.com/free-photo/vintage-miniature-car-minivan-fake-landscape_155003-1094.jpg?size=338&ext=jpg", "Car"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/portrait-collection-adorable-puppies_53876-64793.jpg?size=338&ext=jpg", "Animal"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/sad-killer-clown_1368-8634.jpg?size=338&ext=jpg", "Funny"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/overhead-view-different-type-sports-equipment-green-turf_23-2147924662.jpg?size=338&ext=jpg", "Sport"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/young-friends-with-birthday-cake_23-2147720226.jpg?size=338&ext=jpg", "Birthday"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/summer-concept-with-copy-space_24837-116.jpg?size=338&ext=jpg", "Sea"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/smiling-gays-with-rainbow-flag-looking-same-direction_23-2148141018.jpg?size=338&ext=jpg", "Festival"));
                cateItems.add(new CateItem("https://images.pexels.com/photos/220201/pexels-photo-220201.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", "Space"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/top-view-healthy-food-vs-unhealthy-food_23-2148194603.jpg?size=338&ext=jpg", "Food"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/top-view-holi-color-white-background-with-blank-circle_24972-436.jpg?size=338&ext=jpg", "WaterColour"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/beautiful-background-with-different-flowers_1203-1647.jpg?size=338&ext=jpg", "Flower"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/lovely-bride-getting-her-hair-done_23-2148106139.jpg?size=338&ext=jpg", "Wedding"));
                cateItems.add(new CateItem("https://image.freepik.com/free-photo/high-angle-architect-working-building-plans_23-2148243000.jpg", "Architechure"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/crop-couple-with-lovely-heart_23-2147737363.jpg?size=338&ext=jpg", "Love"));
                cateItems.add(new CateItem("https://img.freepik.com/free-photo/front-view-cute-young-girl-eating-ice-cream_23-2148305320.jpg?size=338&ext=jpg", "Baby"));

                final CateAdepter cateAdepter = new CateAdepter(cateItems, getActivity());
                rv.setAdapter(cateAdepter);

            }

        });
        return view;

    }


}



