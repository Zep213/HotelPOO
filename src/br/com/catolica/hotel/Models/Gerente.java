package br.com.catolica.hotel.Models;

import br.com.catolica.hotel.Contracts.IAcessoADM;
import br.com.catolica.hotel.Enums.EnumCargos;

public class Gerente extends Funcionario implements IAcessoADM {

    Funcionario[] funcionarios;

    public Gerente(String nome, EnumCargos cargo, Data dataContratacao, double salario) {
        super(nome, cargo, dataContratacao, salario);
    }

    @Override
    public boolean contratar(Funcionario func) {
        for(int i = 0; i < funcionarios.length;i++){
            if(funcionarios[i] == null){
                funcionarios[i] = func;
                System.out.println("Contrataçao realizada com sucesso!");
                return true;
            }else {
                System.out.println("Nao foi possivel realizar a contrataçao");
            }

        }
        return false;
    }

    @Override
    public boolean demitir(Funcionario func) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == func){
                funcionarios[i] = null;
                System.out.println("Funcionario demitido!!");
                return true;
            }else {
                System.out.println("Não foi possivel realizar a demiçao!");
                return false;
            }

        }

        return false;
    }
}
