package domain.potassio;

import domain.Elementos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraCorrecaoPotassioTest {

    @Test
    public void calcularComSulfatoDePotassioMagnesio() {
        var calculadoraCorrecaoPotassio = new CalculadoraCorrecaoPotassio(0.15, 1.16369278510473, 3, TipoPotassio.SULFATO_DE_POTASSIO_E_MAGNESIO, 2000);

        assertEquals(1187.80363636364, calculadoraCorrecaoPotassio.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(2375.60727272728, calculadoraCorrecaoPotassio.getCustoPorHectare());
        assertEquals(Elementos.ENXOFRE, calculadoraCorrecaoPotassio.getBeneficioPrimario());
        assertEquals(Elementos.MAGNESIO, calculadoraCorrecaoPotassio.getBeneficioSecundario());
        assertEquals(261.3168000000008, calculadoraCorrecaoPotassio.getKgHaBeneficioPrimario());
        assertEquals(213.80465454545518, calculadoraCorrecaoPotassio.getKgHaBeneficioSecundario());
    }

    @Test
    public void calcularComSulfatoDePotassio() {
        var calculadoraCorrecaoPotassio = new CalculadoraCorrecaoPotassio(0.15, 1.16369278510473, 3, TipoPotassio.SULFATO_DE_POTASSIO, 2000);

        assertEquals(502.5323076923092, calculadoraCorrecaoPotassio.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(1005.0646153846184, calculadoraCorrecaoPotassio.getCustoPorHectare());
        assertEquals(Elementos.ENXOFRE, calculadoraCorrecaoPotassio.getBeneficioPrimario());
        assertEquals(Elementos.NENHUM, calculadoraCorrecaoPotassio.getBeneficioSecundario());
        assertEquals(85.43049230769257, calculadoraCorrecaoPotassio.getKgHaBeneficioPrimario());
        assertEquals(0, calculadoraCorrecaoPotassio.getKgHaBeneficioSecundario());
    }

    @Test
    public void calcularComCloretoDePotassio() {
        var calculadoraCorrecaoPotassio = new CalculadoraCorrecaoPotassio(0.15, 1.16369278510473, 3, TipoPotassio.CLORETO_DE_POTASSIO, 2000);

        assertEquals(450.54620689655314, calculadoraCorrecaoPotassio.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(901.0924137931063, calculadoraCorrecaoPotassio.getCustoPorHectare());
        assertEquals(Elementos.NENHUM, calculadoraCorrecaoPotassio.getBeneficioPrimario());
        assertEquals(Elementos.NENHUM, calculadoraCorrecaoPotassio.getBeneficioSecundario());
        assertEquals(0, calculadoraCorrecaoPotassio.getKgHaBeneficioPrimario());
        assertEquals(0, calculadoraCorrecaoPotassio.getKgHaBeneficioSecundario());
    }
}