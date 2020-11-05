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

import com.example.wallpaperapplication.Adepter_item.ListSAdepter;
import com.example.wallpaperapplication.Adepter_item.ListSItem;
import com.example.wallpaperapplication.R;

import java.util.ArrayList;

public class FragmentFlowersS extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public FragmentFlowersS() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.v_recycle_fragment, container, false);


        ArrayList<ListSItem> list = new ArrayList<>();
        ListSAdepter listVAdepter;

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        rv.setLayoutManager(gridLayoutManager);


        list.add(new ListSItem("", "https://images.unsplash.com/photo-1433888104365-77d8043c9615?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1428353077903-d09b3e000f37?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1471644806490-77c53366b18b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1496857239036-1fb137683000?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1508717146309-25a0019d0381?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1476293889456-abfb7492a29f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1516834474-48c0abc2a902?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1490349368154-73de9c9bc37c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1444930694458-01babf71870c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1502164980785-f8aa41d53611?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1471696035578-3d8c78d99684?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1456415333674-42b11b9f5b7b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1494972308805-463bc619d34e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1463043254199-7a3efd782ad1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1462275646964-a0e3386b89fa?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1455659817273-f96807779a8a?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1452827073306-6e6e661baf57?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1488928741225-2aaf732c96cc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1465146344425-f00d5f5c8f07?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1496661415325-ef852f9e8e7c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1490750967868-88aa4486c946?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1562028297-580e9bd3d432?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1580724780403-2398394b5cd3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1573845813513-8aaa385a9afa?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1573414147157-e4e87cd692dd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1525759576143-2f0275439412?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1560091001-8f12f0d5e124?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1549017694-207d8c967d32?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1586581601369-a2aa969110eb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1557444022-ccee20e0650a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1571167977877-dacd373dcc70?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));
        list.add(new ListSItem("", "https://images.unsplash.com/photo-1579722279786-576b71f94d4f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"));

        listVAdepter = new ListSAdepter(list, getActivity());
        rv.setAdapter(listVAdepter);
        return view;

    }
}

