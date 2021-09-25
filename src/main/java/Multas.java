

public class Multas extends Servico {

    private static Multas multas = new Multas();

    private Multas() {};

    public static Multas getInstancia() {
        return multas;
    }

}