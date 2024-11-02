package br.com.catolica.hotel.Contracts;

import br.com.catolica.hotel.Enums.EnumTipoCliente;
import br.com.catolica.hotel.Models.*;

public interface IAcessoRecep {
    boolean checkIn(Quarto quarto, Cliente cli,int numQuarto);
    boolean checkOut(Quarto quarto, Cliente cli,int numQuarto);
    boolean reservaVip(QuartoVip quartoVip, ClienteVip clienteVip, int numVip, EnumTipoCliente tipoCliente);
    boolean chekOutVip(QuartoVip quartoVip, ClienteVip clienteVip,int numVip,EnumTipoCliente tipoCliente);
}
