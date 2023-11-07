package com.example.findme_app;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button btn_back1,btn_cuenta,btn_notific,btn_buscar,btn_public,btn_mis,btn_mensajes;
    private TextView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_back1 = findViewById(R.id.btn_back1);
        menu = findViewById(R.id.menu);
        btn_cuenta = findViewById(R.id.btn_cuenta);
        btn_notific = findViewById(R.id.btn_notific);
        btn_buscar = findViewById(R.id.btn_buscar);
        btn_public = findViewById(R.id.btn_public);
        btn_mis = findViewById(R.id.btn_mis);



        btn_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(MainActivity2.this, MainActivity.class);

                startActivity(Intent);
            }
        });

        btn_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(MainActivity2.this, MainActivity3.class);

                startActivity(Intent);
            }
        });

        btn_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(MainActivity2.this, MainActivity4.class);

                startActivity(Intent);
            }
        });

        btn_notific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(MainActivity2.this, MainActivity5.class);

                startActivity(Intent);
            }
        });


        btn_public.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(MainActivity2.this, MainActivity7.class);

                startActivity(Intent);
            }
        });

        btn_mis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(MainActivity2.this, MainActivity8.class);

                startActivity(Intent);
            }
        });
    }
}