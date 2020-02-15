package models;

import java.util.Date;
import java.util.Objects;

public class Estoque {

    private int quantidade;
    private Date datEntrada;
    private Date datSaida;

    public Estoque(int quantidade, Date datEntrada, Date datSaida) {
        this.quantidade = quantidade;
        this.datEntrada = datEntrada;
        this.datSaida = datSaida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDatEntrada() {
        return datEntrada;
    }

    public void setDatEntrada(Date datEntrada) {
        this.datEntrada = datEntrada;
    }

    public Date getDatSaida() {
        return datSaida;
    }

    public void setDatSaida(Date datSaida) {
        this.datSaida = datSaida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estoque estoque = (Estoque) o;
        return quantidade == estoque.quantidade &&
                Objects.equals(datEntrada, estoque.datEntrada) &&
                Objects.equals(datSaida, estoque.datSaida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidade, datEntrada, datSaida);
    }
}
