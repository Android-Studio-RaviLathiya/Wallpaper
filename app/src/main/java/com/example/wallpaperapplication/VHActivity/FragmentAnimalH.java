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
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.wallpaperapplication.Adepter_item.ListAdepter;
import com.example.wallpaperapplication.Adepter_item.ListItem;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class FragmentAnimalH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentAnimalH() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.h_recycle_fragment, container, false);


        ArrayList<ListItem> list = new ArrayList<>();
        ListAdepter listAdepter;

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        rv.setLayoutManager(gridLayoutManager);

        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/12/83/39/240_F_312833902_bmlulkSOH1Y9hGvHAUr3nRC4uaBxN4Tp.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/99/85/62/240_F_299856271_vUe1w0ubGwMYHY7eI7NVEVFR140g9Esv.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/19/18/47/240_F_319184773_pdC2mNX4uqtu0Aly3woRLh9ItURoye5d.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/05/29/04/240_F_305290486_YKDAKpHIDf3OhY4egbJUVBkDNj3t3E9S.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/47/86/00/240_F_247860031_4AhRsq4ajQm5b4qfjK6PFB9HDS76ihKd.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/09/42/27/240_F_309422772_9OTXwwgMJzcsG9An7pkA7cf7yDeDsrIr.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/16/86/75/240_F_316867599_G4j7izsVlFP3OaHWtuFgkIXqQIkIOz7U.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/11/15/90/240_F_311159037_N0OOPyO8tRReikocRjLXLmlLGoRQ8h4L.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/05/42/83/240_F_305428384_TEHoMUc6rF6qbmTwCWXejsoRb37iOrvh.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/87/57/73/240_F_287577300_ARW8dqIcacpBCFgydCxMX51yRje38Ec8.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/01/18/72/240_F_301187205_qYdNjzHhVBw6Dt9XeewnBclSdN8CG8Gx.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/84/11/15/240_F_284111534_T8fd2Q2nN88wapz2ptth0iCGXOstef7y.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/56/84/25/240_F_256842595_j3pFXrCR4lkMq1kO8X1BC5k1eg7aTxC2.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/05/24/04/240_F_305240440_2zTTOjN68PmwcQNt2tQ2w5iaZ2TCmYOf.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/01/18/80/240_F_301188083_Be2w41QEE61xHGooXJBtoIdtFBQUy2Oz.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/14/39/01/240_F_114390124_HKMHsKFtK1BrbmjhU6fHCS2scMQO2ar9.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/11/10/65/240_F_111106518_BKYk6YyLZeE20wBVQkqWIqmaNLqY5gu7.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/69/46/64/240_F_269466462_TSTNamqXizg1r85NWdwpWmzfxV5tRaZl.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/22/59/86/240_F_322598603_VkEuQo0I6itJun18BJqltjWAlbRyYw3u.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/38/78/43/240_F_238784302_hDsWlpZm6Up7Kjj2NaB5QYEM6FrjSQzz.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/31/43/29/240_F_131432918_ad59IogkaoURiEeA1XN7uSP8RoZJeJE4.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/33/75/80/240_F_133758070_jfhnP8ax4ty4SaF4LYsI0ybeo0CiPOay.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/04/13/38/240_F_304133821_VYfkHUMXMvWKdIvxJL2jp8P4arKTxQ3I.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/76/82/56/240_F_176825691_2dpsHRuhQEl0X3EFekcuzL7HEfwKqfyj.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/71/55/09/240_F_171550947_Zqrh2g40xfl2poDiEyKimXtSaZYZJJXi.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/04/21/11/240_F_204211122_xlIT7KvWC4s7lxjvNf6WDMyZXtaYRk5E.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/00/12/14/40/240_F_12144069_4OvhgsDLNWCgptzWB6hCvwgHQkR2nMZi.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/13/65/00/240_F_213650033_jLsKcPwaceGf8OIqPMqqbCCKzY0gVyy4.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/27/36/15/240_F_227361558_3vfdihfvJAYkSRlPby8nqY5r7JIoumYn.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/21/01/50/240_F_321015054_M3OswtoERFYbQV8P9qVpsKfFNXTAnnt0.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/89/21/70/240_F_189217086_IuILKUu5bEpVndKVQ7PZvLqlq86o7wAF.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/73/47/05/240_F_273470597_K2d5Jcir3FOV4AzdNDxyixO8FlmOWyTh.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
