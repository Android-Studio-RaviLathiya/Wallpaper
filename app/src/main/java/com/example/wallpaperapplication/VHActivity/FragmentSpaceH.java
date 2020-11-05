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

public class FragmentSpaceH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentSpaceH() {

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


        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/96/73/99/240_F_296739990_pJnexwztYq8P9AHRSHkiIuhITnPYFsIv.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/99/01/38/240_F_299013847_o66kOoQT7JjGQAVw0i1BDuvedBWlFFAt.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/85/36/95/240_F_185369586_H5N12M2ds5ctuMR6TsuAVpZypM2Xcdak.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/84/36/22/240_F_284362264_v72E8Dek8FfvrN7h1Myr8k1MBrvcv4Pg.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/00/94/80/15/240_F_94801594_leFb5IOjuF97UjcRLC8tuPVoVA3RTzz5.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/96/65/97/240_F_296659797_CR2UMHCITyBoWljcCvBSrmsHTgv7Yg9b.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/09/35/14/240_F_309351482_jEXPABshQfM7TJTyzlogvCKKHlh2heZH.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/13/77/31/240_F_213773185_3OCuSz2DXkALhtzlzY3dJaSQeUMQuIJo.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/98/74/86/240_F_298748650_IQeHuXb6ezzI2NU0sNF5Iq5WOZmfu4z3.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/85/47/81/240_F_285478116_DyxsiJTFVwDUYdvKCeOf3RAuN0zFPuqS.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/10/17/56/240_F_310175692_kcmFLM6owCdWCkdYbH4gZst7Q54MJYwu.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/07/10/70/240_F_307107077_VdFtsDVtVUXbYlpH30D3yeGYfLBbPglk.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/99/05/06/240_F_199050613_fjtUmiQQ2CdcnP4YBtBcOVXwxH4v1QqX.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/95/74/78/240_F_295747858_UqzSSQGOoRHZLDDIcdsiIePpwHWHCKhW.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/97/94/31/240_F_297943192_vQ6KW3kZ8z3oP6V8ng78nmDNPG2cVUFG.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/26/34/79/240_F_226347976_UC3Ig93o3mjPhKxGB4sb0V0O0E7AL6ag.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/14/05/37/240_F_314053708_akEFtbwEyGVk6szdkVezWeVQxJ2Js2UJ.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/81/14/30/240_F_281143043_GffALcz8XCPiXwZeCgSKgeKvGbaP0np7.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/01/60/81/240_F_201608127_PZTfiy5xruhOPUmoVzBPPKmfxYsazjsE.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/88/69/15/240_F_288691510_GUg6qQ3EDLM0mxnL7UC3qJ4Ev7JjVWGb.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/00/74/42/64/240_F_74426420_YSvwuwziFftnCWJ3y7Yk9dQv1i30UNes.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/98/32/00/240_F_298320052_X2luqp5Dvr1DXoTTwBCiu1hqgyTMdnc1.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/31/86/58/240_F_331865852_3o29swZNuGP7RQv3CCMUReqYNjbuYvlS.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/06/77/88/240_F_306778867_HNOftxT1H47ofalzimZBtGGxkBc0bw5i.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/20/81/17/240_F_320811792_qgiY2he7PhuKwlHT9ROnwu0jtiYCTGu9.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/40/20/17/240_F_140201767_oEmOpDtcxQykhbRV9FgJmYwcX1lHS5V7.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/04/43/22/240_F_304432223_SImbOAsnogonFChapHqsGb4KEuFIgh8y.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/78/32/37/240_F_178323730_e6c50l9YYNqhTiX7P5Qms4yNT2aC6GZa.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/11/55/36/240_F_311553635_QyF80anIcrgEqmkTMxSl2dwb6iIjO5df.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/05/17/09/240_F_305170906_lJmUmYzda1WI6a9afQCVZt6LdUlsiBVK.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/04/67/08/240_F_304670897_CnqnPsySLUxpCas9WeZ6ys7ydspSH0lK.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/99/01/79/240_F_299017902_dl3hiigZdJadrBCJdhE51j99TczYhvxA.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
