

public class Seguro extends Servico {

    private static Seguro seguro = new Seguro();

    private Seguro() {};

    public static Seguro getInstancia() {
        return seguro;
    }

}