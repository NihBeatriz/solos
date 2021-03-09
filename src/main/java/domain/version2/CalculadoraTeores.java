package domain.version2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class CalculadoraTeores {
    private final HashMap<Textura, ParametrizacaoSolo> parametrosIdeais = new HashMap<>() {{
        put(Textura.ARGILOSO, new ParametrizacaoSolo(9, 0.35, 6, 1.5, 9, 0, 0));
        put(Textura.TEXTURA_MEDIA, new ParametrizacaoSolo(12, 0.25, 4, 1, 6, 0, 0));
    }};
    private Textura textura;
    private String sistemaCultivo;
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
        return parametrosIdeais.get(textura);
    }

    public double calcularEnxofreCmol() {
        return amostra.getPotassio() + amostra.getCalcio() + amostra.getMagnesio();
    }

    public double calcularCtcCmol() {
        return amostra.getHidrogenioMaisAluminio() + calcularEnxofreCmol();
    }

    public double calcularPorcentagemVatual() {
        return 100 * calcularEnxofreCmol() / calcularCtcCmol();
    }

    public double calcularCarbono() {
        return calcularPorcentagemMateriaOrganica() / 1.72 * 10;
    }

    public enum Textura {ARGILOSO, TEXTURA_MEDIA}

    @Data
    @AllArgsConstructor
    public static class ParametrizacaoSolo {
        private double fosforo;
        private double potassio;
        private double calcio;
        private double magnesio;
        private double enxofre;
        private double aluminio;
        private double hidrogenioMaisAluminio;
    }
}