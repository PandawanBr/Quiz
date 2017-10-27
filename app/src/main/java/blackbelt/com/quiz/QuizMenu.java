package blackbelt.com.quiz;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class QuizMenu extends AppCompatActivity{

    Somar somar = new Somar();
    private EditText nome;
    private Button comecar, sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_menu);
        getSupportActionBar().setTitle("Início");

        nome = (EditText) findViewById(R.id.nome);
        comecar = (Button) findViewById(R.id.iniciar);
        sair = (Button) findViewById(R.id.sair);

        nome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                habilitarBotao();

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void iniciarQuiz(View botao) {
        Intent intent = new Intent(this, Quiz.class);

        somar.setNome(nome.getText().toString());
        intent.putExtra("somar", somar);

        startActivity(intent);

    }

    public void sairApp(View botao) {

        finish();
    }

    public void habilitarBotao() {

        boolean pronto = nome.getText().toString().length() > 3;

        if(pronto) {
            comecar.setEnabled(true);
        }
        else {
            comecar.setEnabled(false);
        }
    }

}
