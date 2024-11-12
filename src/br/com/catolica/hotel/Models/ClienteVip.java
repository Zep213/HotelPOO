package br.com.catolica.hotel.Models;

import br.com.catolica.hotel.Contracts.IAcessoCliConv;
import br.com.catolica.hotel.Contracts.IAcessoCliVip;
import br.com.catolica.hotel.Enums.EnumTipoCliente;

public class ClienteVip extends Cliente implements IAcessoCliVip, IAcessoCliConv {
    Hotel hotel;
    EnumTipoCliente tipoCliente;

    public ClienteVip(String nome, String docVip, EnumTipoCliente tipoCliente) {
        super(nome, docVip, tipoCliente);
    }

    @Override
    public boolean reservar(Quarto quarto, Cliente cli, int numQuarto) {
        hotel.getQuartos(numQuarto);
        if (quarto != null && !quarto.isOcupado()) {
            quarto.setOcupado(cli);
            System.out.printf("O quarto %d foi ocupado por %s", numQuarto, cli.getNome());
        } else {
            System.out.printf("O quarto %d ja esta ocupado ou é invalido", numQuarto);
        }
        return false;
    }
    @Override
    public boolean checkOut(Quarto quarto, Cliente cli, int numQuarto) {
        hotel.getQuartos(numQuarto);
        if (quarto != null && quarto.isOcupado()) {
            System.out.printf("O chek out do quarto %d foi realizado com sucesso, Cliente %s saiu", numQuarto, cli.getNome());
        }
        return false;
    }

    @Override
    public boolean reservaVip(QuartoVip quartoVip, ClienteVip clienteVip, int numQuarto, EnumTipoCliente tipoCliente) {
        hotel.getQuartos(numQuarto);
        if (quartoVip != null && !quartoVip.isOcupadoVip()) {
            quartoVip.setOcupadoVip(clienteVip);
            System.out.printf("O quarto %d foi ocupado por %s", numQuarto, clienteVip.getNome());
        } else {
            System.out.printf("O quarto %d ja esta ocupado ou é invalido", numQuarto);
        }
        return false;
    }
    @Override
    public boolean chekOutVip(QuartoVip quartoVip, ClienteVip clienteVip, int numQuarto, EnumTipoCliente tipoCliente) {
        hotel.getQuartos(numQuarto);
        if (quartoVip != null && quartoVip.isOcupadoVip()) {
            System.out.printf("O chek out do quarto %d foi realizado com sucesso, Cliente %s saiu", numQuarto, clienteVip.getNome());
        }

        return false;
    }
}
