package com.example.wallpaperapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.wallpaperapplication.draweractivity.account.AccountFragment;

public class SingActivity extends AppCompatActivity {

    EditText name, mobile, password, conpassword;
    String na, mo, pa, con;
    TextView singup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sing_activity);

        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);
        password = findViewById(R.id.password);
        conpassword = findViewById(R.id.conpassword);
        singup = findViewById(R.id.singup);


        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                na = name.getText().toString().trim();
                mo = mobile.getText().toString().trim();
                pa = password.getText().toString().trim();
                con = conpassword.getText().toString().trim();

                if (na.equals("")){
                    Toast.makeText(SingActivity.this, "Name Reuired", Toast.LENGTH_SHORT).show();
                }else if (mo.equals("")){
                    Toast.makeText(SingActivity.this, "Mobile Number Reuired", Toast.LENGTH_SHORT).show();
                }else  if (pa.equals("")){
                    Toast.makeText(SingActivity.this, "Password Reuired ", Toast.LENGTH_SHORT).show();
                }else  if (con.equals("")){
                    Toast.makeText(SingActivity.this, "confom Password Reuired", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(SingActivity.this,AccountFragment.class);
                startActivity(intent);
                finish();

//                startActivity(new Intent(SingActivity.this, AccountFragment.class));
//            onBackPressed();
            }
        });


    }
}
