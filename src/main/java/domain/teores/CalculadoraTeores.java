package domain.teores;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalculadoraTeores {
    private Textura textura;
    private SistemaCultivo sistemaCultivo;
    private ParametrizacaoSolo amostra;
    private double quantidadeMateriaOrganica;
    private double porcentagemMateriaOrganica;
    private String responsavelTecnico;
    private int profundidadeAmostra;
    private int numeroResultadoAnalise;

    public double calcularPorcentagemMateriaOrganica() {
        return quantidadeMateriaOrganica > 0 ? quantidadeMateriaOrganica / 10 : porcentagemMateriaOrganica;
    }

    public ParametrizacaoSolo calcularParametrizacaoIdeal() {
        return ParametrizacaoSolo.getParametrizacaoIdeal(textura);
    }

    public double calcularEnxofreCmol() {
        return amostra.getEnxofreCmol();
    }

    public double calcularCtcCmol() {
        return amostra.getCtcCmol();
    }

    public double calcularPorcentagemVatual() {
        return 100 * calcularEnxofreCmol() / calcularCtcCmol();
    }

    public double calcularCarbono() {
        return calcularPorcentagemMateriaOrganica() / 1.72 * 10;
    }
}
