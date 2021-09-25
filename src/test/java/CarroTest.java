import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void retornaDebitoIPVA() {
        Carro carro = new Carro();
        IPVA.getInstancia().addCarroComDebito(carro);

        assertEquals(false, carro.comprar());
    }

    @Test
    void retornaDebitoMultas() {
        Carro carro = new Carro();
        Multas.getInstancia().addCarroComDebito(carro);

        assertEquals(false, carro.comprar());
    }

    @Test
    void retornaDebitoSeguro() {
        Carro carro = new Carro();
        Seguro.getInstancia().addCarroComDebito(carro);

        assertEquals(false, carro.comprar());
    }

    @Test
    void retornaCarroSemDebitosComprar() {
        Carro carro = new Carro();

        assertEquals(true, carro.comprar());
    }

}