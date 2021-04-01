package domain.teores;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Textura {

    ARGILOSO(1, "Argiloso", "+ 40% de argila"),
    TEXTURA_MEDIA(2, "Text. Média", "25 a 40% de argila");

    public final int id;
    public final String nome;
    public final String porcentagemArgila;
}