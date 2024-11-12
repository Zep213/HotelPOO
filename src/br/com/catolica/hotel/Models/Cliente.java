package br.com.catolica.hotel.Models;

import br.com.catolica.hotel.Enums.EnumTipoCliente;

public abstract class Cliente {
    private String nome;
    private String senha;
    private EnumTipoCliente tipoCliente;

    public Cliente(String nome, String senha, EnumTipoCliente tipoCliente) {
        this.nome = nome;
        this.senha = senha;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getDoc() {
        return senha;
    }

    public EnumTipoCliente getTipoCliente() {
        return tipoCliente;
    }


}
