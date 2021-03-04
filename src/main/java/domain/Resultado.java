package domain;

public class Resultado {
    private DadosDeEntrada dadosDeEntrada;
    private ParametrizacaoSolo parametrizacaoIdeal;
    private ParametrizacaoSolo parametrizacaoAposCorrecao;

    private double enxofreCmol; // S cmol
    private double ctcCmol; // CTC cmol
    private double porcentagemVatual; // V%  atual

    private double pocentagemTeorMateriaOrganica; // M.O. %
    private double carbono; // carbono

    public Resultado(DadosDeEntrada dadosDeEntrada) {
        this.dadosDeEntrada = dadosDeEntrada;
    }

    public DadosDeEntrada getDadosDeEntrada() {
        return dadosDeEntrada;
    }

    public void setDadosDeEntrada(DadosDeEntrada dadosDeEntrada) {
        this.dadosDeEntrada = dadosDeEntrada;
    }

    public ParametrizacaoSolo getParametrizacaoIdeal() {
        return parametrizacaoIdeal;
    }

    public void setParametrizacaoIdeal(ParametrizacaoSolo parametrizacaoIdeal) {
        this.parametrizacaoIdeal = parametrizacaoIdeal;
    }

    public ParametrizacaoSolo getParametrizacaoAposCorrecao() {
        return parametrizacaoAposCorrecao;
    }

    public void setParametrizacaoAposCorrecao(ParametrizacaoSolo parametrizacaoAposCorrecao) {
        this.parametrizacaoAposCorrecao = parametrizacaoAposCorrecao;
    }

    public double getEnxofreCmol() {
        return enxofreCmol;
    }

    public void setEnxofreCmol(double enxofreCmol) {
        this.enxofreCmol = enxofreCmol;
    }

    public double getCtcCmol() {
        return ctcCmol;
    }

    public void setCtcCmol(double ctcCmol) {
        this.ctcCmol = ctcCmol;
    }

    public double getPorcentagemVatual() {
        return porcentagemVatual;
    }

    public void setPorcentagemVatual(double porcentagemVatual) {
        this.porcentagemVatual = porcentagemVatual;
    }

    public double getPocentagemTeorMateriaOrganica() {
        return pocentagemTeorMateriaOrganica;
    }

    public void setPocentagemTeorMateriaOrganica(double pocentagemTeorMateriaOrganica) {
        this.pocentagemTeorMateriaOrganica = pocentagemTeorMateriaOrganica;
    }

    public double getCarbono() {
        return carbono;
    }

    public void setCarbono(double carbono) {
        this.carbono = carbono;
    }
}
