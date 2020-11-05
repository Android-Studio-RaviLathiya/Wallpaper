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

public class FragmentSpaceS extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentSpaceS() {

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


        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/95/22/64/240_F_295226418_ux38L1QZwgeISAArRcKE4f1pV2dxbrHL.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/98/64/87/240_F_298648740_iHcrUYOQCtVWS5U74Nr438N5IJ2U3J4b.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/06/44/02/240_F_306440299_rpwLalzMszoQB7CQbx9BVHdlcy9QCeHt.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/77/85/46/240_F_277854607_hVti3ll1mN5USfbZO26XzzDEFHFBZz16.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/79/03/07/240_F_279030771_pMo4u606vF6mscufYoroxD2r1Wt5zmPe.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/77/97/75/240_F_277977555_r87bKfWiEjzxVYid7v8BbeoholYnuqTb.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/01/05/67/72/240_F_105677222_ZmfqeEA132PwExugSl0oC269YDUSv13L.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/19/85/12/240_F_219851246_g5KDySMW62tAEaxG5ea50IexGCthzRqW.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/05/57/60/240_F_305576042_tv8pbt0aHYbUbAP388yNFIIG5sjioE4Y.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/01/60/96/21/240_F_160962192_cXfzGoWF1RNblIwxEPlRZVaLqAynGawi.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/03/03/72/23/240_F_303722315_rEQ7JV1XXxzIU0GVywBu5Oqizqnt8myp.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/16/63/78/240_F_316637867_qiPuVFAu9T5ORo0RlZ96YhGVxnjH6OJm.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/02/94/55/14/240_F_294551450_wfqqjvh3pzWBhPcmj3uwRj8MQtFR7fHu.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/01/36/02/16/240_F_136021630_cQWh5SSfSykXk8tC6jpPLz2GKCLG4hvW.jpg"));
        list.add(new ListSItem("","https://images.unsplash.com/flagged/photo-1585324853527-1c567d53bb72?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1534987658209-443e1e80c443?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1517704268270-c0217c1423e1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1523968063095-61264537fc21?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1586603743460-30dfcc86603e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1585317236381-a753fd821b8b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1585644429312-8c12bfde975a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1568671342180-85cdb4350473?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1454789548928-9efd52dc4031?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1529058837434-d26624857f39?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1545156521-77bd85671d30?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1554659489-e21b81e277b4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1451187863213-d1bcbaae3fa3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1579159279755-14622f5ee61b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/flagged/photo-1585324853527-1c567d53bb72?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1570573690764-f5033492f5cc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1581778806528-88b741bb5cd1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1533732220051-b407d05a7564?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));


        listVAdepter = new ListSAdepter(list, getActivity());
        rv.setAdapter(listVAdepter);
        return view;

    }
}

