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

public class FragmentSportS extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentSportS() {

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


        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/07/27/30/240_F_307273003_zavd4nKv1uwqKGzACtFmtpupFGFe6hNw.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/11/17/24/240_F_311172490_NsLKGp6TtEwu1H71RMQmMc7OyoR54MUH.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/02/96/88/58/240_F_296885816_wXKIPRSMkyruBrVEpM31csh6BKAiJ7Q6.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/15/86/16/240_F_315861649_SEDPcW32mOIlAiDd1y370qzFaZMZlA53.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/07/87/12/240_F_307871242_EqjxkNALgcI4oir5d8vUF3VCFrpMkDoo.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/00/08/92/240_F_300089255_NAQdTegHLJvXnbGgp1HnZpeKROrSdTXq.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/02/98/60/46/240_F_298604606_weHqIsW9iYbmhbu8LSf6U5rZLbWL5ySr.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/13/38/82/240_F_313388284_jCjPZO5rt7VBaFmsvLT4wmiMNitu6ZRf.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/01/78/11/64/240_F_178116420_V9vcJzYrMwShZXAQPVm8rrOGMq73fyD1.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/27/39/55/240_F_327395572_k7elBFbMS6zSKyS1f5D4OeCGqijQ1uvc.jpg"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1585537884352-4a5eef41095f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1493225001062-066006222cff?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1566757213685-a92a79be3659?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1526864947482-382a25347d51?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1554305049-aff1880bbf53?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1526391922840-891b87f9af1b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/flagged/photo-1576020880196-25246603d592?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1462870269668-718e186aebb5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1580842985328-713c009ba577?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1560452192-ce93f2f642e2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1568910720789-a6ad890abf39?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1454663501801-75a30ab23c6a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1559949557-7d0ac3e655f2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1585162698039-2dd533d5d832?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1511204338744-5d4e9b3ffee0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1581439115292-0f0c104be09d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1557053815-9f79f70c7980?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1547645621-ab62e1972a20?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1500579886065-5a7705cbf1f7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1586019679309-907bb7d0431e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1485727749690-d091e8284ef3?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1569774308383-36b2e14a62c2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));


        listVAdepter = new ListSAdepter(list, getActivity());
        rv.setAdapter(listVAdepter);
        return view;

    }
}

