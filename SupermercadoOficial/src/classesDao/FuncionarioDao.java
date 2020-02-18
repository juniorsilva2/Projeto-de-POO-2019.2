package classesDao;

import models.Funcionario;

import java.io.*;
import java.util.Date;

/**
 *
 * @author Cleuton
 */

public class FuncionarioDao  {


    String nome;
    int matricula;
    String cpf;
    String endereco;
    String telefone;
    float salario;
    String datNascimento;
    String datIngresso;
    String cargo;



        public boolean addFuncionario(Funcionario funcionario) throws IOException {

    File arqFuncionario;
        arqFuncionario = new File(String.format("C:\\funcionario.dat%d", funcionario.getMatricula()));

        if(arqFuncionario.exists()) {

            FileOutputStream arq = new FileOutputStream(String.format("C:\\funcionario.dat%d", funcionario.getMatricula()));
            DataOutputStream gravarArq = new DataOutputStream(arq);

            this.nome = funcionario.getNome();
            this.matricula = funcionario.getMatricula();
            this.cpf = funcionario.getCpf();
            this.endereco = funcionario.getEndereco();
            this.telefone = funcionario.getTelefone();
            this.salario = funcionario.getSalario();
            this.datNascimento = funcionario.getDatNasci().toString();
            this.datIngresso = funcionario.getDatIngresso().toString();
            this.cargo = funcionario.getCargo();


            gravarArq.writeChars(nome);
            gravarArq.writeInt(matricula);
            gravarArq.writeChars(cpf);
            gravarArq.writeChars(endereco);
            gravarArq.writeChars(telefone);
            gravarArq.writeFloat(salario);
            gravarArq.writeChars(datNascimento);
            gravarArq.writeChars(datIngresso);
            gravarArq.writeChars(cargo);

            arq.close();

            return true;
        }

        else{
            return false;
        }

    }

    public Funcionario lerFuncionario(int matFuncionario) throws IOException {

        FileInputStream arq = new FileInputStream(String.format("C:\\funcionario.dat%d", matFuncionario));
        DataInputStream lerArq = new DataInputStream(arq);
        if(arq.available() > 0) {

            this.nome = lerArq.readUTF();
            this.matricula = lerArq.readInt();
            this.cpf = lerArq.readUTF();
            this.endereco = lerArq.readUTF();
            this.telefone = lerArq.readUTF();
            this.salario = lerArq.readFloat();
            this.datNascimento = lerArq.readUTF();
            this.datIngresso = lerArq.readUTF();
            this.cargo = lerArq.readUTF();

            Date datNasc = new Date(datNascimento);
            Date datIng = new Date(datIngresso);

            Funcionario funcionario = new Funcionario(nome,matricula, cpf,endereco,telefone,salario,datNasc,cargo,datIng);

            arq.close();

            return funcionario;
        }

        return null;


    }

    public boolean alteraDados(String nomeArq, Funcionario funcionario) throws IOException {

        FileOutputStream arq = new FileOutputStream(String.format("C:\\funcionario.dat%d", nomeArq));
        DataOutputStream atualizaArq = new DataOutputStream(arq);

        nome = funcionario.getNome();
        matricula = funcionario.getMatricula();
        cpf = funcionario.getCpf();
        endereco = funcionario.getEndereco();
        telefone = funcionario.getTelefone();
        salario = funcionario.getSalario();
        datNascimento = funcionario.getDatNasci().toString();
        datIngresso = funcionario.getDatIngresso().toString();
        cargo = funcionario.getCargo();


        atualizaArq.writeChars(nome);
        atualizaArq.writeInt(matricula);
        atualizaArq.writeChars(cpf);
        atualizaArq.writeChars(endereco);
        atualizaArq.writeChars(telefone);
        atualizaArq.writeFloat(salario);
        atualizaArq.writeChars(datNascimento);
        atualizaArq.writeChars(datIngresso);
        atualizaArq.writeChars(cargo);

        arq.close();

        return true;



    }



}
