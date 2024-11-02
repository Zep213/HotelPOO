package br.com.catolica.hotel.Models;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String cep;
    private Quarto[] quartos;
    private QuartoVip[] quartosVips;

    public Hotel(String nome, String cep, Quarto[] quartos) {
        this.nome = nome;
        this.cep = cep;
        this.quartos = quartos;
    }

    public String getNome() {
        return nome;
    }

    public String getCep() {
        return cep;
    }

    public Quarto[] getQuartos(int numeroQuarto) {
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] == quartos[numeroQuarto]) {
                return getQuartos(numeroQuarto - 1);
            }else {
                System.out.println("Quarto nao encontrado ou nao existente!");
                return null;
            }
        }
        return null;
    }
    public void exibirStatusQuartos() {
        System.out.println("Status dos quartos:");
        for (int i = 0; i < quartos.length; i++) {
            System.out.println(quartos);

        }
    }
    public Quarto[] getQuartosVip(int numVip) {
        for (int i = 0; i < quartosVips.length; i++) {
            if (quartosVips[i] == quartosVips[numVip]) {
                return getQuartos(numVip - 1);
            }else {
                System.out.println("Quarto nao encontrado ou nao existente!");
                return null;
            }
        }
        return null;
    }
    public void exibirStatusQuartosVips() {
        System.out.println("Status dos quartos:");
        for (int i = 0; i < quartosVips.length; i++) {
            System.out.println(quartosVips);

        }
    }
}