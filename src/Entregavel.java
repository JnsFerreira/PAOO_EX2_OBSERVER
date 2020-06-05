import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Random;

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

    @Override
    public void notifyObserver(Calendar myDate) {
        List <Observer> aux = new ArrayList<>();

        //Dia da Semana
        int dow = myDate.get (Calendar.DAY_OF_WEEK);

        boolean isWeekend = ((dow >= Calendar.SATURDAY) && (dow <= Calendar.SUNDAY));
        boolean isMonday = dow >= Calendar.MONDAY;
        boolean isFirstDay  = (myDate.get(Calendar.DAY_OF_MONTH) == 1);

        for(Observer o : observers)
        {
            String sigType = ((Pessoa)o).getSignatureType();

            System.out.println(sigType);

            //Monthly
            if(sigType.equals("monthly") && isFirstDay) { o.update(conteudo); }

            //Weekend
            else if(sigType.equals("weekend") && isWeekend){ o.update(conteudo); }

            //Weekly
            else if(sigType.equals("weekly") && isMonday) { o.update(conteudo); }

            //Daily
            else if(sigType.equals("daily")) { o.update(conteudo); }

            else { System.out.println("Assinatura não encontrada"); }

            //Verifica se o assinate deseja continuar com a assinatura
            if(!((Pessoa)o).queroSair())
            {
                aux.add(o);
            }}

        observers.clear();
        observers.addAll(aux);
    }

    //Função para gerar strings aleatórias
    private String randomString() {

        int leftLimit = 97; // Letra 'a'
        int rightLimit = 122; // Letra 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    public void iniciar()
    {
        System.out.println("Starting...");

        Calendar myDate = Calendar.getInstance();

        while(true)
        {
            if(!observers.isEmpty()) {
                //Gera conteudo com strings random
                this.conteudo = randomString();

                // Notifica os observers
                notifyObserver(myDate);

                //Próxima data
                myDate.add(Calendar.DAY_OF_YEAR, 1);
            }
            else
            {
                System.out.println("Faliu :(");
                break;
            }
        }
    }
}
