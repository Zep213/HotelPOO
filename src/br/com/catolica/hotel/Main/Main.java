package br.com.catolica.hotel.Main;

import br.com.catolica.hotel.Enums.EnumTipoCliente;
import br.com.catolica.hotel.Models.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static final String USUARIO = "zep";
    private static final String SENHA = "zep123";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean estaVerificado = false;
        ClienteConv[] clientes = new ClienteConv[15];
        ClienteVip[] clientesVips = new ClienteVip[5];
        Funcionario[] funcionarios = new Funcionario[5];
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
                        //sistema de adicionar a lista
                        System.out.println("Cliente cadastrado com Sucesso");
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
                        for (int i = 0; i < clientes.length; i++) {
                            if (clientes[i].getNome() == null) {
                                System.out.println("Quarto Livre!!");
                            }else {
                                System.out.println(clientes[i].getNome());
                            }
                        }
                        System.out.println("--- Clientes Vip's ---");
                        for (int i = 0; i < clientesVips.length; i++) {
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
