package com.example.recycler_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnopen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnopen=(Button)findViewById(R.id.btnOpenFrag);


        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            getSupportFragmentManager().beginTransaction().replace(R.id.MainContainer, new NewFragment()).commit();
            }
        });
    }
}