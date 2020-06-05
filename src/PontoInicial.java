import java.util.ArrayList;
import java.util.List;

public class PontoInicial {
    public static void main(String[] args)
    {
        ArrayList<String> estadao_sigs = new ArrayList<>();

        estadao_sigs.add("daily");
        estadao_sigs.add("weekly");
        estadao_sigs.add("monthly");

        ArrayList<String> mc_sigs = new ArrayList<>();
        mc_sigs.add("weekly");

        Editora estadao =  new Editora("Estadão", estadao_sigs);
        estadao.addObserver(new Pessoa("José","daily"));
        estadao.addObserver(new Pessoa("Joao", "weekly"));
        estadao.iniciar();

        Editora marieClaire = new Editora("Marie Claire", mc_sigs);
        marieClaire.addObserver(new Pessoa("Maria", "weekly"));
        marieClaire.iniciar();
    }
}