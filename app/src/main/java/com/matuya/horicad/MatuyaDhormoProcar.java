package com.matuya.horicad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MatuyaDhormoProcar extends AppCompatActivity {
    private Button buttonA;
    private Button buttonB;
    private Button buttonC;
    private Button buttonD;
    private Button buttonE;
    private Button buttonF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matuya_dhormo_procar);

//Button1
        buttonA = (Button) findViewById(R.id.buttonA);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengg("first.html");
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengg("second.html");
            }
        });
        buttonC = (Button) findViewById(R.id.buttonC);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengg("third.html");
            }
        });
        buttonD = (Button) findViewById(R.id.buttonD);

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengg("fourth.html");
            }
        });
        buttonE = (Button) findViewById(R.id.buttonE);

        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengg("fifth.html");
            }
        });
        buttonF = (Button) findViewById(R.id.buttonF);

        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengg("six.html");
            }
        });

    }


    private void opengg(String filename) {
        Intent intent=new Intent(this,gg.class);
        intent.putExtra("filename",filename);
        startActivity(intent);

    }


}
