package domain.fosforo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraCorrecaoFosforoTest {

    @Test
    void calcularComSuperfosfatoSimples() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.SUPERFOSFATO_SIMPLES, 1260, 12, 0.7, 8.59);

        assertEquals(156.178, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(123.95079365079366, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(12, 4, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(34.70622222222223, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("Enxofre", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Cálcio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }

    @Test
    void calcularComYoorin() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.YOORIN, 1000, 12, 0.7, 8.59);

        assertEquals(123.95079365079366, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(123.95079365079366, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(18.59261904761905, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(34.70622222222223, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("Magnésio", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Cálcio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }

    @Test
    void calcularComMultifosfatoMagnesiano() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.MULTIFOSFATO_MAGNESIANO, 2000, 12, 0.7, 8.59);

        assertEquals(247.9015873015873, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(123.95079365079366, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(13.634587301587302, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(22.31114285714286, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("Enxofre", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Cálcio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }
}