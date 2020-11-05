package com.example.wallpaperapplication.VHActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallpaperapplication.Adepter_item.ListAdepter;
import com.example.wallpaperapplication.Adepter_item.ListItem;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class FragmentCarH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentCarH() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.h_recycle_fragment, container, false);


        ArrayList<ListItem> list = new ArrayList<>();
        ListAdepter listAdepter;

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(linearLayoutManager);


        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/98/29/21/240_F_298292197_0JPtQig38BVMRFhq5YAJuwZse7wzcMsT.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/21/26/91/240_F_221269172_ICFmO2IH6Zc4ZpFn4neNZNvycPE1kPls.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/05/44/72/240_F_305447224_YGkKcSeZwOg1CgUKbim7Z9Lsm2kyRe5q.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/95/68/39/240_F_195683943_TcHLwGPadXXbEdsOVg7woiKBHN3No6V7.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/97/21/33/240_F_297213354_QlLbqZmwFLGdxNncDP6gMilzwg37A5gR.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/87/51/02/240_F_287510215_jnRgGcwmkveA7lMenTHndGeQYwbxIAIs.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/18/38/96/240_F_218389666_xzkbQUK4NmM0UvjBIMtqoBu0IXJXspMf.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/68/97/21/240_F_268972119_t5vGJLiaklQWsBiLfMYCIctruke7gbNQ.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/02/94/10/240_F_102941098_hBIbzicmmDJMYiLutc7NIUy2JMqoiCcG.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/10/41/30/240_F_310413065_D5FZEW1vQmDi0VjJjOeHTiKXk339MohP.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/20/08/75/240_F_320087550_bdOncRwUTKrDtGpxpAoPpuUjKarFzL8Q.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/33/04/66/240_F_233046669_PoeeldOcWuI9mSZawzNinoWRiuYMLkna.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/49/17/37/240_F_249173791_2DBKyr6nTUANZXSZRxMgNdCetJn76pSz.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/02/27/95/240_F_302279500_a5GGFqnBM9YPJnBY7RxIQXL2UtQHUKyu.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/95/50/93/240_F_295509383_spyokK4UBZKWjGJxtTzYcjb2nF1IoOYX.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/01/18/53/240_F_301185367_aW8nPhKvkqeZCo3uqOR0N2ylaOgnI6fj.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/26/98/55/240_F_326985559_K3JxN5tAOosChlUQk3xZ57CY2xKkf1Jp.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/16/13/21/240_F_216132145_iH3DaIego5ucBf7t2ZRfYzYfMZbCoSQM.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/37/02/28/240_F_237022893_CbNuElBdTGRz6596zDkIdiRL9Yz24i16.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/06/01/83/240_F_306018358_4lWGolMVEp0IZrMHpN3fzheIKRqPnVui.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/08/66/70/240_F_308667078_Xzkc5jJFxxTp8PBQR6Na1QEjF1cSG1Xe.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/96/66/32/240_F_296663206_syA239SbdZKovlYRfZvPB0Kyj3KNo5FX.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/84/30/45/240_F_284304518_BbRSFMJFRtDnxqETMGkBqg7JgsSjv6Hx.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/33/32/27/240_F_233322719_eqaRBT0IN1OpRAm9BhCLaTL27dR8hmdB.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/31/62/97/240_F_331629785_kioV0FSxuDAaRrmeUD0yWIZ6RU6KDqho.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/75/97/39/240_F_175973996_TPJ4T9GwLfiP1ep1qi1HhkRSKfW1lSr4.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/07/08/37/240_F_307083755_WRLsuVMC4q2p4UrxFoM1ac3ui8sfcury.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/99/17/02/240_F_299170279_VU8QpheNFDFhM6OLzodG02svqYqzy3cJ.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/57/08/38/240_F_257083803_vI3u8niCsOqi4ZzmFA1ExGJliB79DxMz.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/48/62/51/240_F_248625168_6DSHNYohimUOcorLNQaeWZyvhIZkV7lR.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/81/39/68/240_F_281396886_9Epl4SDnWhU4n3R4N1J85EGu4FtMThMT.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/32/19/76/240_F_332197658_afJpLmLH0XwfqJtZ5LCzjfRiglki3ydU.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
