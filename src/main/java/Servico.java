

import java.util.ArrayList;
import java.util.List;

public abstract class Servico {

    private List<Carro> carrosComDebito = new ArrayList<Carro>();

    public void addCarroComDebito(Carro carro) {
        this.carrosComDebito.add(carro);
    }

    public boolean consultarCarroComDebito(Carro carro) {
        return this.carrosComDebito.contains(carro);
    }

}