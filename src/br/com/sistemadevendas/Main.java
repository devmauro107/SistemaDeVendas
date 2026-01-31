package br.com.sistemadevendas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClienteDAO clienteDAO = new ClienteDAO();

        int opcao;
            do {
                System.out.println("\n ====== MENU CLIENTE ======");
                System.out.println("[1] - Cadastro Cliente");
                System.out.println("[2] - Listar Clientes");
                System.out.println("[3] - Atualizar Cliente");
                System.out.println("[4] - Remover Cliente");
                System.out.println("[0] - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("ID: ");
                            int id = sc.nextInt();
                                sc.nextLine();
                        System.out.println("Nome: ");
                            String nome = sc.nextLine();
                        System.out.println("E-mail: ");
                            String email = sc.next();
                                clienteDAO.create(new Cliente(id, nome, email));
                                    break;
                    case 2:
                        clienteDAO.read();
                            break;
                    case 3:
                        System.out.println("ID do cliente: ");
                            int idUpdate = sc.nextInt();
                                sc.nextLine();
                        System.out.println("Novo nome: ");
                            String novoNome = sc.nextLine();
                        System.out.println("Novo e-mail: ");
                            String novoEmail = sc.nextLine();
                                clienteDAO.update(idUpdate, novoNome, novoEmail);
                                    break;
                    case 4:
                        System.out.println("ID do cliente: ");
                            int idCliente = sc.nextInt();
                                clienteDAO.delete(idCliente);
                                    break;
                    case 0:
                        System.out.println("Finalizando...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);
            sc.close();
    }
}
