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

public class FragmentWatercolourH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentWatercolourH() {

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

        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/68/27/05/240_F_268270520_iZeLPpwXSr5zK62zvsJm6wlNAfD75jJd.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/01/01/93/240_F_301019323_Yv6Lx4tnNIlZEOtppIfD879IzOdIJHPh.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/11/26/52/240_F_311265234_GR2UxI7H7hzKLHOk38YR4HOleuhNbxnh.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/78/09/08/240_F_278090830_qPDxq3Q3Z0c7F6xg0aM7HjvmEJwgaZ4H.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/26/34/03/240_F_326340365_fK8UQLh5foKQGi6bbfRxNzshz0ytGPfl.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/94/42/87/240_F_294428756_QCMjBx3fT6lnTsbsaNOSQkYJTF7G8suO.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/11/36/58/240_F_311365897_YWbI0jmGpIzO3b7kcZvTMOSpzuzpAJWY.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/34/34/90/240_F_234349004_P4leStIglSP6WBIIgGRFyYu9NH8OWPhl.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/58/00/05/240_F_258000599_OVYJh05MZyj4vIgWPrhAR7SXqtoKDWES.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/10/43/17/240_F_310431797_BXMQr16gLjnkyZWDOKXBW03IpVPUgQli.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/86/56/35/240_F_186563571_Lt3wYNvAXOUXPuAX8nl9fwgUoy1muyr5.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/88/14/98/240_F_288149856_6IFoax5rxU94WDSNNDBKhALrS7o0FqDC.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/07/72/79/240_F_307727922_YvdvUdG6v0oR8rLIFzpnEmEt4xro9EXX.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/67/64/13/240_F_267641397_WD0cV2pa0rzOqtwH762PcsRvOpVe2jfP.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/00/41/70/240_F_300417088_J9uTbsJd4acAmmPIKcsOFxHzs3zXKc3T.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/03/48/53/240_F_303485336_lDeW5sZFw7ZNdEOkIG8vgRLBZnhuaP0B.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/95/79/72/240_F_295797271_njdBDa9dURXFYBmbX7f4oI9drI5OpVPS.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/11/39/98/240_F_311399882_SOjr9IoIJ7ZjgjPvkeJhTUdCjiRZESqW.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/92/96/89/240_F_292968998_53dl08OxOiT5Szgbadk7V3dOKw1w9AS5.jpg "));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/98/45/73/240_F_298457350_Lk9uOrGQ3FCbwcs9lfkg3pkY5pFYQkpc.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/83/17/21/240_F_183172171_ZKSTfHX3WUbn3SjyMPZXZCngRjGchLp7.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/52/18/01/240_F_252180105_qR0wJaiTnYHFOxTkMabQK6qXU0AGBB3r.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/30/55/81/240_F_330558199_u8TwcGuTNV73TGxVL0wSo02VZHNfedOO.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/30/98/13/240_F_330981339_foKI9nw6BUURhG0i5R0uYabO5RmUosJJ.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/72/13/89/240_F_272138999_xcC4yDegh7Rknb8EXt7Pa1XMQyE4bnoP.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/22/95/55/240_F_222955576_iLRsH8NzysgmKgjgpkaT6O7Hr1YhR5R0.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/99/58/19/240_F_299581921_RyEJV33N1rAPtjF8aacQp3YyZZ8upLp6.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/04/41/25/240_F_204412581_YT6IdHwWaUOUFJWvAEzk2lyUhXVRjdt7.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/11/31/65/240_F_311316507_ZMjxhFbxINgtizXicQzRDP51bbfwlhCB.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/93/36/10/240_F_293361028_fP4SAy6dagyJxM219d0D0KsiQMHJM5Ds.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/95/89/28/240_F_295892820_dqIIQiahfmybFzmqGlZZCcqQFD84srHM.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/00/92/00/33/240_F_92003328_Bwq1tQrpBiTRwIaB1hRFYfjGdXAloZ7q.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/83/17/21/240_F_183172171_ZKSTfHX3WUbn3SjyMPZXZCngRjGchLp7.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
