package blackbelt.com.quiz;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kobayashi on 19/10/17.
 */

public class ListaPerguntas {

    public int bandeiras;
    public String op1, op2, op3, op4;
    int opCerto;


    public ListaPerguntas(int bandeiras,
                          String op1, String op2, String op3, String op4, int opCerto){
        this.bandeiras = bandeiras;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.opCerto = opCerto;
    }

}
