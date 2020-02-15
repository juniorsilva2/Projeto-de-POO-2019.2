package models;

import java.util.Objects;

public class Fornecedor
{

   private int codFornecedor;
   private String nome;
   private String telefone;

    public Fornecedor(int codFornecedor, String nome, String telefone) {
        this.codFornecedor = codFornecedor;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornecedor that = (Fornecedor) o;
        return codFornecedor == that.codFornecedor &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(telefone, that.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codFornecedor, nome, telefone);
    }
}
