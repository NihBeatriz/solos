package domain.version1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class ParametrizacaoSolo {
    private static final HashMap<Textura, ParametrizacaoSolo> parametrosIdeais = new HashMap<>() {{
        put(Textura.ARGILOSO, new ParametrizacaoSolo(9, 0.35, 6, 1.5, 9, 0, 0));
        put(Textura.TEXTURA_MEDIA, new ParametrizacaoSolo(12, 0.25, 4, 1, 6, 0, 0));
    }};
    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double hidrogenioMaisAluminio;

    public static ParametrizacaoSolo getParametrizacaoIdeal(Textura textura) {
        return parametrosIdeais.get(textura);
    }

    public double getEnxofreCmol() {
        return getPotassio() + getCalcio() + getMagnesio();
    }

    public double getCtcCmol() {
        return getHidrogenioMaisAluminio() + getEnxofreCmol();
    }
}
