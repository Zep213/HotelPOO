package br.com.catolica.hotel.Contracts;

import br.com.catolica.hotel.Enums.EnumTipoCliente;
import br.com.catolica.hotel.Models.Cliente;
import br.com.catolica.hotel.Models.ClienteVip;
import br.com.catolica.hotel.Models.Quarto;
import br.com.catolica.hotel.Models.QuartoVip;

public interface IAcessoCliVip {
    boolean reservaVip(QuartoVip quartoVip, ClienteVip clienteVip, int numVip, EnumTipoCliente tipoCliente);
    boolean chekOutVip(QuartoVip quartoVip, ClienteVip clienteVip,int numVip,EnumTipoCliente tipoCliente);
}
