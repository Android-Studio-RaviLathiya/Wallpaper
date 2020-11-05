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

public class FragmentBirthdayS extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentBirthdayS() {

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

        list.add(new ListSItem("","https://images.unsplash.com/photo-1464349095431-e9a21285b5f3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1567768823253-c4fe2bf7143e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1572299820091-370797da9746?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1557484460-a08474899084?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/02/42/73/61/240_F_242736111_E24QhzXZdJtdoHBJIcmY4a5iYOdqEeAI.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/01/69/71/56/240_F_169715674_pDSK3L9jrjsFXn9sa6cAyxTc3VgbrcqW.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/10/74/23/240_F_310742304_Svor5LmOPnV2qZeEY0y9dGkJt7y36EUP.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/04/75/96/240_F_304759684_6r6xrW4LMeFf20EkatE5nP72DAZxaStW.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/02/45/90/80/240_F_245908022_YrZGykutTQPfAF9psW257OXEnyaZpbdD.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/24/62/12/240_F_324621298_TFGfGzvPU9Wnn57OslCVJcC76A2l6SiQ.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/01/66/15/51/240_F_166155109_2nMFkHlcoMCSP4CBEvDgFOJWGK8a2iqu.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/04/75/98/240_F_304759825_ETNbBoGF21DYDdzipiZeLVS8cDQpf3zk.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/01/95/97/32/240_F_195973257_G0QucGzKyzWqc7sTv5jWfSW3MXncHjwO.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/02/11/61/40/240_F_211614039_cyIaDYMFLUVlv1P55oCfPfRxuTPXu06M.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/19/76/32/240_F_319763279_fonktICZNvPYqBsfJUarOkTVZA2Wsl4O.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/26/36/99/240_F_326369958_ZW8c6FuxP3d0GpW8mmhcYWTVuNkTfjU4.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/10/74/24/240_F_310742474_EE3xm0kbEtFtPkv4tHWdOJfZU3oMeJSj.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/02/27/51/90/240_F_227519063_Y8QVptovNHoToPy4WsKe2nfuhfJMCtYb.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/02/75/32/29/240_F_275322945_Vmpa7Cx4FIBAmV1pWshQwsR7if0fSTSn.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/16/16/20/240_F_316162036_iTdxVlLXK7gqBFN6VNDbIM8UDnQw1xEZ.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/09/44/89/240_F_309448908_9XMR2TQwFGJq9buqgkaU8fNq6tJtGwYF.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/02/75/32/29/240_F_275322983_Dfbz5ftMImdRpdTnJprGJO9jtkausI5v.jpg"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1562539644-e960f9cdf774?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1577653937349-5d89575eaf3e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1571513789328-e9234b096f98?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1558622491-d034166e1be2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1532117182044-031e7cd916ee?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1557020333-3a6ac2a018ba?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1572527943712-e223087ea685?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1495908333425-29a1e0918c5f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1566864399117-22c449669089?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1560745373-dbc6c3f97194?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));

        listVAdepter = new ListSAdepter(list, getActivity());
        rv.setAdapter(listVAdepter);
        return view;

    }
}

