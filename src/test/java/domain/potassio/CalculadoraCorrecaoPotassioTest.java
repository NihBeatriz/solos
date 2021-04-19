package domain.potassio;

import domain.Elementos;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraCorrecaoPotassioTest {

    private static Stream<Arguments> fornecerDadosParaTesteDeCorrecaoDePotassio() {
        return Stream.of(
                Arguments.of(0.15, 1.16369278510473, 3, TipoPotassio.SULFATO_DE_POTASSIO_E_MAGNESIO, 2000, 1187.80363636364, 2375.60727272728, Elementos.ENXOFRE, Elementos.MAGNESIO, 261.3168000000008, 213.80465454545518),
                Arguments.of(0.15, 1.16369278510473, 3, TipoPotassio.SULFATO_DE_POTASSIO, 2000, 502.5323076923092, 1005.0646153846184, Elementos.ENXOFRE, Elementos.NENHUM, 85.43049230769257, 0),
                Arguments.of(0.15, 1.16369278510473, 3, TipoPotassio.CLORETO_DE_POTASSIO, 2000, 450.54620689655314, 901.0924137931063, Elementos.NENHUM, Elementos.NENHUM, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("fornecerDadosParaTesteDeCorrecaoDePotassio")
    public void calcularCorrecaoDePotassio(double teorPotassioAtual, double participacaoAtual, double participacaoDesejada,
                                           TipoPotassio tipoPotassio, double valorPorTonelada, double quantidadeAplcacaoKgPorHectare,
                                           double custoPorHectare, Elementos beneficioPrimario, Elementos beneficioSecundario,
                                           double kgHaBeneficioPrimario, double kgHaBeneficioSecundario) {

        var calculadora = new CalculadoraCorrecaoPotassio(teorPotassioAtual, participacaoAtual, participacaoDesejada, tipoPotassio, valorPorTonelada);

        assertEquals(quantidadeAplcacaoKgPorHectare, calculadora.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(custoPorHectare, calculadora.getCustoPorHectare());
        assertEquals(beneficioPrimario, calculadora.getBeneficioPrimario());
        assertEquals(beneficioSecundario, calculadora.getBeneficioSecundario());
        assertEquals(kgHaBeneficioPrimario, calculadora.getKgHaBeneficioPrimario());
        assertEquals(kgHaBeneficioSecundario, calculadora.getKgHaBeneficioSecundario());
    }
}