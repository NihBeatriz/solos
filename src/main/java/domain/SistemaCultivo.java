package domain;

public enum SistemaCultivo {
    PLANTIO_DIRETO(1, "Plantio Direto"),
    CONVENCIONAL(2, "Convencional");

    public final int id;
    public final String nome;

    SistemaCultivo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
