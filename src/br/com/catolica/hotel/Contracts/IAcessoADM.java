package br.com.catolica.hotel.Contracts;

import br.com.catolica.hotel.Models.Funcionario;

public interface IAcessoADM {
    boolean contratar(Funcionario func);
    boolean demitir(Funcionario func);
}
