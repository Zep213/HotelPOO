package br.com.catolica.hotel.Models;

import br.com.catolica.hotel.Contracts.IAcessoCliConv;
import br.com.catolica.hotel.Enums.EnumTipoCliente;

public class ClienteConv extends Cliente implements IAcessoCliConv {
    Hotel hotel;
    ClienteConv cliente;
    public ClienteConv(String nome, String doc, EnumTipoCliente tipoCliente) {
        super(nome, doc, tipoCliente);
    }
    @Override
    public boolean reservar(Quarto quarto, Cliente cli, int numQuarto) {
        return false;
    }

    @Override
    public boolean checkOut(Quarto quarto, Cliente cli, int numQuarto) {
        hotel.getQuartos(numQuarto);
        if (quarto != null && quarto.isOcupado()) {
            System.out.printf("O chek out do quarto %d foi realizado com sucesso, Cliente %s saiu", numQuarto, cliente.getNome());
        }
        return false;
    }

}
