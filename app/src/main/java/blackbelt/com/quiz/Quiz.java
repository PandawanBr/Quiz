package blackbelt.com.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Collections;
import java.util.Random;

public class Quiz extends AppCompatActivity {

    Somar somar;
    ImageView imgBandeira;
    RadioGroup rgGroup;
    RadioButton rbt1, rbt2, rbt3, rbt4;
    Button responder;
    Random gerador = new Random();
    Adicionar lista = new Adicionar();
    int resp, pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        setTitle("Que país é este?");

        imgBandeira = (ImageView) findViewById(R.id.imgBandeira);
        rbt1 = (RadioButton) findViewById(R.id.rbt1);
        rbt2 = (RadioButton) findViewById(R.id.rbt2);
        rbt3 = (RadioButton) findViewById(R.id.rbt3);
        rbt4 = (RadioButton) findViewById(R.id.rbt4);
        responder = (Button) findViewById(R.id.responder);
        rgGroup = (RadioGroup) findViewById(R.id.rgGroup);

        carregarQuestao();

        Intent intent = getIntent();
        somar = (Somar) intent.getSerializableExtra("somar");
    }

    public void avancar(View botao) {

        Intent intent = new Intent(this, Resposta.class);

        if(rgGroup.getCheckedRadioButtonId() != -1){

            if(rgGroup.getCheckedRadioButtonId() == resp){

                somar.setPontos(somar.getPontos() + 1);
                intent.putExtra("acertou", true);

                finish();
            } else {
                intent.putExtra("acertou", false);
                finish();
            }

            somar.setTelas(somar.getTelas() + 1);
            intent.putExtra("somar", somar);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Escolha uma opção", Toast.LENGTH_LONG).show();
        }


    }

    public void carregarQuestao(){
        ListaPerguntas listaPerguntas = lista.addPerguntas().get(gerador.nextInt(71));

        imgBandeira.setBackgroundResource(listaPerguntas.bandeiras);
        rbt1.setText(listaPerguntas.op1);
        rbt2.setText(listaPerguntas.op2);
        rbt3.setText(listaPerguntas.op3);
        rbt4.setText(listaPerguntas.op4);
        resp = listaPerguntas.opCerto;
    }


}
