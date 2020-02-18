/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classesDao;

import java.io.*;

/**
 *
 * @author Cleuton
 */
public class LonginCaixaDao {

    public boolean login(int matFuncionario) throws IOException {


        FileInputStream arq = new FileInputStream(String.format("C:\\funcionario.dat%d", matFuncionario));
        DataInputStream lerArq = new DataInputStream(arq);

        int matricula = lerArq.readInt();

        if (matricula == matFuncionario){
            return true;
        }
        else return false;

    }
}
