package Lista_Tarefas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
    private List<String> tarefas = new ArrayList<>();
    private List<String> descricao = new ArrayList<>();

    public void inserirTarefa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a tarefa a ser feita");
        String tar = sc.nextLine();
        int index = tarefas.indexOf(tar);
        if (index != -1) {
            System.out.println("Tarefa ja existe, Não válido!!!");
        } else {
            tarefas.add(String.valueOf(tar));
            System.out.println("Insira a descrição dela: ");
            String desc = sc.nextLine();
            descricao.add(String.valueOf(desc));
            System.out.println("Tarefa adicionada!!!");
        }
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa foi inserida ainda!!!");
        } else {
            System.out.println("Tarefas Inseridas e Suas descrições!!!");
            String max = tarefas.getLast();
            int indexMax = tarefas.indexOf(max);
            for (int i = 0; i <= indexMax; i++) {
                System.out.printf("-> A tarefa '%s' consiste em %s\n", tarefas.get(i), descricao.get(i));
            }
        }
    }

    public void alterarTarefa(String velhaTarefa,String novaTarefa) {
        if (tarefas.contains(velhaTarefa)) {
            Scanner sc2 = new Scanner(System.in);
            int index = tarefas.indexOf(velhaTarefa);
            this.tarefas.set(index, novaTarefa);
            System.out.println("Qual será a descrição dessa tarefa? ");
            String desc = sc2.nextLine();
            this.descricao.set(index, desc);
            System.out.println("Lista alterada!!!");

        } else {
            System.out.println("O elemento não existe, Não pode ser alterado!!");
        }
    }

    public void excluirTarefa(String remover) {
        if (tarefas.contains(remover)) {
            int indexDesc = tarefas.indexOf(remover);
            tarefas.remove(remover);
            String desc = descricao.get(indexDesc);
            descricao.remove(desc);
            System.out.println("Elemento Removido!!");
        } else {
            System.out.println("Elemento não existe, não pode ser removido");
        }

    }
}
