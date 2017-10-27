package blackbelt.com.quiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Resposta extends AppCompatActivity {

    Somar somar;
    private ImageView imagem;
    private TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);
        getSupportActionBar().hide();

        resposta = (TextView) findViewById(R.id.resposta);
        imagem = (ImageView) findViewById(R.id.respostaImg);

        Intent intent = getIntent();
        somar = (Somar) intent.getSerializableExtra("somar");

        boolean acertou = intent.getBooleanExtra("acertou", false);

        if(acertou){
            resposta.setText("Acertou");
            resposta.setTextColor(Color.rgb(0,100,0));
            imagem.setImageResource(R.drawable.certo);

        }
        else {
            resposta.setText("Errou");
            resposta.setTextColor(Color.rgb(178,34,34));
            imagem.setImageResource(R.drawable.errado);
        }

        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                if(somar.getTelas() == 10){
                    try {
                        Thread.sleep(2000);
                        Intent intent =
                           new Intent(Resposta.this, Ranking.class);

                        intent.putExtra("somar", somar);
                        startActivity(intent);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(2000);
                        Intent intent =
                            new Intent(Resposta.this, Quiz.class);

                        intent.putExtra("somar", somar);
                        startActivity(intent);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                finish();
            }
        });
        thread.start();
    }
}
