package br.com.catolica.hotel.Main;

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
        Funcionario[] funcionarios = new Funcionario[6];
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
                for (int i = 1; i < quartoConvs.length; i++) {
                    if (quartoConvs[i] == null){
                        quartoConvs[i] = new QuartoConv(i, false,null);
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

                switch (opcao){

                    case 1:
                        System.out.print("Quantos Clientes deseja cadastrar? ");
                        int qntdCli = input.nextInt();
                        for (int c = 0; c < qntdCli; c++) {
                            System.out.println("--- Cadastrar Clientes ---");
                            System.out.print("Digite seu nome: ");
                            String nome = input.next();
                            if (nome.length() < 2){
                                System.out.println("digite um nome valido!");
                                break;
                            }
                            System.out.print("Digite seu documento: ");
                            String doc = input.next();
                            if (doc.length() < 3) {
                                System.out.println("digite um documento valido");
                                break;
                            }

                            clientes[c] = new ClienteConv(nome,doc,EnumTipoCliente.CONVENCIONAL);
                            System.out.print("em qual quarto deseja se hospedar? ");
                            int numQuarto = input.nextInt();
                            for (int i = 1; i < quartoConvs.length; i++) {
                                if (numQuarto > 0 && numQuarto == quartoConvs[i].getNum()){
                                    quartoConvs[numQuarto] = new QuartoConv(numQuarto,true,new ClienteConv(nome,doc,EnumTipoCliente.CONVENCIONAL));
                                }
                            }
                            System.out.println("Cliente cadastrado com Sucesso");
                            break;
                        }
                        break;

                    case 2:
                        System.out.println("--- Cadastrar Clientes Vip's ---");
                        System.out.print("Digite seu nome:");
                        String nomeVip = input.next();
                        System.out.print("Digite seu documento: ");
                        String docVip = input.next();
                        //sistema de adicionar a lista
                        System.out.println("Cliente Vip cadastrado com sucesso!!");
                        break;
                    case 3:
                        System.out.println("--- Clientes Convencionais ---");
                        for (int i = 1; i < clientes.length; i++) {
                            if (clientes[i] == null) {
                                System.out.println("Quarto Livre!!");
                            }else {
                                System.out.println(quartoConvs[i].toString());
                            }
                        }
                        System.out.println("--- Clientes Vip's ---");
                        for (int i = 1; i < clientesVips.length; i++) {
                            if (clientesVips[i] == null) {
                                System.out.println("Quarto Livre!!");
                            }else {
                                System.out.println(clientesVips[i].getNome());
                            }
                        }
                        break;
                    case 4:
                        System.out.println("--- Cadastrar Funcionarios ---");
                        System.out.println("Digite seu nome: ");
                        String nomeFunc = input.nextLine();
                        System.out.println("Digite a data da contrataçao: ");
                        break;
                }

            }



        }

    }
}
