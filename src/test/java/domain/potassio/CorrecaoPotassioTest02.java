package domain.potassio;

import domain.Elementos;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static domain.Elementos.*;
import static domain.potassio.TipoPotassio.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrecaoPotassioTest02 {

    private static Stream<Arguments> fornecerDadosParaTesteDeCorrecaoDePotassio() {
        return Stream.of(
                Arguments.of(0.15, 1.16369278510473, 3, CLORETO_DE_POTASSIO, 2500, 450.54620689655314, 1126.365517241383, NENHUM, NENHUM, 0, 0)
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
