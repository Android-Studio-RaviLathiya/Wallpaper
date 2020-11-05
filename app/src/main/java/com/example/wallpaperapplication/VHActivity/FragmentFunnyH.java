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

public class FragmentFunnyH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentFunnyH() {

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

        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/68/04/28/240_F_268042852_3cDHNhuHVcbeCfnJplQ7J727ns1Ko3oh.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/83/96/40/240_F_283964050_8tjliirpmMYPftyvHhRksgdAyYXkU5jT.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/18/70/93/240_F_318709301_8hVmIBXTrEWD8idOCc2YXkcH210QOd7M.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/96/47/90/240_F_296479036_BeQkHC47e7C8OLIPxdGu5npvlO1FeC2f.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/30/76/90/240_F_330769099_2tHcTBEx2FXfepxsqFKYXEMI6hpw8cc0.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/20/52/07/240_F_320520779_8fUG3vwaQfABpcRBnXCytQulEkSkv8Ut.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/00/36/06/240_F_300360679_GdXHZNlPp9UWK8030Sh3CoiyBhbm5ibB.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/34/20/11/240_F_334201170_AwC3j3bTrWdJ9MXNDUbP5fYBGWFC3Ji4.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/17/67/89/240_F_317678968_Jempponc1Ks316eCeGHmuhaRIfZNNxEW.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/31/51/20/240_F_331512091_cxPpIAU95gqzzt7IFrRp7RJxhGbIiSFB.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/98/20/26/240_F_298202657_XJQsVFI1Fea2kSIvdChKSo3cEtIErLLF.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/12/12/83/240_F_212128324_OLK7Z0i6VyzoE4FUOaaguQJGE7E1YiWn.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/25/55/66/240_F_225556636_tnfham7utS1GTYsCbVqxKFC2Bux7u4Ge.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/49/19/29/240_F_249192996_C1UWcMlRRrbQxY8Z2V09IY059trB9GuC.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/66/96/31/240_F_266963195_Q5hWEUtoIzLzsPQXyNNgOHlZTKTyYljp.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/25/62/99/240_F_325629930_YQFBIssK5vV86bM1gDti7O6G37731HjQ.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/17/27/25/240_F_317272571_X5mRslQ47RwxurE0LOGXU7WqYOp4jy57.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/52/94/98/240_F_252949825_DxaqaDhUaclUEEJTOu40oyYV0r6dWDYa.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/18/09/22/240_F_118092206_DWQNUlQX5825IqA72k6MntU008ux1Bo4.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/02/20/80/240_F_302208068_FQ3KLnoFBUo88a5c7UbSDpsUSNX3K52P.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/99/67/12/240_F_299671202_x9sZ1SQM7ThqMg23eaf142PsLJtZZSZN.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/50/39/21/240_F_250392170_hoE2DxpbWaWRuQrey5kTAEzCePPIGyEn.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/97/01/12/240_F_297011215_iPBD13K43hs41Yfx5ZYXh0F1mYhu2hOa.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/51/25/30/240_F_251253095_ELI3uk08MmTFTPqfBjEBH49MuobaqhIu.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/33/29/36/240_F_233293640_eYodBK7t0lUafXS8y8oFu3KOF8ed7EVc.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/61/10/00/240_F_261100069_ARbG8fnH0sHZ6eTOSOrA57amA6vAV31W.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/07/27/10/240_F_207271045_4aNMLAkUUsw9EkMJo2qJ623J1WnQ7m81.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/74/36/70/240_F_174367032_p8OWl8ojqzEA08GVYe2voLfPwxHmNh43.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/95/02/58/240_F_195025898_SoBld7ouKFEh90LznGIabwj3oT5JXduq.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}

