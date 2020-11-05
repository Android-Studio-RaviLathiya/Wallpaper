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

public class FragmentSpaceV extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentSpaceV() {

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

        list.add(new ListVItem("","https://images.unsplash.com/photo-1532882861083-5a9b065d0035?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1507499739999-097706ad8914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1516339901601-2e1b62dc0c45?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1536697246787-1f7ae568d89a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1501862700950-18382cd41497?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1446941611757-91d2c3bd3d45?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1567568223954-0ef51823a588?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1532798369041-b33eb576ef16?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1502581827181-9cf3c3ee0106?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1467106015942-a0ea2960655a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1573328708455-dc431492fb8d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1579218158473-0c6aeb56c4bd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1525215351243-2ba501f3442c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1579476197776-c3414a327221?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1529474698432-ceeb8e5cb9dc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1531333377070-c6575ba98c97?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1532767153582-b1a0e5145009?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1559297750-8fdd006bad5c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1515851644205-ba5667246676?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1545701498-a098ce9fdced?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("","https://images.unsplash.com/photo-1580884199526-6292843d7105?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1507917570388-d661984ea008?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1515272751348-25380c6c1f9c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1573328708455-dc431492fb8d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1578809200950-ff7ec05fc4ac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1576610383320-f87417fbb5af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1579476197776-c3414a327221?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1525215351243-2ba501f3442c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1529474698432-ceeb8e5cb9dc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1532882861083-5a9b065d0035?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1551650912-b702ab8fdfa3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1530171538432-05567b463984?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1532139782373-d47f68b44c7d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1500586094511-e20694811d14?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1531325240611-1ffa493f6016?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListVItem("", "https://images.unsplash.com/photo-1567574380556-e7463b68b646?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));


        listAdepter = new ListVAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}

