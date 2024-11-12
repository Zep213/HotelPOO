package br.com.catolica.hotel.Models;

public class QuartoVip {
    private int numVip;
    private boolean ocupadoVip;
    private ClienteVip clienteVip;


    public QuartoVip(int numVip, boolean ocupadoVip, ClienteVip clienteVip) {
        this.numVip = numVip;
        this.ocupadoVip = ocupadoVip;
        this.clienteVip = clienteVip;
    }

    public int getNumVip() {
        return numVip;
    }

    public boolean isOcupadoVip() {
        return ocupadoVip;
    }

    public ClienteVip getClienteVip() {
        return clienteVip;
    }

    public void setOcupadoVip(ClienteVip clienteVip) {
        this.clienteVip = clienteVip;
        this.ocupadoVip = (clienteVip != null);
    }
    @Override
    public String toString() {
        return "Quarto " + numVip + " - " + (ocupadoVip ? "Ocupado por " + clienteVip.getNome() : "Disponível");
    }
}
