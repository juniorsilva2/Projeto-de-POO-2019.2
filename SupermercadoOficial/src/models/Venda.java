package models;

import java.util.Objects;

public class Venda {

    private int codVenda;
    private int quantProduto;
    private float valorTotal;

    public Venda(int codVenda, int quantProduto, float valorTotal) {
        this.codVenda = codVenda;
        this.quantProduto = quantProduto;
        this.valorTotal = valorTotal;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return codVenda == venda.codVenda &&
                quantProduto == venda.quantProduto &&
                Float.compare(venda.valorTotal, valorTotal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codVenda, quantProduto, valorTotal);
    }
}
