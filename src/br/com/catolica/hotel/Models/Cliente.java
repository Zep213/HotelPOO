package br.com.catolica.hotel.Models;

import br.com.catolica.hotel.Enums.EnumTipoCliente;

public abstract class Cliente {
    private String nome;
    private String doc;
    private EnumTipoCliente tipoCliente;

    public Cliente(String nome, String doc, EnumTipoCliente tipoCliente) {
        this.nome = nome;
        this.doc = doc;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getDoc() {
        return doc;
    }

    public EnumTipoCliente getTipoCliente() {
        return tipoCliente;
    }


}
