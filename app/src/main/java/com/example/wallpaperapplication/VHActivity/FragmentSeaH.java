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

public class FragmentSeaH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentSeaH() {

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

        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/06/18/53/240_F_306185344_hPyCG006r1QQ2SFP886RIg7oq1aXd7lA.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/00/78/67/05/240_F_78670568_Kxqs1FbtRdsp6soMHyMXgBiEtW8yC9qN.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/66/10/91/240_F_266109149_iVT5kbkAx3PqcgfnKffRkOI5AKNIH6Yq.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/47/22/64/240_F_247226410_z9uphdvKw8S0CeT5xjmdNpGz8GMnQibF.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/30/21/33/240_F_330213397_FVlHncCY3DkM9rJ7XsmAUKrRMvvtJExO.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/96/92/71/240_F_196927173_BV5vFerh8qusfzEbjTqlZxHauuSiTtAU.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/87/19/72/240_F_287197285_ri6ZeF22UKA48ONq1JY3KLDDZ3D3V3oD.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/00/49/84/07/240_F_49840798_437FUY3eumwYK4KcP4sxBRyyqmGju6vo.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/22/20/58/240_F_122205804_1UUviM8sGq3gu4ugT7okTGMnMqzzDff5.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/58/55/08/240_F_158550887_f4iSk5oAgAKrIC8ZQa7MmceyPO0EkvvG.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/05/43/17/240_F_305431773_TLdQJ5GuvCDZvffWvdo90XZTFWRcwzSG.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/09/40/75/240_F_309407539_lPql0RPBpVkdqEAsX6KCPIXl71ucLFlx.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/02/02/88/240_F_302028867_g5Ncxbc9rj27UP9Tchrf7BlC0vsuazf6.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/93/12/76/240_F_293127667_ghpK4etEkwkQnBZ8nFuqhLM9u7ADQOhw.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/30/54/02/240_F_330540265_Tn0ouEVEday7eeff03j2udM15QtmDKlW.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/04/00/02/240_F_304000252_kNbbOnoFzpXO64kmr8XqKknOZmcziZXI.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/61/85/19/240_F_261851914_ysiJNGED7LPuJrQRgLs2DXSh44t5k2iZ.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/73/59/91/240_F_273599161_zBAwM9ISpmrY9eDTFVTYf1ZR4GPg8tPy.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/10/47/02/240_F_310470220_Y2HSn9qLQmVxF8JfqzOM7gUgkLDWMbtk.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/02/47/61/240_F_302476174_AVziMyhYvjSUoHQwdKLWoGiOO4MPaPRa.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/09/83/04/240_F_309830491_CF56jCzDvZtMlyCEXRp2FRTVg23AW5mY.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/51/49/06/240_F_251490668_epYir0OiPcjx3ufXCXnBRre1iFR2CgSg.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/05/26/48/240_F_305264869_GvCXN5Qda0TaJoMXxqZ9DSISYaAoyyj5.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/44/15/72/240_F_244157283_2lftl3bR4wlUADnyndzEUhUSlKMKdPIW.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/03/37/67/240_F_303376708_kc9eY5JemB9GX77po7H11XBl804wMmlx.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/25/48/59/240_F_325485992_9FQA3B6n5dokovVCpV7zKBZzcuK7MlZM.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/71/95/62/240_F_271956223_0R0nv3wHvSYKQ6Fi0aGH3jwsdwjz8hyz.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/08/70/09/240_F_308700914_pvH2LEgMxZm2QZzNRLWwMtaxpJrhpflU.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/98/15/44/240_F_298154445_dqhd7BSfANsj3fcf0eGjFM0qAyDafeN8.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/42/98/35/240_F_142983501_1EHedyxKyMSny9UKl8aWl7OpUEa6vF2m.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/14/30/97/240_F_314309700_Uo4pVqt554CH1ydNtZuMOh3fyPPQvdhF.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/00/73/93/95/240_F_73939513_H6CTkqCflP7VGTvP9D42nfClTR60AdXH.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/80/81/79/240_F_280817918_aLBDJZACmOJeXTzq7kL4mIHzOJfI3LtU.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
