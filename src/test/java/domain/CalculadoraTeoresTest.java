package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTeoresTest {

    @Test
    void deveCalcularCorretamenteOsValoresConformePlanilha() {

        DadosDeEntrada dadosDeEntrada = getDadosDeEntrada();
        CalculadoraTeores calculadoraTeores = new CalculadoraTeores();

        Resultado resultado = calculadoraTeores.Calcular(dadosDeEntrada);

        assertEquals(12, resultado.getParametrizacaoIdeal().getFosforo());
        assertEquals(0.25, resultado.getParametrizacaoIdeal().getPotassio());
        assertEquals(4, resultado.getParametrizacaoIdeal().getCalcio());
        assertEquals(1, resultado.getParametrizacaoIdeal().getMagnesio());
        assertEquals(6, resultado.getParametrizacaoIdeal().getEnxofre());

        assertEquals(7.54, resultado.getEnxofreCmol());
        assertEquals(12.89, resultado.getCtcCmol());
        assertEquals(58.494957331264544, resultado.getPorcentagemVatual());

        assertEquals(3.069, resultado.getPocentagemTeorMateriaOrganica());
        assertEquals(17.843023255813954, resultado.getCarbono());

    }

    private DadosDeEntrada getDadosDeEntrada() {
        ParametrizacaoSolo amostra = new ParametrizacaoSolo();

        amostra.setFosforo(8.59);
        amostra.setPotassio(0.15);
        amostra.setCalcio(5.76);
        amostra.setMagnesio(1.63);
        amostra.setEnxofre(3.76);
        amostra.setHidrogenioMaisAluminio(5.35);

        DadosDeEntrada dadosDeEntrada = new DadosDeEntrada();
        dadosDeEntrada.setAmostra(amostra);
        dadosDeEntrada.setNumeroResultadoAnalise(761);
        dadosDeEntrada.setTextura(Textura.TEXTURA_MEDIA);
        dadosDeEntrada.setSistemaCultivo(SistemaCultivo.PLANTIO_DIRETO);
        dadosDeEntrada.setProfundidadeAmostra(20);
        dadosDeEntrada.setQuantidadeMateriaOrganica(30.69);

        return dadosDeEntrada;
    }
}