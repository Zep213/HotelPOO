package br.com.catolica.hotel.Enums;

public enum EnumTipoCliente {
    VIP(1),
    CONVENCIONAL(2);

    int valor;
    EnumTipoCliente(int valor){
        this.valor = valor;
    }
}
