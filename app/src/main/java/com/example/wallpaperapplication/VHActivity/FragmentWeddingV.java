package com.example.wallpaperapplication.VHActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallpaperapplication.Adepter_item.ListVAdepter;
import com.example.wallpaperapplication.Adepter_item.ListVItem;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class FragmentWeddingV extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentWeddingV() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.v_recycle_fragment, container, false);


        ArrayList<ListVItem> list = new ArrayList<>();
        ListVAdepter listVAdepter;

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        rv.setLayoutManager(gridLayoutManager);

        list.add(new ListVItem("", "https://images.unsplash.com/photo-1484849757660-7c00c60726b6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1542711492-ff9cbb3c0d43?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1519741196428-6a2175fa2557?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1535254973040-607b474cb50d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1503315082045-a2bfb5e7f56e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1576705870164-139a9ef1ec40?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1549417229-7686ac5595fd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1507217633297-c9815ce2f885?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1549416878-b9ca95e26903?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1508839370228-5ae14793c2f5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1537633552985-df8429e8048b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1513725673171-537abba17912?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1537907690979-ee8e01276184?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1520245880277-df9d97d1f240?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1546032996-6dfacbacbf3f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1523438885200-e635ba2c371e?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1541250848049-b4f7141dca3f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1563339037-84fb4e623969?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1502635385003-ee1e6a1a742d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1548765015-1e047ff5c9e9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1519654793190-2e8a4806f1f2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1549416878-b9ca95e26903?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1507217633297-c9815ce2f885?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1481980235850-66e47651e431?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1507915977619-6ccfe8003ae6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1523264058183-49ea5572cdf4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1518049362265-d5b2a6467637?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1523522182800-c6efde7c67bd?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1567491440850-d490f8f340a2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1565630811305-538dda7265bc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));


        listVAdepter = new ListVAdepter(list, getActivity());
        rv.setAdapter(listVAdepter);
        return view;

    }
}

