package com.htcursos.calculadora;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by icaro on 23/04/2016.
 */
public class MainActivity extends AppCompatActivity {
    @Bind(R.id.display)
    TextView textView;

    @Bind(R.id.button_Del)
    Button button_Del;
    @Bind(R.id.button_Soma)
    Button button_Soma;
    @Bind(R.id.button_Subtracao)
    Button button_Subtracao;
    @Bind(R.id.button_Divisao)
    Button button_Divisao;
    @Bind(R.id.button_Virgula)
    Button button_Virgula;
    @Bind(R.id.button_Resultado)
    Button button_Resultado;
    @Bind(R.id.button_Multiplicacao)
    Button button_Multiplicacao;

    @Bind(R.id.button_1)
    Button button_1;
    @Bind(R.id.button_2)
    Button button_2;
    @Bind(R.id.button_3)
    Button button_3;
    @Bind(R.id.button_4)
    Button button_4;
    @Bind(R.id.button_5)
    Button button_5;
    @Bind(R.id.button_6)
    Button button_6;
    @Bind(R.id.button_7)
    Button button_7;
    @Bind(R.id.button_8)
    Button button_8;
    @Bind(R.id.button_9)
    Button button_9;
    @Bind(R.id.button_0)
    Button button_0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        ButterKnife.bind(this);

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "0");
            }
        });



        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "1");
            }
        });


        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "2");
            }
        });


        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "3");
            }
        });


        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "4");
            }
        });


        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "5");
            }
        });


        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "6");
            }
        });


        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "7");
            }
        });


        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "8");
            }
        });


        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "9");
            }
        });


        button_Divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "/");
            }
        });


        button_Multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "*");
            }
        });


        button_Soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "+");
            }
        });


        button_Subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + "-");
            }
        });


        button_Virgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText().toString() + ",");
            }
        });


        button_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });


        button_Resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
