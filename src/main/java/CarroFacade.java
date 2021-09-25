

public class CarroFacade {

    public static boolean consultarPendenciasCompra(Carro carro) {
        if (IPVA.getInstancia().consultarCarroComDebito(carro)) {
            return false;
        }
        if (Seguro.getInstancia().consultarCarroComDebito(carro)) {
            return false;
        }
        if (Multas.getInstancia().consultarCarroComDebito(carro)) {
            return false;
        }
        return true;
    }
}