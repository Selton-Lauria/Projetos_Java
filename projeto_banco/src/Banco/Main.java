package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n===========================");
            System.out.println("      MENU DO BANCO        ");
            System.out.println("===========================");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Ver Cliente Específico");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");


            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

            } else {
                System.out.println("Por favor, digite um número válido!");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastrar Cliente ---");
                    banco.add();
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Clientes ---");
                    banco.listar();
                    break;

                case 3:
                    System.out.println("\n--- Ver Cliente ---");
                    System.out.print("Digite o índice/posição do cliente: ");
                    if (scanner.hasNextInt()) {
                        int pos = scanner.nextInt();
                        scanner.nextLine();

                        try {
                            Cliente resultado = banco.verCliente(pos);
                            System.out.println(resultado.getNome());
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Erro: Não existe cliente cadastrado nessa posição!");
                        }
                    } else {
                        System.out.println("Posição inválida!");
                        scanner.nextLine();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}