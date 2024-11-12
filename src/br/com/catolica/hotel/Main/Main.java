package br.com.catolica.hotel.Main;

import br.com.catolica.hotel.Enums.EnumCargos;
import br.com.catolica.hotel.Enums.EnumTipoCliente;
import br.com.catolica.hotel.Enums.EnumTipoQuartos;
import br.com.catolica.hotel.Models.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean estaVerificado = false;
        ClienteConv[] clientes = new ClienteConv[6];
        ClienteVip[] clientesVips = new ClienteVip[6];
        QuartoConv[] quartoConvs = new QuartoConv[6];
        QuartoVip[] quartoVips = new QuartoVip[6];
        Recepcionista[] recepcionistas = new Recepcionista[6];
        Hotel hotel = new Hotel("Hotel transilvania","633424",quartoConvs,quartoVips);

        System.out.println("--- Quartos Convencionais ---");
        for (int i = 1; i < quartoConvs.length; i++) {
            if (quartoConvs[i] == null){
                quartoConvs[i] = new QuartoConv(i, false,null);
                System.out.println(quartoConvs[i]);
            }
        }
        System.out.println("--- Quartos Vips ---");
        for (int i = 1; i < quartoVips.length; i++) {
            if (quartoVips[i] == null){
                quartoVips[i] = new QuartoVip(i, false,null);
                System.out.println(quartoVips[i]);
            }
        }
        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar ClienteVip");
            System.out.println("3. Mostrar Clientes");
            System.out.println("4. Contratar Funcionario");
            System.out.println("5. Mostrar Funcionarios");
            System.out.println("6. Mostrar Quartos");
            System.out.println("0. sair");
            System.out.print("Escolha uma opçao: ");
            String  opcao = input.next();;

            switch (opcao) {

                case "1":
                    System.out.println("--- Cadastrar Clientes ---");
                    System.out.print("Digite seu nome: ");
                    String nome = input.next();
                    if (nome.length() < 2) {
                        System.out.println("digite um nome valido!");
                        break;
                    }
                    System.out.print("Digite seu documento: ");
                    String doc = input.next();
                    if (doc.length() < 3) {
                        System.out.println("digite um documento valido");
                        break;
                    }
                    for (int i = 1; i < clientes.length; i++) {
                        if(clientes[i] == null){
                            clientes[i] = new ClienteConv(nome, doc, EnumTipoCliente.CONVENCIONAL);
                            quartoConvs[i].setOcupado(new ClienteConv(nome,doc,EnumTipoCliente.CONVENCIONAL));
                            System.out.println("cliente cadastrado com sucesso");
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("--- Cadastrar Clientes Vip's ---");
                    System.out.print("Digite seu nome:");
                    String nomeVip = input.next();
                    if (nomeVip.length() < 2){
                        System.out.println("Erro! Digite um nome valido");
                        break;
                    }
                    System.out.print("Digite seu documento: ");
                    String docVip = input.next();
                    if (docVip.length() < 3){
                        System.out.println("Erro digite um documento valido!");
                        break;
                    }
                    for (int i = 1; i < clientesVips.length; i++) {
                        if(clientesVips[i] == null) {
                            clientesVips[i] = new ClienteVip(nomeVip, docVip, EnumTipoCliente.VIP);
                            quartoVips[i].setOcupadoVip(new ClienteVip(nomeVip,docVip,EnumTipoCliente.VIP));
                            System.out.println("cliente cadastrado com sucesso");
                            break;
                        }
                    }

                    System.out.println("Cliente Vip cadastrado com sucesso!!");
                    break;
                case "3":
                    System.out.println("--- Clientes Convencionais ---");
                    for (int i = 1; i < clientes.length; i++) {
                        if (clientes[i] == null) {
                            System.out.println("espaço livre!!");
                        }else {
                            System.out.println(clientes[i].getNome());
                        }
                    }
                    System.out.println("--- Clientes Vip's ---");
                    for (int i = 1; i < clientesVips.length; i++) {
                        if (clientesVips[i] == null) {
                            System.out.println("espaço Livre!!");
                        }else {
                            System.out.println(clientesVips[i].getNome());
                        }
                    }
                    break;
                case "4":
                    System.out.println("--- Cadastrar Recepcionista ---");
                    System.out.print("Digite seu nome: ");
                    String nomefunc = input.nextLine();
                    System.out.print("Salario: ");
                    int salario = input.nextInt();
                    System.out.print("Dia: ");
                    int dia = input.nextInt();
                    System.out.print("Mes: ");
                    int mes = input.nextInt();
                    System.out.print("Ano: ");
                    int ano = input.nextInt();
                    Data dataContract = new Data(dia,mes,ano);
                    for (int i = 1; i < recepcionistas.length; i++) {
                        if (recepcionistas[i] == null){
                            recepcionistas[i] = new Recepcionista(nomefunc,EnumCargos.RECEPCIONISTA,dataContract,salario,hotel);
                            System.out.println("Funcionario contratado com sucesso!!");
                            break;
                        }

                    }


                case "5":
                    System.out.println("--- Mostrar Funcionarios ---");
                    for (int i = 1; i < recepcionistas.length; i++) {
                        if (recepcionistas[i] == null) {
                            System.out.println("espaço Livre!!");
                        }else {
                            System.out.println(recepcionistas[i].getNome());
                        }
                    }
                    break;
                case "6":
                    System.out.println("--- Mostrar Quartos ---");
                    for (int i = 1; i < quartoConvs.length; i++) {
                        System.out.println(quartoConvs[i]);
                    }
                    for (int i = 1; i < quartoVips.length; i++) {
                        System.out.println(quartoVips[i]);

                    }
                    break;

                case "0":
                    System.out.println("fechando o brograma...");
                    return;
                default:
                    System.out.println("Digite uma opcao valida!!");
            }

        }

    }
}
