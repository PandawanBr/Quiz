package blackbelt.com.quiz;

import java.io.Serializable;

/**
 * Created by kobayashi on 23/10/17.
 */

public class Somar implements Serializable {

    private String nome;
    private int pontos;
    private int telas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getTelas() {
        return telas;
    }

    public void setTelas(int telas) {
        this.telas = telas;
    }
}
