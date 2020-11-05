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

public class FragmentFunnyS extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentFunnyS() {

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


        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/02/94/71/54/240_F_294715420_vnWG3NVRWwursBnMohpo5lKjS52rnKcY.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/33/02/30/240_F_333023065_QuGqAnf8nw4GeEMizbWu13LcATIYR32i.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/33/00/34/240_F_333003461_NuJiTMc5c6JmjWcoyAZOsG5cP4BgQ9Jd.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/33/01/77/240_F_333017756_0ncq96pirQOzTaQ37oGS3k8g3GUXjo2Z.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/01/76/86/72/240_F_176867251_IXy5fMpmUqXgHblf1h2uoBvlx1YhE1iM.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/33/03/71/240_F_333037198_PnPLOfnh4vZD0GI09lJNBeOesaV92IeH.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/30/03/52/240_F_330035217_8ykfR23K38IOr3XcIfiMWCwUqr8NjTci.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/02/96/17/31/240_F_296173109_cTuORoXNQd4NKvMqtzp9xAAM7uD78y7b.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/20/63/41/240_F_320634152_E7RPjJAjDUDB8vTtKCKqIIcuvsghHQCM.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/02/62/87/36/240_F_262873644_WK2JS3GDTYR1BdmnVgGuEBhdV60YjfN6.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/07/50/49/240_F_307504906_WjHOW4Jbzyrc6ijsbZ9XjL1YGS5F96zW.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/01/78/05/82/240_F_178058267_hlPJo2Rj51y2vlWw5NA9EqTeIhIILxls.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/28/14/87/240_F_328148727_dlJ2SHiaheQdLD1jjgMe4whbfCaDlU3E.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/01/75/65/35/240_F_175653583_0O1UZzTIGX7E3ZLBjsuMmmg5wq6ekL2a.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/03/14/35/10/240_F_314351054_A6kzoCdpo1xx4CQrxqO23xrG2L8DqBfr.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/02/75/61/98/240_F_275619809_nJd9JL9TdYwoBwB6HwIIuOrOqm2T7Fqk.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/03/09/45/93/240_F_309459347_Qt7WnVVZDrjyfcWhd7uIdDkx370aLkVb.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/02/72/50/25/240_F_272502556_tww8E7PXblIJzjI1RyrBDZcSkzYDsv0c.jpg"));
        list.add(new ListSItem("","https://t3.ftcdn.net/jpg/02/72/12/26/240_F_272122612_pMWGZZzMG2D9kV9pCJsi8KQPojnZ2DFh.jpg"));
        list.add(new ListSItem("","https://t4.ftcdn.net/jpg/02/72/51/55/240_F_272515577_soKlfhJ5DtbzPY502Rrzf2T43rIcnLKW.jpg"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1543312872-6800b9d9e30f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1517416292776-dcfa7e818bda?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1537101875968-1d7f74f5208c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1515175704145-8a06ffce6b77?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1563038063-93da6791f887?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1509205477838-a534e43a849f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1507808973436-a4ed7b5e87c9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1572212967671-8e73a807320a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));

        listVAdepter = new ListSAdepter(list, getActivity());
        rv.setAdapter(listVAdepter);
        return view;

    }
}

