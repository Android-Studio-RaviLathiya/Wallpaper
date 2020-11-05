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

public class FragmentFestivalH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentFestivalH() {

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



        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/75/01/49/240_F_275014989_HpXewSFHyNZot1jXp36mP7229gQSFcLN.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/94/60/98/240_F_294609829_VnrHZPY80hFkbb5KhOZ8hG81df8Ieglz.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/00/59/75/72/240_F_59757239_ArLfqC0c5nuDkaNHhmgQPuqa1XB7OMNP.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/19/35/48/240_F_119354859_inOt3paG2TAEpu20S2BNkjn2sxpprATQ.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/19/35/48/240_F_119354801_fiUZCy52ZIJaQvIQ7vxRWReqm4Rmi4WD.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/23/44/14/240_F_323441434_J77SZz5KAXeMTWrU0bMXzCBkOhIoPSEY.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/04/33/04/240_F_304330481_LPEjTSw11qZeyuHnpyRjMezPx9U4qwO2.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/22/24/60/240_F_122246047_eunz1UgcV6lCYSZT3jeYlYRidQpiNo6s.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/53/38/42/240_F_253384237_HZCP3iH2tqCf0AuBW1sjF7pFIugzuvX1.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/14/78/51/240_F_214785148_WfR4Z5AN7IgtsmPhWWWxVBuIfydLBuqX.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/27/74/58/240_F_327745839_YTB034eTAtmQTasbkqMUprFCEZfKxGgL.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/91/62/39/240_F_191623942_dOjl28hb5pzPpqLqJIXbUPQ91rNYyReS.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/05/39/50/240_F_105395077_sxC7cKsM3pWxJaSbz3ro73i8yBX084or.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/27/77/00/240_F_227770046_Ofw9p9WmafmBkZyrorCeKthhgFfBT4Zi.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/07/10/63/240_F_207106337_Ih05iOgjZiGMWUmHy6gn8ypNvbvTtm31.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/39/75/00/240_F_239750000_ANqfctyi7Z4R94vHgsrAawVQt41dVWXV.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/27/14/70/240_F_327147019_8u9dCd90BmkSgl1g8aBxlBn946OqXlWW.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/15/85/80/240_F_315858001_YfV350hTFmP0oESmalvJLcfHa4sNyYZN.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/90/88/89/240_F_190888950_RjGm4agNeKlvkqAv1Yse5edur8VYguay.jpg "));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/59/36/38/240_F_159363813_6so2u7C4Tt5HK54ZGjz1hj0MsXhPryno.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/02/37/42/240_F_202374228_zAtiE0GCe4sYEYx3G0DSsdpJhuQrNCQD.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/96/50/37/240_F_296503786_RiiXoDPct0coRNdTYwJxrdKaUWqkuk0B.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/98/42/46/240_F_298424664_qLHEUdZcc7XOhONBBE7LN5rZYaO30qmh.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/36/24/61/240_F_336246193_1H3WohFOWVok1mLThP960eXnPS7XZlOR.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/68/49/84/240_F_168498498_GgiWNXswAkFbzX6bpbj6z8N4nzTJm4ls.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/99/96/09/240_F_299960947_Hc0tHffzYdRX4YojdooAR3BroZgm1ge8.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/36/24/75/240_F_336247564_nBs0IwRX7hvVgU9p3vvRPB5RQWiUF8ft.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/14/61/92/240_F_314619221_F6yKBHdJUicaXy8wqOXmQDE0NRnsfePk.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/21/71/47/240_F_221714738_weNH10i3UXL66qxqzuNlJVK275HwKT67.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/15/94/19/240_F_315941912_JrdHGnUCTstRANuSG1B3O3HZSzUiQ0Ha.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
