import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    // Criar um objeto Scanner para capturar os dados do usuário
    Scanner scanner = new Scanner(System.in);

    // Solicitar e capturar os dados do usuário
    System.out.println("Por favor, digite o número da Agência:");
    String agencia = scanner.nextLine();

    System.out.println("Por favor, digite o número da Conta:");
    String numero = scanner.nextLine();

    System.out.println("Por favor, digite o Nome do Cliente:");
    String nomeCliente = scanner.nextLine();

    // double pode causar imprecisão se no valor for usado em computações
    // financeiras, o mais recomendado é usar BigDecimal para valores monetários
    System.out.println("Por favor, digite o Saldo (Use . para separar os centavos):");
    BigDecimal saldo = new BigDecimal(scanner.nextLine());

    // Exibir a mensagem com os dados fornecidos
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    // Fechar o scanner
    scanner.close();
  }
}
