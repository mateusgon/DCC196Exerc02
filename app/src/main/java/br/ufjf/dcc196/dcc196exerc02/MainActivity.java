package br.ufjf.dcc196.dcc196exerc02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private Button calcular;
    private EditText numeroUm;
    private EditText numeroDois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcular = (Button) findViewById(R.id.calculaButton);
        numeroUm = (EditText) findViewById(R.id.numeroUmText);
        numeroDois = (EditText) findViewById(R.id.numeroDoisText);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float soma;
                soma = Float.parseFloat(numeroUm.getText().toString());
                soma = soma + Float.parseFloat(numeroDois.getText().toString());
                resultado = (TextView) findViewById(R.id.resultadoText);
                String texto = String.valueOf(soma);
                resultado.setText(texto);
            }
        });
    }
}
