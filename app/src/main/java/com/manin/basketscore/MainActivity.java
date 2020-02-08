package com.manin.basketscore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatTextView tvnilaiNol=null;
    AppCompatButton btn2,btn4,btn8,btn3,btn6,btn9,btnReset=null;

    int score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deklarasi();

        tambahDua();
        tambahEmpat();
        tambahDelapan();
            tambahTiga();
            tambahEnam();
            tambahSembilan();
            reset();
    }

    private void deklarasi() {

        tvnilaiNol=findViewById(R.id.id_tv_score);
            btn2=findViewById(R.id.id_btn_2poin);
            btn4=findViewById(R.id.id_btn_4poin);
            btn8=findViewById(R.id.id_btn_8poin);
            btn3=findViewById(R.id.id_btn_3poin_kanan);
            btn6=findViewById(R.id.id_btn_6poin_kanan);
            btn9=findViewById(R.id.id_btn_9poin_kanan);
         btnReset=findViewById(R.id.id_btn_reset);
    }

    private void tampilScore(){
        tvnilaiNol.setText(String.valueOf(score));
    }

    private void reset(){
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=0;
               tampilScore();
            }
        });
    }


    private void tambahDua(){
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score=score + 2;
                tampilScore();
            }
        });
    }

    private void tambahEmpat(){
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score=score + 4;
                tampilScore();
            }
        });
    }

    private void tambahDelapan(){
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score=score + 8;
                tampilScore();
            }
        });
    }

    private void tambahTiga(){
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score=score + 3;
                tampilScore();
            }
        });
    }

    private void tambahEnam(){
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score=score + 6;
                tampilScore();
            }
        });
    }

    private void tambahSembilan(){
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score=score + 9;
                tampilScore();
            }
        });
    }
}
