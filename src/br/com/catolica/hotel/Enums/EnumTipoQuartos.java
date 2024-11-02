package br.com.catolica.hotel.Enums;

public enum EnumTipoQuartos {
    VIP(1),
    CONVENCIONAL(2);

    int valor;
    EnumTipoQuartos(int valor){
        this.valor = valor;
    }
}
