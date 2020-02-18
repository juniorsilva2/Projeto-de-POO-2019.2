package classesDao;

import models.Cliente;
import java.io.*;
import java.util.Date;

/**
 *
 * @author Cleuton
 */


    public class ClienteDao  {


        String nome;
        int codCliente;
        String cpf;
        String endereco;
        String telefone1;
        String telefone2;
        float totalVendido;
        String datPagamento;




        public boolean addCliente(Cliente cliente) throws IOException {

            File arqCliente;
            arqCliente = new File(String.format("C:\\cliente%d.dat", cliente.getCpf()));

            if(arqCliente.exists()) {

                FileOutputStream arq = new FileOutputStream(String.format("C:\\cliente%d.dat", cliente.getCpf()));
                DataOutputStream gravarArq = new DataOutputStream(arq);

                this.nome = cliente.getNome();
                this.codCliente = cliente.getCodCliente();
                this.cpf = cliente.getCpf();
                this.datPagamento = cliente.getDatPagamento().toString();
                this.telefone1 = cliente.getTelefone();
                this.telefone2 = cliente.getTelefone2();
                this.totalVendido = cliente.getTotalVendido();
                this.endereco = cliente.getEndereco();


                gravarArq.writeChars(nome);
                gravarArq.writeInt(codCliente);
                gravarArq.writeChars(cpf);
                gravarArq.writeChars(endereco);
                gravarArq.writeChars(telefone1);
                gravarArq.writeChars(telefone2);
                gravarArq.writeFloat(totalVendido);
                gravarArq.writeChars(datPagamento);

                arq.close();

                return true;
            }

            else{
                return false;
            }

        }

        public Cliente lerCliente(int matFuncionario) throws IOException {

            FileInputStream arq = new FileInputStream(String.format("C:\\funcionario%d.dat", matFuncionario));
            DataInputStream lerArq = new DataInputStream(arq);
            if(arq.available() > 0) {

                this.nome = lerArq.readUTF();
                this.codCliente = lerArq.readInt();
                this.cpf = lerArq.readUTF();
                this.endereco = lerArq.readUTF();
                this.telefone1 = lerArq.readUTF();
                this.telefone2 = lerArq.readUTF();
                this.totalVendido = lerArq.readFloat();
                this.datPagamento = lerArq.readUTF();


                Date datPag = new Date(datPagamento);



                Cliente cliente = new Cliente(codCliente,nome,cpf,totalVendido,endereco, telefone1,telefone2,datPag);

                arq.close();

                return cliente;
            }

            return null;


        }

        public boolean alteraDados(String nome, String endereco, String telefone1, String telefone2,String datPagamento) throws IOException {

            FileOutputStream arq = new FileOutputStream(String.format("C:\\funcionario%d.dat", cpf));
            DataOutputStream atualizaArq = new DataOutputStream(arq);

            this.nome = nome;
            this.endereco = endereco;
            this.telefone1 = telefone1;
            this.telefone2 = telefone2;
            this.datPagamento = datPagamento;

            atualizaArq.writeChars(nome);
            atualizaArq.writeChars(endereco);
            atualizaArq.writeChars(telefone1);
            atualizaArq.writeChars(telefone2);
            atualizaArq.writeChars(datPagamento);


            arq.close();

            return true;



        }

}
