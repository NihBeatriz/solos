package domain;

import java.util.HashMap;

public class ParametrizacaoIdeal {
    private static final HashMap<Textura, ParametrizacaoSolo> parametrosIdeais = new HashMap<>() {{
        put(Textura.ARGILOSO, new ParametrizacaoSolo() {{
            setFosforo(9);
            setPotassio(0.35);
            setCalcio(6);
            setMagnesio(1.5);
            setEnxofre(9);
            setAluminio(0);
            setHidrogenioMaisAluminio(0);
        }});

        put(Textura.TEXTURA_MEDIA, new ParametrizacaoSolo() {{
            setFosforo(12);
            setPotassio(0.25);
            setCalcio(4);
            setMagnesio(1.0);
            setEnxofre(6);
            setAluminio(0);

            setHidrogenioMaisAluminio(0);
        }});
    }};

    public static ParametrizacaoSolo getParametrizacaoIdealPara(Textura textura) {
        return parametrosIdeais.get(textura);
    }
}
