package com.example.wallpaperapplication.VHActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallpaperapplication.Adepter_item.ListSAdepter;
import com.example.wallpaperapplication.Adepter_item.ListSItem;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class FragmentSeaS extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentSeaS() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.v_recycle_fragment, container, false);


        ArrayList<ListSItem> list = new ArrayList<>();
        ListSAdepter listVAdepter;

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        rv.setLayoutManager(gridLayoutManager);

        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/96/37/05/240_F_296370518_HlSgULLKjkOuCWov47NXVG3TrHHg35FB.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/07/20/94/240_F_307209428_E634o7PyJhg0pvpUMwhQjmQuGV9loJys.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/00/94/76/240_F_300947668_vCuIof2ZJHinZjADJWwlkm6w1DOZ1SNn.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/70/64/62/240_F_270646211_JRHM2cyNygt6Hi0slgs1xZvBEN8MWmZg.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/21/54/18/240_F_321541896_whOeU6YnLCWeFKZlxugpnTSzlDnTtB4g.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/32/99/96/240_F_332999629_7Anpb8gtJLSUst8nQvByTV8qqYmnmvaj.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/01/59/49/67/240_F_159496721_65Kzc0nJgpi2iBhelJxyYmUj0k6WymJu.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/10/38/88/240_F_310388889_oqP3VAGx1gBNSkzC66qccqHyJX4VePCJ.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/72/51/40/240_F_272514000_6A2Rzx0zF2W91xsfkxthxKfo0D4o6CE2.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/96/37/40/240_F_296374009_DlseLBjMj5phoKW39xwHnH4P8LXbUN6Y.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/03/00/49/21/240_F_300492120_O3vSXn68N2XtZik9Wt1tiwzsiM1MmK01.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/98/15/56/240_F_298155684_1y99Odw4PbcWBD2vnsuuDYyYrwLHqqzh.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/03/04/50/57/240_F_304505723_0HRXkJlsGyHQ7BcWCJPgRSFxH9iOPd6G.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/01/72/71/05/240_F_172710593_BQtMc4o4xNUItIE3txQhDNATiF5osjVt.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/03/19/33/59/240_F_319335920_Vn2na1KU0mZUzFGnhQPku1NgJzJrIXAe.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/01/71/45/80/240_F_171458069_HC6so4JtswwYQ4OS0kI9VOiWCfS5M1rU.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/33/02/14/240_F_333021481_ZJYudhYQhWWXXWot90sBOihJ5CvftsiI.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/96/37/60/240_F_296376080_zL2SdCu4D4eRNYqqjTpNwGs0jLFhUFUK.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/32/99/92/240_F_332999231_uo3F81SuQPQkXsNYef9FGaqI058YCoGx.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/52/32/81/240_F_252328170_KnitvVrBO91VkyzVDMmm97aRGMF871hH.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/96/37/73/240_F_296377352_ylyNZmATNqwpSsbfP1NATTd07A3LuB8j.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/10/38/60/240_F_310386098_nAm24wtZF76ZK0IhW8iKKnFutwp7V438.jpg"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1579159286444-48ca14d5b3db?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1564988806565-d87f43c9985e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1552913627-e7c36704ddd0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1547299869-5f213505b8bd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1559317456-86cdbb8b6161?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1568077824668-fab5a7255d86?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1561810605-c7c975936a67?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1555108562-682644b4c084?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1559836938-7b40cc3d125c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1583534263938-23ff3511622b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));

        listVAdepter = new ListSAdepter(list, getActivity());
        rv.setAdapter(listVAdepter);
        return view;

    }
}

