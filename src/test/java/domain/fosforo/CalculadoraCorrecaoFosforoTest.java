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
    void calcularComSuperfosfatoTriplo() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.SUPERFOSFATO_TRIPLO, 2000, 12, 0.8, 8.59);

        assertEquals(95.23048780487805, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(47.615243902439026, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(9.523048780487805, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Cálcio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }

    @Test
    void calcularComMap() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.MAP, 2000, 12, 0.7, 8.59);

        assertEquals(92.96309523809525, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(46.481547619047625, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(4.183339285714286, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Nitrogênio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }

    @Test
    void calcularComDap() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.DAP, 2000, 12, 0.7, 8.59);

        assertEquals(99.16063492063492, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(49.58031746031746, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(7.932850793650794, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Nitrogênio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
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
    void calcularComFosfatoArad() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.FOSFATO_ARAD, 1000, 12, 0.7, 8.59);

        assertEquals(67.60952380952381, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(67.60952380952381, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(35.15695238095238, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Cálcio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }

    @Test
    void calcularComFosfatoFafsa() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.FOSFATO_FAFSA, 1000, 12, 0.7, 8.59);

        assertEquals(76.93497536945814, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(76.93497536945814, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(40.00618719211823, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Cálcio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }

    @Test
    void calcularComFosfatoDaoui() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.FOFATO_DAOUI, 1000, 12, 0.7, 8.59);

        assertEquals(69.72232142857143, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(69.72232142857143, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(31.375044642857144, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Cálcio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }

    @Test
    void calcularComFosfatoPatosDeMinas() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.FOSFATO_PATOS_MINAS, 1000, 12, 0.7, 8.59);

        assertEquals(92.96309523809525, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(92.96309523809525, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(26.02966666666667, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Cálcio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }

    @Test
    void calcularComEscoriaThomas() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.ESCORIA_THOMAS, 1000, 12, 0.7, 8.59);

        assertEquals(120.60077220077221, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(120.60077220077221, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(53.06433976833977, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("Cálcio", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
    }

    @Test
    void calcularComAcidoFosforico() {
        var calculadoraCorrecaoFosforo = new CalculadoraCorrecaoFosforo(TipoFosforo.ACIDO_FOSFORICO, 1000, 12, 0.7, 8.59);

        assertEquals(42.90604395604395, calculadoraCorrecaoFosforo.getCustoPorHectare());
        assertEquals(42.90604395604396, calculadoraCorrecaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(0, calculadoraCorrecaoFosforo.getKgHaBeneficioSecundario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioPrimario());
        assertEquals("", calculadoraCorrecaoFosforo.getNomeBeneficioSecundario());
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