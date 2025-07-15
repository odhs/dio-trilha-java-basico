public class Main {
  public static void main(String[] args) {
    iPhone meuIPhone = new iPhone();

    // Funcionalidades de Reprodutor Musical
    meuIPhone.tocar();
    meuIPhone.selecionarMusica("Imagine - John Lennon");

    // Funcionalidades de Aparelho Telefônico
    meuIPhone.ligar("123456789");
    meuIPhone.atender();

    // Funcionalidades de Navegador de Internet
    meuIPhone.exibirPagina("https://www.example.com");
    meuIPhone.adicionarNovaAba();
  }
}