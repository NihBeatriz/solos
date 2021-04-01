package domain.potassio;

import domain.Elementos;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoPotassio {
    CLORETO_DE_POTASSIO(0, 0, Elementos.NENHUM, Elementos.NENHUM, 0.58),
    SULFATO_DE_POTASSIO(0.17, 0, Elementos.ENXOFRE, Elementos.NENHUM, 0.52),
    SULFATO_DE_POTASSIO_E_MAGNESIO(0.22, 0.18, Elementos.ENXOFRE, Elementos.MAGNESIO, 0.22);

    private final double fatorBeneficioPrimario;
    private final double fatorBeneficioSecundario;
    private final String nomeBeneficioPrimario;
    private final String nomeBeneficioSecundario;
    private final double teorOxidoPotassio;
}
