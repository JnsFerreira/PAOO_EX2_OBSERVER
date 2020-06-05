import java.util.ArrayList;

public class Editora extends Entregavel{

    private String name;
    private final ArrayList singnaturesTypes;

    public Editora(String name, ArrayList singnaturesTypes)
    {
        this.name = name;
        this.singnaturesTypes =  singnaturesTypes;
    }

    public void novoAssinante(Observer e)
    {
        String sigType = ((Pessoa)e).getSignatureType();

        if(singnaturesTypes.contains(sigType))
        {
            super.addObserver(e);
        }
    }
}
