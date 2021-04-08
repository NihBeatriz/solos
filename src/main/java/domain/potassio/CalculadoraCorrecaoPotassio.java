package domain.potassio;

import domain.Elementos;
import lombok.Getter;

@Getter
public class CalculadoraCorrecaoPotassio {

    private final double quantidadeAplicacaoKgPorHectare;
    private final double custoPorHectare;
    private final double kgHaBeneficioPrimario;
    private final double kgHaBeneficioSecundario;
    private final Elementos beneficioPrimario;
    private final Elementos beneficioSecundario;

    CalculadoraCorrecaoPotassio(double teorPotassioAtual, double participacaoAtual, double participacaoDesejada, TipoPotassio tipoPotassio, double valorPorTonelada) {
        quantidadeAplicacaoKgPorHectare = getKgHectare(teorPotassioAtual, participacaoAtual, participacaoDesejada, tipoPotassio.getTeorOxidoPotassio());
        custoPorHectare = quantidadeAplicacaoKgPorHectare * valorPorTonelada / 1000;
        kgHaBeneficioPrimario = quantidadeAplicacaoKgPorHectare * tipoPotassio.getFatorBeneficioPrimario();
        beneficioPrimario = tipoPotassio.getBeneficioPrimario();
        kgHaBeneficioSecundario = quantidadeAplicacaoKgPorHectare * tipoPotassio.getFatorBeneficioSecundario();
        beneficioSecundario = tipoPotassio.getBeneficioSecundario();
    }

    private static double getKgHectare(double teorPotassioAtual, double participacaoAtual, double participacaoDesejada, double teorOxidoDePotassio) {
        double cmolcDm3DePotassio = (teorPotassioAtual * participacaoDesejada / participacaoAtual) - teorPotassioAtual;
        double mgDc3DePotassio = cmolcDm3DePotassio * 391;
        double kgPorHectareDePotassio = mgDc3DePotassio * 2;
        double kgPorHectadeEmOxidoDePotassio = kgPorHectareDePotassio * 1.2;
        double kgPorHectadeEmOxidoDePotassioEficiente = kgPorHectadeEmOxidoDePotassio / 0.85;
        return kgPorHectadeEmOxidoDePotassioEficiente / teorOxidoDePotassio;
    }
}
