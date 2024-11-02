package br.com.catolica.hotel.Models;

import br.com.catolica.hotel.Contracts.IAcessoRecep;
import br.com.catolica.hotel.Enums.EnumCargos;
import br.com.catolica.hotel.Enums.EnumTipoCliente;

public class Recepcionista extends Funcionario implements IAcessoRecep {
    Hotel hotel;
    Quarto[] quartos;
    Cliente cliente;

    public Recepcionista(String nome, EnumCargos cargo, Data dataContratacao, double salario, Hotel hotel) {
        super(nome, cargo, dataContratacao, salario);
        this.hotel = hotel;
    }

    @Override
    public boolean checkIn(Quarto quarto, Cliente cli, int numQuarto) {
        hotel.getQuartos(numQuarto);
        if (quarto != null && !quarto.isOcupado()) {
            quarto.setOcupado(cliente);
            System.out.printf("O quarto %d foi ocupado por %s", numQuarto, cliente.getNome());
        } else {
            System.out.printf("O quarto %d ja esta ocupado ou é invalido", numQuarto);
        }
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

    @Override
    public boolean reservaVip(QuartoVip quartoVip, ClienteVip clienteVip, int numVip, EnumTipoCliente tipoCliente) {
            hotel.getQuartos(numVip);
            if (quartoVip != null && !quartoVip.isOcupadoVip()) {
                quartoVip.isOcupadoVip(clienteVip);
                System.out.printf("O quarto %d foi ocupado por %s", numVip, clienteVip.getNome());
            } else {
                System.out.printf("O quarto %d ja esta ocupado ou é invalido", numVip);
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
