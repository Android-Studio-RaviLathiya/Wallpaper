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

public class FragmentArchitectureH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentArchitectureH() {

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

        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/86/11/19/240_F_286111980_XtNj72uqSgDiMSkpwxfkc85m6m1Y1gsP.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/98/57/33/240_F_298573382_URKIYbTYXXuAYjeIZBsb7bRZcz2PGY8b.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/31/65/72/240_F_331657234_PU9SFvQlN68Ph3G1Di3e6l8XDYpKcxrr.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/47/80/62/240_F_247806225_mWmUdEa9A3Hanmj4vsDVs7QgXhl2QAM3.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/84/39/38/240_F_284393883_TW8Z2kw8N7jqVQKlcxDICU0BGgNgvFjE.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/90/79/08/240_F_290790802_0M2xU0sUXn0H3Usw4COij5qtQuFanE5d.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/20/40/45/240_F_320404579_f9CN2tx9A1LsxKKJ2RWAKcXk1neSwWzR.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/16/80/36/240_F_216803601_AOi3nCM7wPpAFZkI3LYOtVHL8S7z1272.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/83/49/83/240_F_283498342_cP1LMT0DkHSbfzLTOUZNMbYkMKJZ0B8T.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/04/42/95/240_F_304429513_TR3sTulynFF1Wtrw6oLFPZscLGswldf4.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/33/48/94/240_F_133489406_ex6yaGd5xa7AiSi1MIjePmrzp4RGjOHD.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/07/71/16/240_F_307711627_vdjRCz5FUaL6HBOMx6L3X0jlrThrM877.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/24/67/37/240_F_324673753_QZrsM5OVU9rvL3HHUO3ITMmPsTbzsRa8.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/04/06/20/240_F_204062063_Y0A77IVcvWv09CNI85dUrmEFDDnQPUan.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/34/17/16/240_F_334171632_jB85B225DlDVEvuSRZ9QkSVJwLCkBaYk.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/74/92/91/240_F_274929177_Q6xgPROMWP3yCxL4LQgpzIOVJ98p76eN.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/81/56/80/240_F_281568072_HPFy4WVLv2HU8WEXjuNEmIdrZWLJFg2N.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/16/63/55/240_F_316635538_HAmE0tJbWl93EToFfXAdlFe3iGVuX0Tf.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/20/63/88/240_F_320638885_4pSGoH3xQ5iJLAdHkNdox3DaMBB1UZoO.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/02/48/75/240_F_302487573_3ozdVRpZ22RvYFg7krMUde7yaae224ew.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/00/71/40/34/240_F_71403403_X1EHtRkfjKXX5dzOedlYPemXI9Y1xBTL.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/99/30/12/240_F_299301215_jmJVHdkESqIZf5mzLEZCxpg2V3FazIFY.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/28/89/44/240_F_328894430_q0q1NS71WgqlLKxVb4D5RcXK4JovpPgV.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/00/71/40/34/240_F_71403403_X1EHtRkfjKXX5dzOedlYPemXI9Y1xBTL.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/08/96/61/240_F_108966109_4ETYL2PZHycberoiu4S3nc6iH0yEjo1d.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/03/58/85/240_F_103588534_JyIAnrhfGEypUH0yfhkf9a79Nn7C7RjG.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/00/81/87/33/240_F_81873311_hQ1QqlaKL8lXWvVJebzhro4L6q6krqyP.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/80/79/09/240_F_180790975_7N2E4HDxK58Py6Fb4wPAIk06iZIRwEIu.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/00/95/55/81/240_F_95558169_Sa7BKbxXaM6Sp4LFflR1BnO2SH4WJ0qb.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/72/23/66/240_F_272236661_FpxJjrVwxYys822eNGYtPCrRuImDykZ4.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/24/59/97/240_F_324599709_DXgMuIhStJ5wLERYTwoGiMgyz81Kvxcz.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/00/86/19/81/240_F_86198156_SgmxRZ0tTZvg3OzIXQWT0PInuOYgzCuI.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/00/78/39/61/240_F_78396116_oRUZu0jrhSdovmPWrc0p9yBeQBdioAvS.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}

