package models;

import org.jetbrains.annotations.Contract;

import java.util.Date;
import java.util.Objects;

public class Veiculo {

    private String placa;
    private String modelo;
    private Date ano;
    private float gastCombust;
    private float gastManutencao;
    private Date vencLicenciamento;

    public Veiculo(String placa, String modelo, Date ano, float gastCombust, float gastManutencao, Date vencLicenciamento) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.gastCombust = gastCombust;
        this.gastManutencao = gastManutencao;
        this.vencLicenciamento = vencLicenciamento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public float getGastCombust() {
        return gastCombust;
    }

    public void setGastCombust(float gastCombust) {
        this.gastCombust = gastCombust;
    }

    public float getGastManutencao() {
        return gastManutencao;
    }

    public void setGastManutencao(float gastManutencao) {
        this.gastManutencao = gastManutencao;
    }

    public Date getVencLicenciamento() {
        return vencLicenciamento;
    }

    public void setVencLicenciamento(Date vencLicenciamento) {
        this.vencLicenciamento = vencLicenciamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Float.compare(veiculo.gastCombust, gastCombust) == 0 &&
                Float.compare(veiculo.gastManutencao, gastManutencao) == 0 &&
                Objects.equals(placa, veiculo.placa) &&
                Objects.equals(modelo, veiculo.modelo) &&
                Objects.equals(ano, veiculo.ano) &&
                Objects.equals(vencLicenciamento, veiculo.vencLicenciamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa, modelo, ano, gastCombust, gastManutencao, vencLicenciamento);
    }
}
