package br.com.catolica.hotel.Models;

import br.com.catolica.hotel.Enums.EnumCargos;

public abstract class Funcionario {
    private String nome;
    private EnumCargos cargo;
    private Data dataContratacao;
    private double salario;

    public Funcionario(String nome, EnumCargos cargo, Data dataContratacao, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public EnumCargos getCargo() {
        return cargo;
    }

    public Data getDataContratacao() {
        return dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }
}
