package br.com.catolica.hotel.Enums;

public enum EnumCargos {
    GERENTE(1),
    RECEPCIONISTA(2);

    int valor;
    EnumCargos(int valor){
        this.valor = valor;
    }
}
