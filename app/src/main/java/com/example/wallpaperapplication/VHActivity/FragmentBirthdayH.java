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

public class FragmentBirthdayH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentBirthdayH() {

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


        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/56/16/13/240_F_256161360_0QCIPBVl1IYXCboiZYKx8S7OK51EZMfP.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/69/19/65/240_F_269196580_cFrcA6J9ze2vCTrvBSc7ZT9WVLsutupM.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/00/46/86/07/240_F_46860760_8yJ0N9en1L4PpIEWPqFjgZz4uWZB2RI1.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/87/71/78/240_F_187717861_EBW4N9NmH2avRm4JRr3D7CVPKShCIkKN.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/20/69/96/240_F_320699676_XB2UKwDHVPIUhvmn0awRkD98aNuQCfla.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/28/07/60/240_F_228076057_xRNi8bUYkCVuyVLiuFLNtsf1vnh0Qf9E.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/01/12/45/240_F_301124516_7F0heMNSOjYCaqQduXz3jJxVVcvr1cMz.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/15/04/24/240_F_315042473_SzYKdjFR96T7UKodyCt7yYk7v8d7Smxl.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/10/28/41/240_F_310284184_Ftt4rn7KP2CIFWBShXh7OJdlHxanFAuK.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/78/08/86/240_F_278088654_MtJDN8mFbgdzdvARnJDupCiLAfmXtQX6.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/96/41/75/240_F_296417552_RFvivEPEs0Wc0lZ6PJcYFnjybJuwc5at.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/00/35/54/82/240_F_35548288_eVCsUkLDwMW8ZVw72zOWdb7duxmOn1PH.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/61/01/78/240_F_261017866_2QU2XVLJz1UZzkAFJ1LGfq07SvrDVUaO.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/05/36/08/240_F_305360834_Zesz4HLpPL6AQ5WohWV9UjDETxlXUFGt.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/03/63/92/240_F_303639278_V3EPq7FpbdPZyDQNwKdZCiK74vAyIi4e.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/00/85/32/65/240_F_85326596_oh14CeDKrsIDIBYpIjGy5JpQgfEP7CIm.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/94/19/10/240_F_294191007_631fJ1jTspwnuwbyRmob0f8Oaea5HaoD.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/27/43/98/240_F_227439878_Ch92zDs3Z6mODCeAhl6BmVZaBrX66dC9.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/16/54/15/240_F_316541595_WTr3J3k0JgZK1lJbkAsrLgqTZG629znW.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/06/74/35/240_F_306743556_kbLnbCqEwKyo79ofogGaF3GTwYTMRfL2.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/15/38/51/240_F_315385108_dzK41Weu7i4SU6s3ljIYQvyQKNUZGt3k.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/20/23/22/240_F_220232288_rQhNhiC3oK4eRlNYMsZlSTN8mF5UDG2v.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/16/65/71/240_F_216657178_yWv2R4Zgmlc1zaSSAYC7QO5I1GGt38ir.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/32/31/42/240_F_332314205_P8UsQIRLxGV4c0FHN7mDULaHH9UhrUG7.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/70/23/75/240_F_270237541_1hPJQvxemM7NkWBHVYqmVyFc8I74tw1k.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/72/78/57/240_F_272785700_hGVFtsRawM71sEo3sRjaUSl0OKmMf2RC.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/34/64/45/240_F_234644577_bMFFrSb4PIvJI7bgKq8qFtMesPzVCfAd.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/41/36/01/240_F_241360113_N846YF2w56HciVSQKfmQHEGqtXCzjAzx.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/22/30/19/240_F_322301991_HHoYbHsqKWdJFM0yIK7B1XSPXUX5f1Vm.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/83/30/12/240_F_283301245_RttWHjrTaWWZbiZc35p3ezbNdPdsIzvZ.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/17/91/14/240_F_317911497_XI9p2MnNt5ffSXj5x1CLtEjANB7vlyA9.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/11/00/61/240_F_311006196_PGCoK2xNheLfV7sMEuHpNKPMisonU36k.jpg"));



        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
