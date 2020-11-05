package com.example.wallpaperapplication.draweractivity.account;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.wallpaperapplication.R;
import com.example.wallpaperapplication.SingActivity;

public class AccountFragment extends Fragment {



    private AccountViewModel accountViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        accountViewModel =
                ViewModelProviders.of(this).get(AccountViewModel.class);

        View view = inflater.inflate(R.layout.fragment_account, container, false);


        final TextView sing = view.findViewById(R.id.sing);
        final EditText mobile = view.findViewById(R.id.mobile);
        final EditText pass = view.findViewById(R.id.pass);
        final TextView login = view.findViewById(R.id.login);


        accountViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

                sing.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), SingActivity.class));


                    }
                });
                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String mb = mobile.getText().toString().trim();
                        String pa = pass.getText().toString().trim();


                        if (mb.equals("")) {
                            Toast.makeText(getActivity(), "Mobile Number Reuired", Toast.LENGTH_SHORT).show();
                        } else if (mb.length() < 10) {
                            Toast.makeText(getActivity(), "Not Valid Mobile Number", Toast.LENGTH_SHORT).show();
                        } else if (pa.equals("")) {
                            Toast.makeText(getActivity(), "Password Reuired", Toast.LENGTH_SHORT).show();
                        } else {


                            startActivity(new Intent(getActivity(), SingActivity.class));


                        }
                    }
                });

            }
        });
        return view;
    }

}
