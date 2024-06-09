package com.example.aulafrasesdodia;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // depois de criar metodos preciso criar os atributos

    String [] frases = {

            "Aprendi uma nova forma de usar o for quando possuo array, colocando string frase:frases",
            "Entendi também que os atributos são criados na classe principal MainActivity para serem chamados nos metodos public void verbo(View view){}",
            "preciso entender porque eu tenho nesse projeto o metodo onCreate e porque somente coloquei fora dele os dois metodos dos botões",
            "Realmente não posso ir correndo como maratona de serie e sim ir compreendendo até absrover cada evento; hoje vou imprimir esse projeto",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
public void gerarFrase(View view){

    TextView texto = findViewById(R.id.textResultado);
    int numeroAletaorio = new Random().nextInt(4);
    String frase = frases [numeroAletaorio];
    texto.setText(frase);
}

    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textResultado);



        String textoResultado ="";

        for (String frase: frases){

            textoResultado = textoResultado + frase+ "\n";
        }
        texto.setText( textoResultado );
    }
}