package blackbelt.com.quiz;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.Touch;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class Ranking extends AppCompatActivity {

    Somar somar;
    private TextView txtNome;
    private TextView txtPontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        setTitle("Ranking");

        txtNome = (TextView) findViewById(R.id.txtNome);
        txtPontos = (TextView) findViewById(R.id.txtPontos);

        Intent intent = getIntent();

        somar = (Somar) intent.getSerializableExtra("somar");

        txtNome.setText(somar.getNome());
        txtPontos.setText(String.valueOf(somar.getPontos()));
    }

    public void comecarQuiz(View botao) {
        Intent intent = new Intent(this, Quiz.class);

        startActivity(intent);

        finish();
    }

    public void menu(View botao) {
        Intent intent = new Intent(this, QuizMenu.class);

        startActivity(intent);

        finish();
    }

}
