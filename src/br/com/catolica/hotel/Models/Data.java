package br.com.catolica.hotel.Models;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("Data: %d/%d/%d",dia,mes,ano);
    }
}