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

public class FragmentCarV extends Fragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public FragmentCarV() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.v_recycle_fragment, container, false);


        ArrayList<ListVItem> list = new ArrayList<>();
        ListVAdepter listAdepter;

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        rv.setLayoutManager(gridLayoutManager);


        list.add(new ListVItem("","https://images.unsplash.com/photo-1514316454349-750a7fd3da3a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1502219422320-9ca47798b75b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1542282088-fe8426682b8f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1529426301869-82f4d98d3d81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1493031534415-e40b830b1099?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1502190643063-5e2579fa0317?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1490274494753-fd4f84681e7c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1507136566006-cfc505b114fc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1505065029964-d4ea1830a456?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1531163953594-bc9a034fafb1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1581493807984-f6d6c119dd3b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1542038428-25a73671ca6e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1583949678953-6e878338d161?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1584254520639-ea67b9b108de?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1579159532344-207dd7676041?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1575270301945-49129c858725?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1561579680-7ee92bef4298?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1582267911234-b19bd332d197?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1574777225753-8c02c830b525?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1531163953594-bc9a034fafb1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1486326658981-ed68abe5868e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1542038428-25a73671ca6e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1581493807984-f6d6c119dd3b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1568644180197-ed3148a382ce?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1586289180262-4b732df7b99e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1575270301945-49129c858725?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1584842516356-ce41b07f8e04?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1558301215-e7b1de6c9595?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1570892919264-d89ee5c4d4d2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1559285694-6355b5a41cd8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1583074398571-426276e6d6b7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1567983732912-47030955607d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1567604804331-bd6a15ce9417?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1580200208008-1e4e721d1d1f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1505426519484-49cb8fef3def?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1494257610566-28280a243b22?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));



        listAdepter = new ListVAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
