package domain;

public class DadosDeEntrada {
    private Textura textura;
    private SistemaCultivo sistemaCultivo;
    private ParametrizacaoSolo amostra;
    private double quantidadeMateriaOrganica; //M.O. (g.dm3)
    private double porcentagemMateriaOrganica; //M.O. %

    private String responsavelTecnico;
    private int profundidadeAmostra;
    private int numeroResultadoAnalise;

    public Textura getTextura() {
        return textura;
    }

    public void setTextura(Textura textura) {
        this.textura = textura;
    }

    public SistemaCultivo getSistemaCultivo() {
        return sistemaCultivo;
    }

    public void setSistemaCultivo(SistemaCultivo sistemaCultivo) {
        this.sistemaCultivo = sistemaCultivo;
    }

    public ParametrizacaoSolo getAmostra() {
        return amostra;
    }

    public void setAmostra(ParametrizacaoSolo amostra) {
        this.amostra = amostra;
    }

    public double getQuantidadeMateriaOrganica() {
        return quantidadeMateriaOrganica;
    }

    public void setQuantidadeMateriaOrganica(double quantidadeMateriaOrganica) {
        this.quantidadeMateriaOrganica = quantidadeMateriaOrganica;
    }

    public double getPorcentagemMateriaOrganica() {
        return porcentagemMateriaOrganica;
    }

    public void setPorcentagemMateriaOrganica(double porcentagemMateriaOrganica) {
        this.porcentagemMateriaOrganica = porcentagemMateriaOrganica;
    }

    public String getResponsavelTecnico() {
        return responsavelTecnico;
    }

    public void setResponsavelTecnico(String responsavelTecnico) {
        this.responsavelTecnico = responsavelTecnico;
    }

    public int getProfundidadeAmostra() {
        return profundidadeAmostra;
    }

    public void setProfundidadeAmostra(int profundidadeAmostra) {
        this.profundidadeAmostra = profundidadeAmostra;
    }

    public int getNumeroResultadoAnalise() {
        return numeroResultadoAnalise;
    }

    public void setNumeroResultadoAnalise(int numeroResultadoAnalise) {
        this.numeroResultadoAnalise = numeroResultadoAnalise;
    }

    public boolean temQuantidadeMateriaOrganica() {
        return quantidadeMateriaOrganica > 0; // > 0.01 na planilha
    }
}
