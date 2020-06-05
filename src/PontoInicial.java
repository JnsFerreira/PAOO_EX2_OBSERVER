import java.util.ArrayList;
import java.util.Arrays;

public class PontoInicial {
    public static void main(String[] args)
    {
        //Estadão
        ArrayList<String> estadao_sigs = new ArrayList<>();
        estadao_sigs.add("daily");
        estadao_sigs.add("weekend");

        Editora estadao =  new Editora("Estadão", estadao_sigs);
        estadao.novoAssinante(new Pessoa("José","daily"));
        estadao.novoAssinante(new Pessoa("Joao", "weekend"));
        estadao.iniciar();

        //Marie Claire
        ArrayList<String> mc_sigs = new ArrayList<>();
        mc_sigs.add("weekly");

        Editora marieClaire = new Editora("Marie Claire", mc_sigs);
        marieClaire.novoAssinante(new Pessoa("Maria", "weekly"));
        marieClaire.iniciar();
    }
}