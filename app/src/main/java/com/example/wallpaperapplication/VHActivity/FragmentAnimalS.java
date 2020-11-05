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

import com.example.wallpaperapplication.Adepter_item.ListAdepter;
import com.example.wallpaperapplication.Adepter_item.ListSAdepter;
import com.example.wallpaperapplication.Adepter_item.ListSItem;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class FragmentAnimalS extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentAnimalS() {

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

        list.add(new ListSItem("","https://images.unsplash.com/photo-1501706362039-c06b2d715385?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1539692858702-5cc9e1e40c17?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1582487809094-520150fdb872?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1565440707934-c9bacbad2146?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1586096304913-5cf911154f82?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1550853024-fae8cd4be47f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1547013886-8a845cfd07d0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1578331938116-383d3ed42dc3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1554888676-417ba27d0b04?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("","https://images.unsplash.com/photo-1511282491208-d9b80e3deaee?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/00/47/16/240_F_300471698_0nN8AdlYGnz7SxSrHViC4e0tp0cSnEhe.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/96/35/63/240_F_296356355_0YlFGZllBt6G7J7MbQUK9XTJTmU351ev.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/03/12/26/06/240_F_312260680_EVMXPzgpDj0F5FVoiJUbQ1axYmS5JArN.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/01/75/65/54/240_F_175655424_B5pC3o4vyiP4TEvC32FDdkSAkbJIV48W.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/03/05/40/57/240_F_305405752_HDjCBMszsIz7OhJ2ybT0TeIh3If5CREJ.jpg"));
        list.add(new ListSItem("", "https://t3.ftcdn.net/jpg/01/18/08/32/240_F_118083214_N8nXHmkICQbwwVRVJQKpH8ZpyDkgXyTl.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/66/31/75/240_F_266317554_kr7DPOoM5Uty0YCeFU9nDZTt4a2LeMJF.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/03/12/93/33/240_F_312933371_vMqXBtR0s84b7WHGbUWpgIzVmhrgp8za.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/82/54/51/240_F_282545153_aI4JQT9Tj01VM3ypwCp1D1y3154IVbSw.jpg"));
        list.add(new ListSItem("", "https://t4.ftcdn.net/jpg/02/92/92/47/240_F_292924793_UJriQiQzkgcu7u1jQyo4jgdfuXe9Z4St.jpg"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1432836606614-05efc6b80bd4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1550853352-10b7cbc75880?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1550082278-77d769fe490e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1569706148429-8739e303eb45?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1578181390210-ccf36a1e2983?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1542128763-7ffa06354392?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1522120657009-060ca01afcd6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1569936086881-69432f889bee?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1584050187780-94b40113c243?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1585844677322-46c771c2860f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));




        listVAdepter = new ListSAdepter(list, getActivity());
        rv.setAdapter(listVAdepter);
        return view;

    }
}

