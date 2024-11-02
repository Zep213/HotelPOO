package br.com.catolica.hotel.Models;

public class QuartoConv {
    private int num;
    private boolean ocupado;
    private Cliente cliente;

    public QuartoConv(int num, boolean ocupado, Cliente cliente) {
        this.num = num;
        this.ocupado = false;
        this.cliente = null;
    }

    public int getNum() {
        return num;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setOcupado(Cliente cliente) {
        this.cliente = cliente;
        this.ocupado = (cliente != null);
    }
    @Override
    public String toString() {
        return "Quarto " + num + " - " + (ocupado ? "Ocupado por " + cliente.getNome() : "Disponível");
    }
}
