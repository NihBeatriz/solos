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
    private final double kgPorHectare;

    public CalculadoraCorrecaoFosforo(TipoFosforo tipo, double valorPorTonelada, double teorAlvo, double eficiencia, double teorAtual) {
        kgPorHectare = getKgHectare(teorAtual, teorAlvo, eficiencia, tipo.getTeorP205());
        custoPorHectare = valorPorTonelada * kgPorHectare / 1000;
        quantidadeAplicacaoKgPorHectare = kgPorHectare;

        kgHaBeneficioPrimario = getKgHaBeneficioPrimario(tipo);
        kgHaBeneficioSecundario = getKgHaBeneficioSecundario(tipo);
        nomeBeneficioPrimario = tipo.getNomeBeneficioPrimario();
        nomeBeneficioSecundario = tipo.getNomeBeneficioSecundario();
    }

    private static double getKgHectare(double teorAtual, double teorDesejado, double eficiencia, double teorP2O5) {
        double teorAdicionar = teorDesejado - teorAtual;
        double teorEmKgPorHectare = teorAdicionar > 0 ? teorAdicionar * 2 : 0;
        double kgPorHectareP2O5 = teorEmKgPorHectare * 2.29;
        double kgPorHectareP2O5ComEficiencia = kgPorHectareP2O5 / eficiencia;
        return kgPorHectareP2O5ComEficiencia / teorP2O5;
    }

    private double getKgHaBeneficioSecundario(TipoFosforo tipo) {
        return kgPorHectare * tipo.getFatorBeneficioSecundario();
    }

    private double getKgHaBeneficioPrimario(TipoFosforo tipo) {
        double quantidade = tipo == YOORIN ? quantidadeAplicacaoKgPorHectare : kgPorHectare;
        return quantidade * tipo.getFatorBeneficioPrimario();
    }
}
