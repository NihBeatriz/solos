package domain.fosforo;

import domain.Elementos;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static domain.Elementos.*;
import static domain.fosforo.TipoFosforo.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrecaoFosforoTest02 {

    private static Stream<Arguments> fornecerDadosParaTesteDeCorrecaoDeFosforo() {
        return Stream.of(
                Arguments.of(SUPERFOSFATO_SIMPLES, 1260, 12, 0.7, 8.59, 156.178, 123.95079365079366, 12.395079365079367, 34.70622222222223, ENXOFRE, CALCIO)
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
