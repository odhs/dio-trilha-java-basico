import java.util.Scanner;

// Classe que representa um Pedido:
class Pedido {
    private int id;
    private String cliente;
    private double valorTotal;

    // TODO: Crie o construtor para inicializar os atributos da classe:    
    Pedido(int id, String cliente, double valorTotal){
      this.id = id;
      this.cliente = cliente;
      this.valorTotal = valorTotal;
    }
    

    // TODO: Implemente o método para exibir as informações do pedido formatadas corretamente:
    void exibirPedido(){
      System.out.printf("Pedido #%d - Cliente: %s - Total:R$%.2f\n", id, cliente, valorTotal);
    }
    
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        scanner.nextLine(); 

        String cliente = scanner.nextLine();

        double valorTotal = scanner.nextDouble();

        Pedido pedido = new Pedido(id, cliente, valorTotal);

        pedido.exibirPedido();

        scanner.close();
    }
}