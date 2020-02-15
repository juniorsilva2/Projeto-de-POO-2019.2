package models;
import java.util.Date;
import java.util.Objects;

public class Funcionario {

    private String nome;
    private int matricula;
    private String cpf;
    private String endereco;
    private String telefone;
    private float salario;
    private Date datNasci;
    private String cargo;
    private Date datIngresso;

    public Funcionario(String nome, int matricula, String cpf, String endereco, String telefone, float salario, Date datNasci, String cargo, Date datIngresso) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.datNasci = datNasci;
        this.cargo = cargo;
        this.datIngresso = datIngresso;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getDatNasci() {
        return datNasci;
    }

    public void setDatNasci(Date datNasci) {
        this.datNasci = datNasci;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDatIngresso() {
        return datIngresso;
    }

    public void setDatIngresso(Date datIngresso) {
        this.datIngresso = datIngresso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return matricula == that.matricula &&
                Float.compare(that.salario, salario) == 0 &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(cpf, that.cpf) &&
                Objects.equals(endereco, that.endereco) &&
                Objects.equals(telefone, that.telefone) &&
                Objects.equals(datNasci, that.datNasci) &&
                Objects.equals(cargo, that.cargo) &&
                Objects.equals(datIngresso, that.datIngresso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula, cpf, endereco, telefone, salario, datNasci, cargo, datIngresso);
    }
}
