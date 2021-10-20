package com.example.topic4_task12a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int numero = 0;
    private TextView contador;
    private Button toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = (TextView)  findViewById(R.id.show_count);
        //forma de marat de pasar el valor de la variable int con el setText
        contador.setText(""+numero);

        //gestiono el toast
        toast = (Button) findViewById(R.id.button_toast);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        String.valueOf(numero),
                Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void sumarUno(View view) {
        numero += 1;
        //forma de pasar un int a un setText
        contador.setText(String.valueOf(numero));
    }


}