

public class IPVA extends Servico {

    private static IPVA ipva = new IPVA();

    private IPVA() {};

    public static IPVA getInstancia() {
        return ipva;
    }

}