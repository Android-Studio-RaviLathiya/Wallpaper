package com.example.wallpaperapplication.VHActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallpaperapplication.Adepter_item.ListAdepter;
import com.example.wallpaperapplication.Adepter_item.ListItem;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class FragmentLoveH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentLoveH() {

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

        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/22/41/78/240_F_322417801_1FyOk1o8AK5ZhGEFr5qxHQLuCvztelwV.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/34/01/99/240_F_334019945_QHkV5txTVMhwdvqqoaPZR44gANWXUBhl.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/73/13/59/240_F_273135948_N7K1txjWYVhAdvOdC2EIe6KQ4PxJu2F8.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/18/62/80/240_F_118628071_d9N0zUyeJqsYMzGVWAvXvI2zuOBRXOF1.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/16/35/88/240_F_316358814_dh58mlXH8NbtsxsyXbAedEMuBKSzMTNp.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/87/27/49/240_F_287274946_zMxQ6TxYpXtBTlgmi7VQf6dPssu15FQv.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/18/24/67/240_F_318246776_JJbncQlTQYWgGcG98681RF7GQ1GWh4Rr.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/31/73/41/240_F_331734163_aXI68hKFI9pgRyfUoMD3tLyvXY6CkwWB.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/00/75/77/92/240_F_75779239_DoxwW639PhVPlKWHobrtmEkQ7Zvvv4By.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/36/42/61/240_F_236426125_w1q15UxPdfjLexFi7Xb41paC4aHzV8hH.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/24/98/64/240_F_224986431_6ap6JtgyNTsPduoU2sshzHOOQ9KehsUd.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/05/64/02/240_F_305640255_jSWOnbqxaNHIyqiJsq1hfCRjJvis2lZb.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/01/73/81/240_F_301738153_rFZGNPHuU9kM5N6zEgnyijz3nSgLIyF0.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/34/01/99/240_F_334019977_A4Oooxbf0NfWpOM21Jz2OHgF4iP9mu4n.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/11/56/72/240_F_311567208_BfwFExpKpujuliaXZKrOe4HGOksg0nu1.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/46/41/54/240_F_246415465_tZgm5OOV53DQHblTyWvO5taWUt0FJRw2.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/42/36/79/240_F_242367994_ICghpRm5Lb6lVDlgxlA05jBZn8PzDTFM.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/28/75/02/240_F_328750225_ewPTeFUI0upveDzOKO1HOIy5cf5vIaCn.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/11/56/76/240_F_311567669_CRdwIwAQzLcCF92vVuUUAoYJJBP7oEqq.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/88/05/09/240_F_288050922_2TYO6FTTkdFUQgc8CjlceQu9igcskcxd.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/01/39/41/240_F_101394186_SkJ0ct8w5eEWWkvJzh4bg4vHjfXkYpsq.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/00/99/47/47/240_F_99474795_hADnnp5h2AC9QVwh7oQLOEHm2P1C2FHa.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/13/23/65/240_F_313236504_JhdCp4rjoQoNnhq6l68VZC7Pysya5YrE.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/15/63/00/240_F_315630073_imLsnbH55tTYicCBXjLC3aT59gggEyVm.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/16/73/02/240_F_316730285_R4c9hI0FztmhDwuHOAZIT2jT9Brlea6w.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/98/74/78/240_F_298747868_8vu1v7J9LT2KGihlfmjf3NeHm4WpXkPW.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/25/71/62/240_F_325716233_VgPnpoojE8xmpyavY863iaj2oPb6mx68.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/16/35/87/240_F_316358765_9vrbJvneXrJUuyUWBrzlFb1B8QcePzxP.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/16/99/13/240_F_316991396_wvzd4is3fWvGzOHUmSXccVJPkXx4gkOT.jpg"));



        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
