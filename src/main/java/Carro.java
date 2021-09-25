

import java.text.Normalizer;

public class Carro {

    public boolean comprar() {
        return CarroFacade.consultarPendenciasCompra(this);
    }
}