package domain.potassio;

import domain.Elementos;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static domain.Elementos.*;
import static domain.potassio.TipoPotassio.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrecaoPotassioTest {

    private static Stream<Arguments> fornecerDadosParaTesteDeCorrecaoDePotassio() {
        return Stream.of(
                Arguments.of(0.15, 1.16369278510473, 3, SULFATO_DE_POTASSIO_E_MAGNESIO, 2000, 1187.80363636364, 2375.60727272728, ENXOFRE, MAGNESIO, 261.3168000000008, 213.80465454545518),
                Arguments.of(0.15, 1.16369278510473, 3, SULFATO_DE_POTASSIO, 2000, 502.5323076923092, 1005.0646153846184, ENXOFRE, NENHUM, 85.43049230769257, 0),
                Arguments.of(0.15, 1.16369278510473, 3, CLORETO_DE_POTASSIO, 2000, 450.54620689655314, 901.0924137931063, NENHUM, NENHUM, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("fornecerDadosParaTesteDeCorrecaoDePotassio")
    public void calcularCorrecaoDePotassio(double teorPotassioAtual, double participacaoAtual, double participacaoDesejada,
                                           TipoPotassio tipoPotassio, double valorPorTonelada, double quantidadeAplicacaoKgPorHectare,
                                           double custoPorHectare, Elementos beneficioPrimario, Elementos beneficioSecundario,
                                           double kgHaBeneficioPrimario, double kgHaBeneficioSecundario) {

        var correcaoPotassio = new CorrecaoPotassio(teorPotassioAtual, participacaoAtual, participacaoDesejada, tipoPotassio, valorPorTonelada);

        assertEquals(quantidadeAplicacaoKgPorHectare, correcaoPotassio.getQuantidadeAplicacaoKgPorHectare());
        assertEquals(custoPorHectare, correcaoPotassio.getCustoPorHectare());
        assertEquals(beneficioPrimario, correcaoPotassio.getBeneficioPrimario());
        assertEquals(beneficioSecundario, correcaoPotassio.getBeneficioSecundario());
        assertEquals(kgHaBeneficioPrimario, correcaoPotassio.getKgHaBeneficioPrimario());
        assertEquals(kgHaBeneficioSecundario, correcaoPotassio.getKgHaBeneficioSecundario());
    }
}