package com.example.exercicioo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_Concatenar;
    EditText txt_Nome1,txt_Nome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Concatenar.findViewById(R.id.btn_concatenar);
        txt_Nome1.findViewById(R.id.txt_nome1);
        txt_Nome2.findViewById(R.id.txt_nome2);

        btn_Concatenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome1,nome2;
                nome1=txt_Nome1.getText().toString();
                nome2=txt_Nome2.getText().toString();

                Toast.makeText(MainActivity.this,"Olá"+ nome1+""+nome2,Toast.LENGTH_LONG ).show();

                if (nome1.isEmpty() || nome2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Dados não digitados!!Erro", Toast.LENGTH_LONG).show();
                }
            }

        });



    }
}