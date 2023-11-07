package com.example.findme_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private TextView txt_intro,text_sub,text3;
    private EditText login,password;
    private Button btn_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_intro = findViewById(R.id.txt_intro);
        text_sub = findViewById(R.id.text_sub);
        text3 = findViewById(R.id.text3);
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        btn_ingresar = findViewById(R.id.btn_ingresar);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(MainActivity.this, MainActivity2.class);

                startActivity(Intent);
            }
        });
    }
}