package com.example.aluno_uffs.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button meuBotao;
    TextView meuHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meuBotao = (Button) findViewById(R.id.meuBotao);
        meuHello = (TextView) findViewById(R.id.meuHello);

        meuBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meuHello.setText("Good Bye World");
            }
        });
    }
}
