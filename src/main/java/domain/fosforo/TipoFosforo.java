package domain.fosforo;

import domain.Elementos;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoFosforo {
    SUPERFOSFATO_SIMPLES(0.1, 0.28, Elementos.ENXOFRE, Elementos.CALCIO, 0.18),
    SUPERFOSFATO_TRIPLO(0, 0.2, Elementos.NENHUM, Elementos.CALCIO, 0.41),
    MAP(0, 0.09, Elementos.NENHUM, Elementos.NITROGENIO, 0.48),
    DAP(0, 0.16, Elementos.NENHUM, Elementos.NITROGENIO, 0.45),
    YOORIN(0.15, 0.28, Elementos.MAGNESIO, Elementos.CALCIO, 0.18),
    FOSFATO_ARAD(0, 0.52, Elementos.NENHUM, Elementos.CALCIO, 0.33),
    FOSFATO_FAFSA(0, 0.52, Elementos.NENHUM, Elementos.CALCIO, 0.29),
    FOFATO_DAOUI(0, 0.45, Elementos.NENHUM, Elementos.CALCIO, 0.32),
    FOSFATO_PATOS_MINAS(0, 0.28, Elementos.NENHUM, Elementos.CALCIO, 0.24),
    ESCORIA_THOMAS(0, 0.44, Elementos.NENHUM, Elementos.CALCIO, 0.185),
    ACIDO_FOSFORICO(0, 0, Elementos.NENHUM, Elementos.NENHUM, 0.52),
    MULTIFOSFATO_MAGNESIANO(0.11, 0.18, Elementos.ENXOFRE, Elementos.CALCIO, 0.18);

    private final double fatorBeneficioPrimario;
    private final double fatorBeneficioSecundario;
    private final Elementos beneficioPrimario;
    private final Elementos beneficioSecundario;
    private final double teorP205;
}
