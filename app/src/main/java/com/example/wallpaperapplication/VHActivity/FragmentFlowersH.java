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

public class FragmentFlowersH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentFlowersH() {

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


        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/27/29/38/240_F_327293864_zEIUAt4U3NHNZp5KmOe1LogY3ZGuPqaF.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/86/80/01/240_F_286800155_xDW1vZsN8MpyoQUqGBfNKPSy9eLHmCJa.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/10/92/50/240_F_310925084_kP9FiksO1f71LQNoRmcRk3rAOXJ4YF38.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/06/35/75/240_F_306357524_szcml3aNZCMcymTqFykNzjKNkvECc1KK.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/00/09/16/240_F_300091669_YYN79gxWZkfxAYxtDuGAipzhqXP6Wcfv.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/21/44/68/240_F_321446866_gm3NWHDDG5xjfLzN0xDV3KMJzerndlP9.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/06/96/41/240_F_306964174_Wak6CIsPEYMZZgGhxkiOh4eOS0vXJoIf.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/76/29/70/240_F_276297053_Qku61g5ZHb92XebTv1crDmkfvjpYk221.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/32/31/41/240_F_332314176_yjPGzXPfNrSM6wP2q9E4Vq2JEj9x8sXw.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/02/38/86/74/240_F_238867467_gHyvWf2SB44gQY55Djabb4ZBu86QAtIh.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/73/35/41/240_F_273354138_ngkUKJbIhgr0XBHH0o03t3CNME9zmktQ.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/74/72/77/240_F_274727777_fPIWjLamINKtE7nw6S99xFYQiz8D3XzY.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/60/92/09/240_F_260920918_ny6nh8ynMv0zZ6UGUNzCEIGdgFuwhZML.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/03/15/34/07/240_F_315340720_jzcgfd6MOtrmIvqS6ijAiutw2U9s7tqg.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/10/59/90/240_F_310599046_8rNhmpqUqF5nbNY5q7O6YYr6GtGdlxOj.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/94/75/70/240_F_194757077_Lv4ZT8XAOQRerY0vTA4grbAEwTHU9srK.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/91/35/77/240_F_291357702_1rdMdKDRJG2F7IfHZW0uD1W2MigHmp4d.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/06/53/28/240_F_306532868_E8gThSBx5We6y6qIrNXsWVDZC74RmInr.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/01/59/80/30/240_F_159803018_YcBgz1WIGr7aO1YwWFcldUTZEgOk8IbW.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/02/70/42/59/240_F_270425938_zyUbXvcSNZ1Ro7upepu2fllHal585qXv.jpg"));
        list.add(new ListItem("","https://t3.ftcdn.net/jpg/03/27/39/10/240_F_327391084_l7w31pvabafBSr8H2SRbbPBrEyhBxYcY.jpg"));
        list.add(new ListItem("","https://t4.ftcdn.net/jpg/01/43/40/07/240_F_143400730_R9fmbEOS6W89RvQA9Jtkus6Vn4oYDTvU.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/18/50/45/240_F_318504518_KUeKbCQLaFdf0HMFTW7t3HBLe8TnfZYq.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/29/53/97/240_F_329539761_GBAr7YEHRcQUNzwc6ZB1uTzUU6LI4kTB.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/25/29/46/240_F_325294628_ybn0xNLEff9KQGldLs2BiI4C8WX4dCWS.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/31/44/22/240_F_331442200_Cw1RKEk0eI6GGk0WxtAOsquUxnuxo6vr.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/23/33/39/240_F_323333968_8w49DJ6IoXBPM9zHny3f5HdB8tgdDMQB.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/06/39/27/240_F_306392705_eYnmcjLqSyOyAmKoWeyHYz3qztzmNGTr.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/65/54/59/240_F_265545971_v4K7wEjcOcXCQmyAP0X7hnEdt4i58s7u.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/05/96/81/240_F_305968181_PlPKhu5kodNi7GnMBAY97BuAL0X58yaN.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/37/61/70/240_F_137617032_Qi7isTcURFOJmVxMT5JGgJKMntRvdJPu.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/24/48/70/240_F_324487053_0U3Da4W4XWVxHo0nYKW3ynnWYntpg8wW.jpg"));




        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
