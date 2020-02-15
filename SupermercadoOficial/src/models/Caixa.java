package models;

import java.util.Objects;

public class Caixa {

    private int numCaixa;

    public Caixa(int numCaixa) {
        this.numCaixa = numCaixa;
    }

    public int getNumCaixa() {
        return numCaixa;
    }

    public void setNumCaixa(int numCaixa) {
        this.numCaixa = numCaixa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caixa caixa = (Caixa) o;
        return numCaixa == caixa.numCaixa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCaixa);
    }
}
