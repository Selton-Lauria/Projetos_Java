package Lista_Tarefas;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Tarefa tarefa = new Tarefa();
        int op = 0;
        do {
            System.out.println("\n==================CADASTRO DE TAREFAS==================");
            System.out.println("1 - Inserir Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Alterar Tarefa");
            System.out.println("4 - Excluir Tarefa ");
            System.out.println("0 - Sair\n");
            System.out.print("Escolha uma Opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n--- Inserindo Tarefa ---");
                    tarefa.inserirTarefa();
                    break;
                case 2:
                    System.out.println("\n--- Listando Tarefas ---");
                    tarefa.listar();
                    break;
                case 3:
                    System.out.println("\n--- Alterando Tarefas ---");
                    System.out.println("Digite a tarefa que deseja alterar: ");
                    String velhatar = sc2.nextLine();
                    System.out.println("Digite a nova tarefa a ser feita em seu lugar: ");
                    String novaTar = sc2.nextLine();
                    tarefa.alterarTarefa(velhatar, novaTar);
                    break;
                case 4:
                    System.out.println("\n--- Removendo Tarefa ---");
                    System.out.println("Digite a tarefa que deseja remover: ");
                    String remove = sc2.nextLine();
                    tarefa.excluirTarefa(remove);
                    break;
                case 0:
                    System.out.println("\nEncerrando Programa...");
                    break;
                default:
                    System.out.println("\nPor favor, Digite um número válido!!");
            }
        } while (op != 0);
        sc.close();
        sc2.close();
    }
}

