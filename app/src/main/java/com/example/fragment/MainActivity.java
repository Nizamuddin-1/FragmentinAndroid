package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button fragA,fragB,fragC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragA = findViewById(R.id.b1a);
        fragB = findViewById(R.id.b2b);
        fragC = findViewById(R.id.b3c);
        fragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 loadfrag(new AFragment(),0);
            }
        });
        fragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            loadfrag(new BFragment(),1);
            }
        });
        fragC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadfrag(new CFragment(),1);

            }
        });

    }
    public void loadfrag(Fragment fragment,int flag){
        FragmentManager fa = getSupportFragmentManager();
        FragmentTransaction ft = fa.beginTransaction();
        if(flag==0)
        {
            ft.add(R.id.container,fragment);
        }
        else
        {
            ft.replace(R.id.container,fragment);
        }
        ft.commit();
    }
}