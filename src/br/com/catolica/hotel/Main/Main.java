package br.com.catolica.hotel.Main;

import br.com.catolica.hotel.Enums.EnumCargos;
import br.com.catolica.hotel.Enums.EnumTipoCliente;
import br.com.catolica.hotel.Enums.EnumTipoQuartos;
import br.com.catolica.hotel.Models.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static final String USUARIO = "zep";
    private static final String SENHA = "zep123";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean estaVerificado = false;
        ClienteConv[] clientes = new ClienteConv[6];
        ClienteVip[] clientesVips = new ClienteVip[6];
        QuartoConv[] quartoConvs = new QuartoConv[6];
        QuartoVip[] quartoVips = new QuartoVip[6];
        Recepcionista[] recepcionistas = new Recepcionista[6];
        Hotel hotel = new Hotel("Hotel transilvania","633424",quartoConvs,quartoVips);
        
        while (true) {
            if (!estaVerificado){
                System.out.println("\n--- Tela de Login ---");
                System.out.print("Usuário: ");
                String usuario = input.nextLine();
                System.out.print("Senha: ");
                String senha = input.nextLine();
                if (usuario.equals(USUARIO) && senha.equals(SENHA)){
                    estaVerificado = true;
                    System.out.println("Loguin realizado com sucesso!!");
                }else {
                    System.out.println("Usuario ou senha incorretos, tente novamente");
                }
            }else {
                for (int i = 0; i < quartoConvs.length; i++) {
                    if (quartoConvs[i] == null){
                        quartoConvs[i] = new QuartoConv(i, false,null);
                        System.out.println(quartoConvs[i]);
                    }
                }
                for (int i = 0; i < quartoVips.length; i++) {
                    if (quartoVips[i] == null){
                        quartoVips[i] = new QuartoVip(i, false,null);
                        System.out.println(quartoConvs[i]);
                    }
                }

                System.out.println("\n--- Menu ADM ---");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("2. Cadastrar ClienteVip");
                System.out.println("3. Mostrar Clientes");
                System.out.println("4. Contratar Funcionario");
                System.out.println("5. Mostrar Funcionarios");
                System.out.println("0. sair");
                System.out.print("Escolha uma opçao: ");
                int opcao = input.nextInt();;

                switch (opcao) {

                    case 1:
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
                        for (int i = 0; i < clientes.length; i++) {
                            if(clientes[i] == null) {
                                clientes[i] = new ClienteConv(nome, doc, EnumTipoCliente.CONVENCIONAL);
                                System.out.println("cliente cadastrado com sucesso");
                                break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("--- Cadastrar Clientes Vip's ---");
                        System.out.print("Digite seu nome:");
                        String nomeVip = input.next();
                        System.out.print("Digite seu documento: ");
                        String docVip = input.next();
                        for (int i = 0; i < clientes.length; i++) {
                            if(clientes[i] == null) {
                                clientes[i] = new ClienteConv(nomeVip, docVip, EnumTipoCliente.VIP);
                                System.out.println("cliente cadastrado com sucesso");
                                break;
                            }
                        }

                        System.out.println("Cliente Vip cadastrado com sucesso!!");
                        break;
                    case 3:
                        System.out.println("--- Clientes Convencionais ---");
                        for (int i = 0; i < clientes.length; i++) {
                            if (clientes[i] == null) {
                                System.out.println("espaço livre!!");
                            }else {
                                System.out.println(clientes[i].getNome());
                            }
                        }
                        System.out.println("--- Clientes Vip's ---");
                        for (int i = 0; i < clientesVips.length; i++) {
                            if (clientesVips[i] == null) {
                                System.out.println("espaço Livre!!");
                            }else {
                                System.out.println("quarto ocupado por " + clientesVips[i].getNome());
                            }
                        }
                        break;
                    case 4:
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
                        for (int i = 0; i < recepcionistas.length; i++) {
                            if (recepcionistas[i] == null){
                                recepcionistas[i] = new Recepcionista(nomefunc,EnumCargos.RECEPCIONISTA,dataContract,salario,hotel);
                                System.out.println("Funcionario contratado com sucesso!!");
                                break;
                            }

                        }


                    case 5:
                        System.out.println("--- Mostrar Funcionarios ---");
                        for (int i = 0; i < recepcionistas.length; i++) {
                            if (recepcionistas[i] == null) {
                                System.out.println("espaço Livre!!");
                            }else {
                                System.out.println(recepcionistas[i].getNome());
                            }
                        }
                        break;

                }

            }



        }

    }
}
