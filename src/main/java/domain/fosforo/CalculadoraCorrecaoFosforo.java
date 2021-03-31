package domain.fosforo;

import lombok.Getter;

import static domain.fosforo.TipoFosforo.YOORIN;

@Getter
public class CalculadoraCorrecaoFosforo {
    private final double quantidadeAplicacaoKgPorHectare;
    private final double custoPorHectare;
    private final double kgHaBeneficioPrimario;

    private final double kgHaBeneficioSecundario;
    private final String nomeBeneficioPrimario;
    private final String nomeBeneficioSecundario;

    private final double kgPorHectareSuperfosfatoSimples;


    public CalculadoraCorrecaoFosforo(TipoFosforo tipo, double valorPorTonelada, double teorAlvo, double eficiencia, double teorAtual) {
        kgPorHectareSuperfosfatoSimples = MemoriaCalculo.getKgHectareSuperfosfatoSimples(teorAtual, teorAlvo, eficiencia, tipo.getTeorP205());


        custoPorHectare = valorPorTonelada * kgPorHectareSuperfosfatoSimples / 1000;
        quantidadeAplicacaoKgPorHectare = kgPorHectareSuperfosfatoSimples;

        kgHaBeneficioPrimario = getKgHaBeneficioPrimario(tipo);
        kgHaBeneficioSecundario = getKgHaBeneficioSecundario(tipo);

        nomeBeneficioPrimario = tipo.getNomeBeneficioPrimario();
        nomeBeneficioSecundario = tipo.getNomeBeneficioSecundario();
    }

    private double getKgHaBeneficioSecundario(TipoFosforo tipo) {
        return kgPorHectareSuperfosfatoSimples * tipo.getFatorBeneficioSecundario();
    }

    private double getKgHaBeneficioPrimario(TipoFosforo tipo) {
        double quantidade = tipo == YOORIN ? quantidadeAplicacaoKgPorHectare : kgPorHectareSuperfosfatoSimples;
        return quantidade * tipo.getFatorBeneficioPrimario();
    }
}
