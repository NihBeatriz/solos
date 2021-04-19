package domain.fosforo;

import domain.Elementos;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static domain.Elementos.*;
import static domain.fosforo.TipoFosforo.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrecaoFosforoTest {

    private static Stream<Arguments> fornecerDadosParaTesteDeCorrecaoDeFosforo() {
        return Stream.of(
                Arguments.of(SUPERFOSFATO_SIMPLES, 1260, 12, 0.7, 8.59, 156.178, 123.95079365079366, 12.395079365079367, 34.70622222222223, ENXOFRE, CALCIO),
                Arguments.of(SUPERFOSFATO_TRIPLO, 2000, 12, 0.8, 8.59, 95.23048780487805, 47.615243902439026, 0.0, 9.523048780487805, NENHUM, CALCIO),
                Arguments.of(MAP, 2000, 12, 0.7, 8.59, 92.96309523809525, 46.481547619047625, 0, 4.183339285714286, NENHUM, NITROGENIO),
                Arguments.of(DAP, 2000, 12, 0.7, 8.59, 99.16063492063492, 49.58031746031746, 0, 7.932850793650794, NENHUM, NITROGENIO),
                Arguments.of(YOORIN, 1000, 12, 0.7, 8.59, 123.95079365079366, 123.95079365079366, 18.59261904761905, 34.70622222222223, MAGNESIO, CALCIO),
                Arguments.of(FOSFATO_ARAD, 1000, 12, 0.7, 8.59, 67.60952380952381, 67.60952380952381, 0, 35.15695238095238, NENHUM, CALCIO),
                Arguments.of(FOSFATO_FAFSA, 1000, 12, 0.7, 8.59, 76.93497536945814, 76.93497536945814, 0, 40.00618719211823, NENHUM, CALCIO),
                Arguments.of(FOFATO_DAOUI, 1000, 12, 0.7, 8.59, 69.72232142857143, 69.72232142857143, 0, 31.375044642857144, NENHUM, CALCIO),
                Arguments.of(FOSFATO_PATOS_MINAS, 1000, 12, 0.7, 8.59, 92.96309523809525, 92.96309523809525, 0, 26.02966666666667, NENHUM, CALCIO),
                Arguments.of(ESCORIA_THOMAS, 1000, 12, 0.7, 8.59, 120.60077220077221, 120.60077220077221, 0, 53.06433976833977, NENHUM, CALCIO),
                Arguments.of(ACIDO_FOSFORICO, 1000, 12, 0.7, 8.59, 42.90604395604395, 42.90604395604396, 0, 0, NENHUM, NENHUM),
                Arguments.of(MULTIFOSFATO_MAGNESIANO, 2000, 12, 0.7, 8.59, 247.9015873015873, 123.95079365079366, 13.634587301587302, 22.31114285714286, ENXOFRE, CALCIO)
        );
    }

    @ParameterizedTest
    @MethodSource("fornecerDadosParaTesteDeCorrecaoDeFosforo")
    void calcularCorrecaoDeFosforo(TipoFosforo tipo, double valorPorTonelada, double teorAlvo, double eficiencia, double teorAtual,
                                   double custoPorHectare, double quantidadeAplicacaoKgPorHectare, double kgHaBeneficioPrimario,
                                   double kgHaBeneficioSecundario, Elementos beneficioPrimario, Elementos beneficioSecundario) {

        var correcaoFosforo = new CorrecaoFosforo(tipo, valorPorTonelada, teorAlvo, eficiencia, teorAtual);

        assertEquals(custoPorHectare, correcaoFosforo.getCustoPorHectare());
        assertEquals(quantidadeAplicacaoKgPorHectare, correcaoFosforo.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(kgHaBeneficioPrimario, correcaoFosforo.getKgHaBeneficioPrimario());
        assertEquals(kgHaBeneficioSecundario, correcaoFosforo.getKgHaBeneficioSecundario());
        assertEquals(beneficioPrimario, correcaoFosforo.getBeneficioPrimario());
        assertEquals(beneficioSecundario, correcaoFosforo.getBeneficioSecundario());
    }
}