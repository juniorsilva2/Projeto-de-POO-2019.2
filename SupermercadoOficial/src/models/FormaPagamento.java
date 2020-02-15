package models;

import java.util.Objects;

public class FormaPagamento {

    private int codPagamento;
    private String tipoPagamento;

    public FormaPagamento(int codPagamento, String tipoPagamento) {
        this.codPagamento = codPagamento;
        this.tipoPagamento = tipoPagamento;
    }

    public int getCodPagamento() {
        return codPagamento;
    }

    public void setCodPagamento(int codPagamento) {
        this.codPagamento = codPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormaPagamento that = (FormaPagamento) o;
        return codPagamento == that.codPagamento &&
                Objects.equals(tipoPagamento, that.tipoPagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPagamento, tipoPagamento);
    }
}
