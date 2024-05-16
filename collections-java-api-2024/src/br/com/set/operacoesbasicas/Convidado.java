package br.com.set.operacoesbasicas;

import java.util.Objects;

public class Convidado {
    // atributos
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    /*
     * @Override
     * public boolean equals(Object object) {
     * if (this == object) return true;
     * if (!(object instanceof Convidado convidado)) return false;
     * return getCodigoConvite() == convidado.getCodigoConvite();
     * }
     */

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado ||//>" + "\n" +
                "Nome : " + nome + "\n" +
                "Codigo Convite : " + codigoConvite + "\n";
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
}