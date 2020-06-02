public class PontoInicial {
    public static void main(String[] args)
    {
        Entregavel estadao = new Entregavel();
        estadao.addObserver(new Pessoa("Jose", "d"));
        estadao.addObserver(new Pessoa("Joao", "fds"));
        estadao.iniciar();

    }
}