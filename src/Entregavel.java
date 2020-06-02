import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;


public class Entregavel implements Subject{
    private String conteudo;

    //Lista de pessoas que são assinantes da editora
    private List <Observer> observers = new ArrayList<>();

    //Método para adicionar novos assinates
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    //Falta implementar a verificação de dias da semana e assinaturas
    @Override
    public void notifyObserver() {
        List <Observer> aux = new ArrayList<>();
        for(Observer o : observers)
        {
            //Verificar Assinatura
            o.update(conteudo);

            if(!((Pessoa)o).queroSair())
            {
                aux.add(o);
            }
        }
        observers.clear();
        observers.addAll(aux);
    }

    //Falta implementars
    public void iniciar()
    {
        System.out.println("Iniciando a porra todaaaa!!!");

        //Caso não haja mais observers
        System.out.println("Faliu");
    }
}
