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

public class FragmentSportH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentSportH() {

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

        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/74/36/55/240_F_274365517_UUwN5XpIvnp4h2dk6WXTYquBgC5O2JWN.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/46/08/54/240_F_246085469_hIVhuF98NapUOGaAniSAmpS5TQFqFybn.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/84/87/50/240_F_284875073_DAUfgHlhA9R2ecFmjZ8GH2Lu9n7wuvTy.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/09/16/99/240_F_309169936_6vVh1kx1ppPdUPzCltIBizJcS5OCnlOk.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/05/42/15/240_F_205421550_V97HX8CA4wfPSAM0ixHYuGEeDshBvnlH.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/90/90/42/240_F_290904251_5K8TMfzmoKxp4bFkAFlhgr2fxQa0VSGQ.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/07/14/51/240_F_307145143_ZMZ4s86WDLZKuQtZa11Sk0kr7v1ZhQF7.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/51/39/27/240_F_251392710_dQNvVSGEGYtQzEwRFDSqV3YFRO9U0DCT.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/45/52/66/240_F_245526609_pyfV3JV34FyeUgKD3cZFl63YXo3LedGK.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/29/56/80/240_F_329568059_WWrGwdqz2K2MhHIsi6BaEhxH9nuhZhRv.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/32/82/65/240_F_332826531_Hsz1XLkRUjRjMB1tKuwXtFTBGSB9TyGa.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/01/95/33/240_F_301953320_57ylg9G74aqKRCQEuibgxb7M3ghLNrxI.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/00/35/72/240_F_300357294_fVZ8kRhXNMovy9Om0REEAZ61AWkR3itY.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/20/49/25/240_F_320492530_2aeFG0eKU03OM20OD4eLzRte0K6xpw9i.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/99/94/80/240_F_299948082_kukkv1pOWWc4p1hvvB3iNpakpdMPREP1.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/97/52/81/240_F_297528198_uu6DjM2ZqSp5y0nXMeo2WsUFOhlyeHeO.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/01/50/09/240_F_301500986_qCAjGaPZYWkENkljKCtzpY7pfi5gpytV.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/55/78/60/240_F_255786001_nqunh2BB5NWxpKyHaGWaelZo5qW3smsV.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/20/79/18/240_F_220791837_ztmZnR9yus4WJ391L4svu0XyWX12jinZ.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/15/32/04/240_F_315320454_SHmKYXpZDA0A4U53rondRC1zCKLGEFcX.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/74/23/92/240_F_274239277_J33scdVL4ZX3cUBbXhQ2VSajdR1Jj2Zs.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/92/55/01/240_F_192550164_VVYarvDCfPVm4diPG9DpbI2p9M4TFC2a.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/14/62/80/240_F_214628027_uT0hDv3mx5zV0894NQedxvIc24KB9Jkt.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/96/14/66/240_F_296146695_a77xRyLz86vXAmeIAjnANnA5UrtIDzhe.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/46/18/19/240_F_246181980_yWfy0IsWTjwIvfro0svKFh14KJwQe6KS.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/25/74/92/240_F_325749227_pUTl9YOIQBiykZkIo2dLMWg9r2IBHBbx.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/34/65/76/240_F_234657662_ljH91teg0wkyXyq09i8lwJoCVmJ2rBHS.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/26/74/75/240_F_326747512_Wws209KEvEqljCBJM1Js4eDfa3s9PBKl.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/24/00/03/240_F_324000329_ujhKJnqJUvNuoXQH1YRJv7ZUrPXaMEp7.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/00/41/04/46/240_F_41044614_rzTAXpJESUtUtGBgC1ykTsBfK5ngUeNB.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/00/91/50/17/240_F_91501759_1jfyK7yr8fwsM5eJ0S0qZGspz8ai9to1.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/30/86/04/240_F_330860432_eU0m21SlfA0d80PLttJjUjGwU0Q4h7DC.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/74/23/97/240_F_274239753_JjarilXCPKzo5bHsNdXz2qLtzcHv4ivD.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/10/71/90/240_F_310719004_Bvm2BRdRrI4rOeADieg5Yqjl1daT7ZQ8.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
