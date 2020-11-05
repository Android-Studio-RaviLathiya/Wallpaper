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

public class FragmentFoodH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentFoodH() {

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


        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/30/91/16/240_F_230911654_oBtpNGOCg0vPnx0ugt6sosacPuspvOca.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/20/39/81/240_F_320398182_1X1ebszxgKyeS6j291ywWYIw1dfRLETC.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/10/17/03/240_F_310170344_8VYrPawEjzt48O2C1LpHG0cQ0ToDCLMB.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/02/45/78/240_F_302457836_6BKuPrxq04YOQa6dVqLabIcUev5ZIY9F.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/03/54/25/240_F_303542510_Ylsj9MQnOzihWOOTkJ64zoopfegvgya5.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/05/45/41/240_F_305454198_0XllN5AnUIaw9j3wAetz4ryidtycwzSn.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/06/05/45/240_F_306054576_cODtakEEANIH8BZN8iLD8ltthqdrMCGo.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/30/58/79/240_F_330587925_TId5qg1kk5dUpTjXC4nuVvtjrlWlae0t.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/07/98/43/240_F_307984359_ugBoEpZtIweHWG2yJozXNOe6wI5IlnLW.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/20/86/09/240_F_320860908_ppjmUXmk4VUJui8V58dlytRNLIM3vila.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/94/86/53/240_F_194865321_aojLvFIzFMjKXa1y0cWnVNzrD8HvSCSt.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/70/36/74/240_F_270367478_tn8Di0bciYNfDAtMvq1vjD3d7BItdIUM.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/16/34/97/240_F_316349769_DMsbtix2INNH3qkrsaFfZRqT59MiLcTP.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/91/89/97/240_F_291899754_91YzlwtuSXzy8FUk8Cqr86rg2XJ9pS1p.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/92/54/04/240_F_192540404_t5SxIHwPSr4yBWAcmpTGboB6phlqnxHW.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/19/74/25/240_F_319742593_cmgwSogcVMntunUpemBUskbepeI0uEQM.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/08/74/85/240_F_308748595_QWUv8fbDDWOoMbErwBzxNKaFPmhN5FkL.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/10/63/52/240_F_310635261_ph8Mlk0PYDDk3HA9yujuNG6WKofKP3Q4.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/94/82/89/240_F_294828975_mqX8WyA7LEggWibMAJXJY0W0KAYRwnNZ.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/85/55/95/240_F_185559585_gXpM2wV3zetIxuHdRhga996ZGWl3L2kr.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/34/69/03/240_F_334690333_KrY51Ia3Y0aEddlpJPJ0E7i1IQgJ4ZtF.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/92/54/04/240_F_192540404_t5SxIHwPSr4yBWAcmpTGboB6phlqnxHW.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/06/94/95/240_F_306949572_8bidb1GuK6Rk1dY8VgcbUg0ce2Jm40q3.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/48/92/04/240_F_248920439_II7m0r5vEJs2yovLgy8D9CddWnkixQn6.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/92/87/92/240_F_292879289_QUxFXVmRKlrOTdUyJp1xUHflGsvRwOvC.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/87/77/72/240_F_287777215_VVfjm1kfIn8R6cggazZYQwhKii42mgE8.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/75/90/47/240_F_175904778_hScWUY9vu3xSNQaTI8pNiGRzgLlqpTgN.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/05/39/50/240_F_105395077_sxC7cKsM3pWxJaSbz3ro73i8yBX084or.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/51/00/02/240_F_151000204_EL6U8ZsvtiwjZiORLRYV11EC4lF5yri3.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/24/16/58/240_F_324165897_j5ubHGKLb74Orz7lBdwH7kNwXDXZiH8H.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/46/62/07/240_F_246620728_Db2VdSTb5X1woa3qM9Czc3Gg0J04MuCQ.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/91/04/68/240_F_191046895_uKsykWfwa7HybpVibxRwFSCbc82yIkb3.jpg"));



        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
