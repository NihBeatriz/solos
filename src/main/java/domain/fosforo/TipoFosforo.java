package domain.fosforo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoFosforo {
    SUPERFOSFATO_SIMPLES(0.1, 0.28, 0.18, Produtos.ENXOFRE, Produtos.CALCIO),
    SUPERFOSFATO_TRIPLO(0, 0.2, 0.41, Produtos.NENHUM, Produtos.CALCIO),
    MAP(0, 0.09, 0.42, Produtos.NENHUM, Produtos.NITROGENIO),
    DAP(0, 0.16, 0.45, Produtos.NENHUM, Produtos.NITROGENIO),
    YOORIN(0.15, 0.28, 0.18, Produtos.MAGNESIO, Produtos.CALCIO),
    FOSFATO_ARAD(0, 0.52, 0.33, Produtos.NENHUM, Produtos.CALCIO),
    FOSFATO_FAFSA(0, 0.52, 0.29, Produtos.NENHUM, Produtos.CALCIO),
    FOFATO_DAOUI(0, 0.45, 0.32, Produtos.NENHUM, Produtos.CALCIO),
    FOSFATO_PATOS_MINAS(0, 0.28, 0.24, Produtos.NENHUM, Produtos.CALCIO),
    ESCORIA_THOMAS(0, 0.44, 0.185, Produtos.NENHUM, Produtos.CALCIO),
    ACIDO_FOSFORICO(0, 0, 0.52, Produtos.NENHUM, Produtos.NENHUM),
    MULTIFOSFATO_MAGNESIANO(0.11, 0.18, 0.18, Produtos.ENXOFRE, Produtos.CALCIO);

    private final double fatorBeneficioPrimario;
    private final double fatorBeneficioSecundario;
    private final double teorP205;
    private final String nomeBeneficioPrimario;
    private final String nomeBeneficioSecundario;
}
