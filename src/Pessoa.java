import java.security.Signature;
import java.util.Random;

public class Pessoa implements Observer{
    private String name;
    private String signatureType; // 'fds' | 'mensal' | 'semanal'
    private boolean queroSair = false;
    private Random gerador = new Random();

    //Método construtor
    public Pessoa(String name, String signatureType)
    {
        this.name = name;
        this.signatureType =  signatureType;
    }

    //Revisar
    @Override
    public void update(String e) {
        System.out.println(e);
        //0.1 de probabilidade de saída
        queroSair =  gerador.nextDouble() >= 0.9;
    }

    public String getSignatureType()
    {
        return signatureType;
    }

    public boolean queroSair()
    {
        return this.queroSair;
    }
}