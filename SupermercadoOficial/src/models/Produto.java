package models;

import java.util.Objects;

public class Produto {

    private  int codProduto;
    private String tipo;
    private String descricao;
    private String unidMedida;
    private String nomeProduto;

    public Produto(int codProduto, String tipo, String descricao, String unidMedida, String nomeProduto) {
        this.codProduto = codProduto;
        this.tipo = tipo;
        this.descricao = descricao;
        this.unidMedida = unidMedida;
        this.nomeProduto = nomeProduto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidMedida() {
        return unidMedida;
    }

    public void setUnidMedida(String unidMedida) {
        this.unidMedida = unidMedida;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codProduto == produto.codProduto &&
                Objects.equals(tipo, produto.tipo) &&
                Objects.equals(descricao, produto.descricao) &&
                Objects.equals(unidMedida, produto.unidMedida) &&
                Objects.equals(nomeProduto, produto.nomeProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codProduto, tipo, descricao, unidMedida, nomeProduto);
    }
}
