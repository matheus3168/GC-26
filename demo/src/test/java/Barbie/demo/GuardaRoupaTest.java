package Barbie.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuardaRoupaTest {

    @Test
    void deveCalcularDescontoCorretamente() {
        GuardaRoupa roupa = new GuardaRoupa(500);

        double resultado = roupa.precoComDesconto(100, 10);

        assertEquals(90, resultado, 0.001);
    }

    @Test
    void naoDeveAceitarDescontoAcimaDe100() {
        GuardaRoupa roupa = new GuardaRoupa(500);

        assertThrows(IllegalArgumentException.class, () -> {
            roupa.precoComDesconto(100, 150);
        });
    }

    @Test
    void naoDeveAceitarDescontoNegativo() {
        GuardaRoupa roupa = new GuardaRoupa(500);

        assertThrows(IllegalArgumentException.class, () -> {
            roupa.precoComDesconto(100, -10);
        });
    }

    @Test
    void deveAceitarLookComValorExatoDoOrcamento() {
        GuardaRoupa roupa = new GuardaRoupa(200);

        assertTrue(roupa.cabeNoOrcamento(200));
    }

    @Test
    void deveIdentificarLookDeGala() {
        GuardaRoupa roupa = new GuardaRoupa(500);

        assertTrue(roupa.ehDeGala(200));
    }

    @Test
    void devePermitirCompraDentroDoOrcamento() {
        GuardaRoupa roupa = new GuardaRoupa(500);

        roupa.registrarCompra(200);

        assertEquals(300, roupa.getOrcamento(), 0.001);
    }

    @Test
    void naoDevePermitirCompraAcimaDoOrcamento() {
        GuardaRoupa roupa = new GuardaRoupa(500);

        assertThrows(IllegalArgumentException.class, () -> {
            roupa.registrarCompra(700);
        });

        assertEquals(500, roupa.getOrcamento(), 0.001);
    }

    @Test
    void naoDeveCriarGuardaRoupaComOrcamentoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new GuardaRoupa(-500);
        });
    }

    @Test
    void naoDeveAceitarPrecoNegativo() {
        GuardaRoupa roupa = new GuardaRoupa(500);

        assertThrows(IllegalArgumentException.class, () -> {
            roupa.ehDeGala(-100);
        });
    }
}