package blackbelt.com.quiz;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kobayashi on 20/10/17.
 */

public class Adicionar {
    private Map<Integer, ListaPerguntas> perguntas;

    public Map<Integer, ListaPerguntas> addPerguntas(){

        perguntas = new HashMap<Integer, ListaPerguntas>();

        perguntas.put(0, new ListaPerguntas(R.drawable.afghanistan, "Arábia", "Sudão", "Bogotá", "Afeganistão", R.id.rbt4));
        perguntas.put(1, new ListaPerguntas(R.drawable.albania, "Albania", "Arábia", "Colombia", "Síria", R.id.rbt1));
        perguntas.put(2, new ListaPerguntas(R.drawable.argentina, "Armenia", "Argentina", "Austrália", "Geórgia", R.id.rbt2));
        perguntas.put(3, new ListaPerguntas(R.drawable.australia, "Austrália", "Bagdá", "Rússia", "Egito", R.id.rbt1));
        perguntas.put(4, new ListaPerguntas(R.drawable.belgium, "Alemanha", "Cuba", "Colombia", "Bélgica", R.id.rbt4));
        perguntas.put(5, new ListaPerguntas(R.drawable.brazil, "EUA", "Chile", "Brasil", "Peru", R.id.rbt3));
        perguntas.put(6, new ListaPerguntas(R.drawable.canada, "Croácia", "Reino Unido", "Canadá", "Cambojá", R.id.rbt3));
        perguntas.put(7, new ListaPerguntas(R.drawable.chile, "Chipre", "Chile", "Costa Rica", "Catar", R.id.rbt2));
        perguntas.put(8, new ListaPerguntas(R.drawable.costa_rica, "Costa Rica", "Grécia", "Zimbabue", "Turquia", R.id.rbt1));
        perguntas.put(9, new ListaPerguntas(R.drawable.cuba, "Israel", "Irlanda", "Cuba", "Congo", R.id.rbt3));
        perguntas.put(10, new ListaPerguntas(R.drawable.egypt, "Grécia", "índia", "Jamaica", "Egito", R.id.rbt4));
        perguntas.put(11, new ListaPerguntas(R.drawable.finland, "França", "Suiça", "Finlândia", "Bélgica", R.id.rbt3));
        perguntas.put(12, new ListaPerguntas(R.drawable.france, "Itália", "China", "Brasil", "França", R.id.rbt4));
        perguntas.put(13, new ListaPerguntas(R.drawable.georgia, "Alemanha", "EUA", "Geórgia", "Líbia", R.id.rbt3));
        perguntas.put(14, new ListaPerguntas(R.drawable.germany, "Itália", "Alemanha", "Bélgica", "Portugal", R.id.rbt2));
        perguntas.put(15, new ListaPerguntas(R.drawable.greece, "Egito", "Estônia", "Grécia", "Chile", R.id.rbt3));
        perguntas.put(16, new ListaPerguntas(R.drawable.ireland, "Irlanda", "Tailândia", "Reino Unido", "Inglaterra", R.id.rbt1));
        perguntas.put(17, new ListaPerguntas(R.drawable.italy, "Itália", "México", "França", "Nigéria", R.id.rbt1));
        perguntas.put(18, new ListaPerguntas(R.drawable.japan, "Coréia do Norte", "China", "Coréia do Sul", "Japão", R.id.rbt4));
        perguntas.put(19, new ListaPerguntas(R.drawable.libya, "Turquia", "Síria", "Líbia", "Irã", R.id.rbt3));
        perguntas.put(20, new ListaPerguntas(R.drawable.madagascar, "Croácia", "Ucrânia", "Polônia", "Madagascar", R.id.rbt4));
        perguntas.put(21, new ListaPerguntas(R.drawable.mexico, "Itália", "México", "Equador", "Colombia", R.id.rbt2));
        perguntas.put(22, new ListaPerguntas(R.drawable.monaco, "Polônia", "Grécia", "Nigéria", "Monaco", R.id.rbt4));
        perguntas.put(23, new ListaPerguntas(R.drawable.north_korea, "Coréia do Norte", "Japão", "China", "Coréia do Sul", R.id.rbt1));
        perguntas.put(24, new ListaPerguntas(R.drawable.peru, "Cuba", "Venezuela", "Peru", "Chile", R.id.rbt3));
        perguntas.put(25, new ListaPerguntas(R.drawable.poland, "Equador", "Polônia", "Monaco", "Bélgica", R.id.rbt2));
        perguntas.put(26, new ListaPerguntas(R.drawable.portugal, "Portugal", "Chile", "Geórgia", "Tailandia", R.id.rbt1));
        perguntas.put(27, new ListaPerguntas(R.drawable.russian, "Holanda", "Sérvia", "Paraguai", "Rússia", R.id.rbt4));
        perguntas.put(28, new ListaPerguntas(R.drawable.slovenia, "Rússia", "Slovênia", "Slovákia", "Holanda", R.id.rbt2));
        perguntas.put(29, new ListaPerguntas(R.drawable.somalia, "Turquia", "Congo", "Somália", "Grécia", R.id.rbt3));
        perguntas.put(30, new ListaPerguntas(R.drawable.south_korea, "China", "Argentina", "Irã", "Coréia do Sul", R.id.rbt4));
        perguntas.put(31, new ListaPerguntas(R.drawable.spain, "Espanha", "Venezuela", "Portugal", "Alemanha", R.id.rbt1));
        perguntas.put(32, new ListaPerguntas(R.drawable.suriname, "Coréia do Norte", "Suriname", "Israel", "Somália", R.id.rbt2));
        perguntas.put(33, new ListaPerguntas(R.drawable.sweden, "Dinamarca", "Noruega", "Suécia", "Finlândia", R.id.rbt3));
        perguntas.put(34, new ListaPerguntas(R.drawable.syria, "Iemen", "Iraque", "Egito", "Síria", R.id.rbt4));
        perguntas.put(35, new ListaPerguntas(R.drawable.taiwan, "Taiwan", "Hon Kong", "México", "China", R.id.rbt1));
        perguntas.put(36, new ListaPerguntas(R.drawable.thailand, "Rússia", "Tailândia", "França", "Finlândia", R.id.rbt2));
        perguntas.put(37, new ListaPerguntas(R.drawable.tibet, "Madagascar", "Timor Leste", "Tibet", "Togo", R.id.rbt3));
        perguntas.put(38, new ListaPerguntas(R.drawable.timor_leste, "Timor Leste", "Uganda", "Alemanha", "Bélgica", R.id.rbt1));
        perguntas.put(39, new ListaPerguntas(R.drawable.togo, "Camarões", "África do Sul", "Nigéria", "Togo", R.id.rbt4));
        perguntas.put(40, new ListaPerguntas(R.drawable.tunisia, "Turquia", "Tunísia", "Suíça", "Monaco", R.id.rbt2));
        perguntas.put(41, new ListaPerguntas(R.drawable.turkey, "Suíça", "Tunísia", "Turquia", "Polônia", R.id.rbt3));
        perguntas.put(42, new ListaPerguntas(R.drawable.tuvalu, "Tuválu", "Reino Unido", "Inglaterra", "Austrália", R.id.rbt1));
        perguntas.put(43, new ListaPerguntas(R.drawable.ukraine, "França", "Finlândia", "Holanda", "Ucrânia", R.id.rbt4));
        perguntas.put(44, new ListaPerguntas(R.drawable.united_kingdom, "EUA", "Escócia", "Reino unido", "Austrália", R.id.rbt3));
        perguntas.put(45, new ListaPerguntas(R.drawable.united_states_of_america, "Chile", "EUA", "Geórgia", "Portugal", R.id.rbt2));
        perguntas.put(46, new ListaPerguntas(R.drawable.uruguay, "Uruguai", "Argentina", "Chile", "Costa Rica", R.id.rbt1));
        perguntas.put(47, new ListaPerguntas(R.drawable.venezuela, "Paraguai", "Equador", "Venezuela", "Bolívia", R.id.rbt3));
        perguntas.put(48, new ListaPerguntas(R.drawable.vietnam, "Turquia", "Vietnã", "Tunísia", "Somaália", R.id.rbt2));
        perguntas.put(49, new ListaPerguntas(R.drawable.algeria, "Barbados", "Etiópia", "Tunísia", "Aruba", R.id.rbt1));
        perguntas.put(50, new ListaPerguntas(R.drawable.angola, "Croácia", "Ucrânia", "Polônia", "Angola", R.id.rbt4));
        perguntas.put(51, new ListaPerguntas(R.drawable.armenia, "Uruguai", "Armenia", "Equador", "Colombia", R.id.rbt2));
        perguntas.put(52, new ListaPerguntas(R.drawable.austria, "Polônia", "Grécia", "Austria", "Monaco", R.id.rbt3));
        perguntas.put(53, new ListaPerguntas(R.drawable.bolivia, "México", "Bolívia", "Bulgaria", "Croácia", R.id.rbt2));
        perguntas.put(54, new ListaPerguntas(R.drawable.bulgaria, "Irã", "Madagascar", "Bulgaria", "Itália", R.id.rbt3));
        perguntas.put(55, new ListaPerguntas(R.drawable.cameroon, "Gana", "Camarões", "Guinéia", "India", R.id.rbt2));
        perguntas.put(56, new ListaPerguntas(R.drawable.china, "China", "Malta", "Hong Kong", "Nepal", R.id.rbt1));
        perguntas.put(57, new ListaPerguntas(R.drawable.colombia, "Equador", "Bolívia", "Paraguai", "Colombia", R.id.rbt4));
        perguntas.put(58, new ListaPerguntas(R.drawable.croatia, "Panamá", "Croácia", "Paraguai", "Holanda", R.id.rbt2));
        perguntas.put(59, new ListaPerguntas(R.drawable.denmark, "Suiça", "Noruéga", "Dinamarca", "Finlândia", R.id.rbt3));
        perguntas.put(60, new ListaPerguntas(R.drawable.dominican_republic, "Noruéga", "Dinamarca", "Finlândia", "República Domínicana", R.id.rbt4));
        perguntas.put(61, new ListaPerguntas(R.drawable.ghana, "Gana", "Camarões", "República do Congo", "Senegal", R.id.rbt1));
        perguntas.put(62, new ListaPerguntas(R.drawable.guatemala, "Uruguai", "Guatemala", "Argentina", "Somália", R.id.rbt2));
        perguntas.put(63, new ListaPerguntas(R.drawable.guinea, "Camarões", "Gana", "Guinéia", "Senegal", R.id.rbt3));
        perguntas.put(64, new ListaPerguntas(R.drawable.india, "Irlanda", "Nigéria", "Irã", "Índia", R.id.rbt4));
        perguntas.put(65, new ListaPerguntas(R.drawable.indonesia, "Indonésia", "Polônia", "Monaco", "Malta", R.id.rbt1));
        perguntas.put(66, new ListaPerguntas(R.drawable.iraq, "Israel", "Iraque", "Irã", "Síria", R.id.rbt2));
        perguntas.put(67, new ListaPerguntas(R.drawable.jamaica, "África do Sul", "Togo", "Jamaica", "Nigéria", R.id.rbt3));
        perguntas.put(68, new ListaPerguntas(R.drawable.malta, "Malta", "Polônia", "Austria", "Monaco", R.id.rbt1));
        perguntas.put(69, new ListaPerguntas(R.drawable.senegal, "Camarões", "Gana", "Guinéia", "Senegal", R.id.rbt4));
        perguntas.put(70, new ListaPerguntas(R.drawable.south_africa, "Tanzânia", "África do Sul", "Sudão", "Timor Leste", R.id.rbt2));
        perguntas.put(71, new ListaPerguntas(R.drawable.switzerland, "Suíça", "Finlândia", "Dinamarca", "Noruéga", R.id.rbt1));

        return perguntas;
    }

}
