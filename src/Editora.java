import java.util.ArrayList;

public class Editora extends Entregavel{

    private String name;
    private ArrayList singnaturesTypes;

    public Editora(String name, ArrayList singnaturesTypes)
    {
        this.name = name;
        this.singnaturesTypes =  singnaturesTypes;
    }

    public ArrayList getSingnaturesTypes()
    {
        return this.singnaturesTypes;
    }
}
