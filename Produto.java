import java.util.Scanner;

public class Produto{
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public void adicionarEstoque(int quantidade){
        quantidadeEmEstoque += quantidade;
        System.out.println("Estoque adicionado. Exitem " + quantidade);
    }
    public void vender(int quantidade){
        if (quantidade <= quantidadeEmEstoque){
            quantidadeEmEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso" + quantidade);
        }else {
            System.out.println("Estoque insuficiente para realizar a venda");
        }
    }
    public void exibirEstoque() {
        System.out.println("Estoque atual: " + quantidadeEmEstoque + " unidades.");
    }
}