package models;

import java.util.Date;
import java.util.Objects;

public class Cliente {

    private int codCliente;
    private String nome;
    private String cpf;
    private float totalVendido;
    private String endereco;
    private String telefone;
    private Date datPagamento;

    public Cliente(int codCliente, String nome, String cpf, float totalVendido, String endereco, String telefone, Date datPagamento) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.totalVendido = totalVendido;
        this.endereco = endereco;
        this.telefone = telefone;
        this.datPagamento = datPagamento;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(float totalVendido) {
        this.totalVendido = totalVendido;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDatPagamento() {
        return datPagamento;
    }

    public void setDatPagamento(Date datPagamento) {
        this.datPagamento = datPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return codCliente == cliente.codCliente &&
                Float.compare(cliente.totalVendido, totalVendido) == 0 &&
                Objects.equals(nome, cliente.nome) &&
                Objects.equals(cpf, cliente.cpf) &&
                Objects.equals(endereco, cliente.endereco) &&
                Objects.equals(telefone, cliente.telefone) &&
                Objects.equals(datPagamento, cliente.datPagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCliente, nome, cpf, totalVendido, endereco, telefone, datPagamento);
    }
}
