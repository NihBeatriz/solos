package domain;

import static domain.ParametrizacaoIdeal.getParametrizacaoIdealPara;

public class CalculadoraTeores {


    public Resultado Calcular(DadosDeEntrada dadosDeEntrada) {

        Resultado resultado = new Resultado(dadosDeEntrada);

        resultado.setParametrizacaoIdeal(getParametrizacaoIdealPara(dadosDeEntrada.getTextura()));

        double enxofreCmol = getEnxofreCmol(dadosDeEntrada);
        double ctcCmol = getCtcCmol(dadosDeEntrada, enxofreCmol);
        double porcentagemVatual = getPorcentagemVatual(enxofreCmol, ctcCmol);
        double porcentagemMateriaOrganica = getPorcentagemMateriaOrganica(dadosDeEntrada);
        double carbono = getCarbono(porcentagemMateriaOrganica);

        resultado.setEnxofreCmol(enxofreCmol);
        resultado.setCtcCmol(ctcCmol);
        resultado.setPorcentagemVatual(porcentagemVatual);
        resultado.setPocentagemTeorMateriaOrganica(porcentagemMateriaOrganica);
        resultado.setCarbono(carbono);

        return resultado;
    }

    private double getCarbono(double porcentagemMateriaOrganica) {
        return porcentagemMateriaOrganica / 1.72 * 10;
    }

    private double getPorcentagemMateriaOrganica(DadosDeEntrada dadosDeEntrada) {
        return dadosDeEntrada.temQuantidadeMateriaOrganica() ?
                dadosDeEntrada.getQuantidadeMateriaOrganica() / 10
                : dadosDeEntrada.getPorcentagemMateriaOrganica();
    }

    private double getPorcentagemVatual(double enxofreCmol, double ctcCmol) {
        return 100 * enxofreCmol / ctcCmol;
    }

    private double getCtcCmol(DadosDeEntrada dadosDeEntrada, double enxofreCmol) {
        ParametrizacaoSolo parametrizacaoSolo = dadosDeEntrada.getAmostra();
        return parametrizacaoSolo.getHidrogenioMaisAluminio() + enxofreCmol;
    }

    private double getEnxofreCmol(DadosDeEntrada dadosDeEntrada) {
        ParametrizacaoSolo parametrizacaoSolo = dadosDeEntrada.getAmostra();

        return parametrizacaoSolo.getPotassio()
                + parametrizacaoSolo.getCalcio()
                + parametrizacaoSolo.getMagnesio();
    }
}
