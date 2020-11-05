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

public class FragmentWeddingH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentWeddingH() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.h_recycle_fragment, container, false);

String xyz;
        ArrayList<ListItem> list = new ArrayList<>();
        ListAdepter listAdepter;

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(linearLayoutManager);

        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/22/76/28/240_F_322762889_SvQggQ0GpAetH0Vya8mCjdoztm4YRxSj.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/00/79/79/92/240_F_79799286_gusoFf1jkwRqpVGVosSH1EuyFDEh2cZY.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/43/28/69/240_F_243286935_CBsWEo47rGZxQAGtHaVpS0aWBlelZZOb.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/52/03/73/240_F_152037328_wLtmbz7muLjJFNKgYLbnQbsZfQDqRH3E.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/36/51/91/240_F_136519192_q8AcPyzuEsAzqlnABmgdOFd7YliVCXZt.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/99/02/14/240_F_199021450_AJ3lWmb1UfYD65Xk4qTWvKkyeevFV2QV.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/18/54/21/240_F_318542168_Gapz993SXRMBEcKOGFWwu8ZRHjEqr9dx.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/05/89/61/240_F_205896128_HvNLWR3FQN5iHMygAr6hUThfsHK25e9D.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/75/50/64/240_F_175506473_hFiOUm5OGHlk1nQCRQIOcmLDZmxCWsE4.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/03/85/40/240_F_303854070_leqObA8AXN6NtUDcvnBnpN5OXPfJ9xql.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/24/98/64/240_F_224986431_6ap6JtgyNTsPduoU2sshzHOOQ9KehsUd.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/83/79/92/240_F_283799223_ERMHR1RMpQv1XbpHUBeMKe0SMfhfAxKE.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/90/59/80/240_F_290598022_DjhKDiHfVmvNKebMhoB36gtCLXMpROQU.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/19/94/96/240_F_219949641_GP3vSKnitAHZ8SqlQXdafiCOFhC8d6Nj.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/65/10/39/240_F_165103914_fhCQrtN4ibHIzHtr0kxbrAHPVCYFJYyo.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/27/01/01/240_F_327010124_kHdzh2rPB96wUm514wKYdziPsKiIYk78.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/32/14/91/240_F_332149160_247rKUbHjxu0CMmXtvY7IwzBp0xD5Zey.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/08/62/43/240_F_108624321_Aro1ho8efTBAdByoTMtAYdXyvrvKfnog.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/00/99/49/63/240_F_99496336_zxK7zZ8dGiDIMLH6Fvm3rfveaH3w5dev.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/15/31/92/240_F_315319258_k6XvytePQ1th2IdvKgyhx51IgLCv0tKb.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/59/08/76/240_F_159087624_qKWvtJUPg1PPpvD4HqgUzpcmo05VQrQ7.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/75/50/65/240_F_175506535_sX7U1hN91oPCuyrYVKCblAneyOln1Rfk.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/21/01/06/240_F_321010636_13HxkQSVS0ZGw0VfnXv2IYE40Yab45qw.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/70/94/71/240_F_170947189_E7GDvnJGna3wdMEb62NrzrEFiq1qCPDH.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/87/78/50/240_F_287785093_OQhx1tG1DfOYtCpaNdS3IeND96ZDjwmy.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/92/48/33/240_F_292483337_dmfG1NAMgPx0ZTdMaWexyAsVMW0Gw82P.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/65/10/35/240_F_165103569_GmoeOlu8LRsehqqqEmR2vSZOI3qHWSXc.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/76/48/40/240_F_276484036_eUOSVk1WWL0JqptvzwgxxCAJZJxzPZIt.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/65/10/37/240_F_165103724_PagF0KsTH9Q8Qzqlktp4QuqwPqckvoBB.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/87/77/98/240_F_287779863_1fo1BnCCvHRRGEz7ER4Pxb77RmDVNZZE.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
