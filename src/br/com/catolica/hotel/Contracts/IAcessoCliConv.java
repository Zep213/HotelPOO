package br.com.catolica.hotel.Contracts;

import br.com.catolica.hotel.Models.Cliente;
import br.com.catolica.hotel.Models.Quarto;

public interface IAcessoCliConv {
    boolean reservar(Quarto quarto, Cliente cli, int numQuarto);
    boolean checkOut(Quarto quarto, Cliente cli,int numQuarto);
}
