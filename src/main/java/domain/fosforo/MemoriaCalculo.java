package domain.fosforo;

public class MemoriaCalculo {

    public static double getKgHectareSuperfosfatoSimples(double teorAtual, double teorDesejado, double eficiencia, double teorP2O5) {

        double teorAdicionar = teorDesejado - teorAtual;
        double teorEmKgPorHectare = teorAdicionar > 0 ? teorAdicionar * 2 : 0;
        double kgPorHectareP2O5 = teorEmKgPorHectare * 2.29;
        double kgPorHectareP2O5ComEficiencia = kgPorHectareP2O5 / eficiencia;
        return kgPorHectareP2O5ComEficiencia / teorP2O5;
    }
}
