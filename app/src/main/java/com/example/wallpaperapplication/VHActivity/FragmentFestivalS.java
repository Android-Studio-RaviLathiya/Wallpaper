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

public class FragmentFestivalS extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentFestivalS() {

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


        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/00/91/72/27/240_F_91722706_rVdlO9eD3JuIg5aSYEGyAWeaeMjL2uej.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/11/59/70/240_F_211597081_miaH6eWNcXYM9ryy7tDlxV7R7Zl92E7f.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/00/87/45/76/240_F_87457606_fqqI3ZCF1xYo4M3WONoSeGXmL8SC57sb.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/71/57/45/240_F_271574574_P6T9yi1bkdTtZKIHATbDBoFDrMuXGxoV.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/03/68/28/240_F_303682858_M1U5G94rz7O5JjDsuEGFH5EQgGMBP9kc.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/00/93/94/40/240_F_93944025_Eiiqup4nmVPOCLlSsdZvKxQdk22Yj7Yn.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/00/89/63/34/240_F_89633449_rcTY4vdSIBokamMniYzbDdbuA2kCG7Rx.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/99/29/99/240_F_299299942_xjdlhUWXxOYl2ulCUWCp7Xl3klWxFAq3.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/11/59/85/240_F_211598518_p1kkPBuoMgCk1sYoPVkBBtc62aniYP2D.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/03/06/89/45/240_F_306894593_3g9zD3F4nHD7Ddm9y5r9BMdUrxOuik8b.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/69/60/35/240_F_269603548_BK8FOHRa5w7cog9wHk5yh2ULAEDOIZmK.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/01/62/47/58/240_F_162475884_GLh6DbuZLlFLlXp8QrdzbNM2yXrn8RnE.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/01/23/22/64/240_F_123226414_fdzRAzNJNKCHkqoEJXPkIlFBBSduLfLq.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/01/68/00/10/240_F_168001002_nyGWhPHuXmakRuPmalLjD31FYS6hkURO.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/35/61/62/240_F_235616257_npQvhlqCfbwijP7LgaAX2NYf7Q7NABSn.jpg"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1530405911872-686782e1a995?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1564420179805-f08bbcba4346?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1560579392-7031c9c222f5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1519193293811-9fc61be15ac9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1560579183-5a1786c68413?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1565859937791-1f096cc065eb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1526785654655-e01ea2b6e2cf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1546594283-b17df245238e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1549996584-fedbfbbdbc79?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1562128246-93d0835e13f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1556978254-407bc35f8e66?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1584216531128-e63eb31e5ac5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1484508005949-1293190f1c8b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1544263130-cc664760b322?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1566022858096-bf3aecddc748?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1558798927-24f87099da5b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1544380698-68bcafe63592?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));

        listVAdepter = new ListSAdepter(list, getActivity());
        rv.setAdapter(listVAdepter);
        return view;

    }
}

