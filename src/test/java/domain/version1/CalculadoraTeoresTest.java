package domain.version1;

import org.junit.jupiter.api.Test;

import static domain.version1.SistemaCultivo.PLANTIO_DIRETO;
import static domain.version1.Textura.TEXTURA_MEDIA;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTeoresTest {

    @Test
    void deveCalcularCorretamenteOsValoresConformePlanilha() {
        CalculadoraTeores calculadoraTeores = getCalculadoraTeores();

        assertEquals(12, calculadoraTeores.calcularParametrizacaoIdeal().getFosforo());
        assertEquals(0.25, calculadoraTeores.calcularParametrizacaoIdeal().getPotassio());
        assertEquals(4, calculadoraTeores.calcularParametrizacaoIdeal().getCalcio());
        assertEquals(1, calculadoraTeores.calcularParametrizacaoIdeal().getMagnesio());
        assertEquals(6, calculadoraTeores.calcularParametrizacaoIdeal().getEnxofre());

        assertEquals(7.54, calculadoraTeores.calcularEnxofreCmol());
        assertEquals(12.89, calculadoraTeores.calcularCtcCmol());
        assertEquals(58.494957331264544, calculadoraTeores.calcularPorcentagemVatual());

        assertEquals(3.069, calculadoraTeores.calcularPorcentagemMateriaOrganica());
        assertEquals(17.843023255813954, calculadoraTeores.calcularCarbono());
    }

    private CalculadoraTeores getCalculadoraTeores() {
        ParametrizacaoSolo amostra = new ParametrizacaoSolo(8.59, 0.15, 5.76, 1.63, 3.76, 0, 5.35);
        return new CalculadoraTeores(TEXTURA_MEDIA, PLANTIO_DIRETO, amostra, 30.69, 0, "", 20, 761);
    }
}