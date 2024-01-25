import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto("Produto A", 10.0, 50);

        int escolha;

        do {
            System.out.println("Escolha 1 - para Adicionar estoque");
            System.out.println("Escolha 2 - para Vender produtos");
            System.out.println("Escolha 3 - para Exibir estoque");
            System.out.println("Escolha 4 - para Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite a quantidade a ser adicionada ao estoque");
                    int quantidadeAdicionar = scanner.nextInt();
                    produto.adicionarEstoque(quantidadeAdicionar);
                    break;
                case 2 :
                    System.out.println("Digite a quantidade a ser vendida: ");
                    int quantidadeVender = scanner.nextInt();
                    produto.vender(quantidadeVender);
                    break;
                case 3:
                    produto.exibirEstoque();
                    break;
                case 0:
                    System.out.println("Programa encerrado!!!");
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente");
            }
        } while (escolha != 0);
    }
}