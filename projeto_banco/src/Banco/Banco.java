package Banco;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Cliente> idades = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    public void add() {
        Cliente c = new Cliente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do cliente!");
        c.setNome(sc.nextLine());
        System.out.println("Insira a idade do cliente!");
        c.setIdade(sc.nextInt());
        this.clientes.add(c);
    }

    public void remove(String cliente) {
        this.clientes.remove(cliente);
    }

    public void update(int index, Cliente novoCliente) {
        if (index != -1) {
            this.clientes.set(index, novoCliente);
        }
    }

    public void listar() {
        System.out.println("Clientes cadastrados: ");
        for (Cliente cliente : this.clientes) {
            System.out.println(this.clientes.indexOf(cliente) +"  "+ cliente.getNome());
            //System.out.println(cliente);
        }
    }

    public Cliente verCliente(int posicao) {
        return this.clientes.get(posicao);
    }

    /* public void ordenar() {
        java.util.Collections.sort(this.cliente);
    }
     */
}
