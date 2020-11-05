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

public class FragmentBabyH extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentBabyH() {

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

        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/98/37/57/240_F_298375746_avegHQPWA2lGKg8VmBYjzOd2XgYAMOQm.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/00/85/25/240_F_200852565_VXcvj4refimBT2VK0vLZO8iDzIpEITBe.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/05/20/62/240_F_205206294_JhNwQcgAn37y4eX5CDkQ6yUfwsKX3f2C.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/99/34/23/240_F_299342319_yeBNJDd3f2OflWcjI0Mf26YGGpDDxPVm.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/23/07/82/240_F_223078280_hOoNK2VoIf4wKn78RePU5E5MWhjY6A5d.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/32/69/05/240_F_332690567_qWPgsgYGb8xE1SSDwa2eCKDjX4XDHiTy.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/15/08/28/240_F_315082826_qddnAjd2nJvYjKGNVzO0FByffRk7pyuW.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/98/72/14/240_F_298721463_j3ohnhyzzbpWfAUOBd3sw9e6MLNzCPbm.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/99/34/21/240_F_299342108_wAlWITAesYkMknCSlPCONPN0R94j0r8n.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/17/57/14/240_F_317571485_kabCY9DK7jhI7BTk2LBGYaDaBzO9Ldjv.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/08/23/43/240_F_308234374_raFLUZxV41azJQwfQJaosviC2u12yVng.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/17/66/15/240_F_317661594_1FdvBLkWHdpzVTZ7EHHLrrrNg1vTNajE.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/99/34/18/240_F_299341884_UccpVVhoL3PG9uFGcTPTQw88VcQDOx7i.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/71/04/34/240_F_171043400_W0gmSMCrt0d0WOyw2FtxUKFoCgwNzQKL.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/02/09/37/240_F_202093725_VvnQhQQkjFs0KqHiBbCxYp8JJ2f1utsG.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/33/99/14/240_F_333991479_DAwAH0ofNmiShmTLIy1bdwd9cgNkkR9o.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/97/78/19/240_F_297781910_q3S7BQD4U2Khil1J8NyLUJltzzYdDvnu.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/13/10/83/240_F_313108308_qtELoSaMAQjhFpQ6n3mdVGGnbSG89RVp.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/03/11/14/71/240_F_311147158_MpehsQDEMYtZdV68DHFIHFvoZAmPNxwa.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/08/62/06/240_F_308620656_zhmpDqIgyMY2Cj926DlTbLhBlikct3Ai.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/99/34/28/240_F_299342850_zrg000WbiLQpM8R1Ix8muQHD6O7rXhXM.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/01/52/42/02/240_F_152420205_LjzYbPm8sx4o5A9gCg9HjGAAekdCKG0V.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/23/32/11/240_F_123321182_sKL6WHoszohbv00ILGXQ1RycjJAbkL3S.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/03/08/23/66/240_F_308236682_nJjqsMpjGUnbY6T227C98WAuYl0sCjhp.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/20/36/69/240_F_220366956_Bh4mxJK8qPzbdCQ9LzE8Zfbsmg3fNfmP.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/30/43/25/240_F_230432592_NONSsTBvAyeOCrR7L8L2cLVuIJWFaBun.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/02/73/99/63/240_F_273996314_AJW4nLZIRYoLmotpmRgrKF5sl38gz5G0.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/49/50/42/240_F_249504228_Ogs5mzgaPOERNLvSbwsJ4RjiuwxfSaUg.jpg"));
        list.add(new ListItem("", "https://t3.ftcdn.net/jpg/02/48/62/12/240_F_248621229_Ix9rlloe4Z3unBptf92DzIZ68BpE8AwH.jpg"));
        list.add(new ListItem("", "https://t4.ftcdn.net/jpg/01/67/81/33/240_F_167813394_bkGxNSU8QZBU6LyEYri24ha1vCI5Z550.jpg"));


        listAdepter = new ListAdepter(list, getActivity());
        rv.setAdapter(listAdepter);
        return view;

    }
}
