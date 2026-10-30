package atividade01.model;
public class Produto {

    String produto;
    Double preco;
    Integer estoque;

    public Produto(String produto) {
        this.produto = produto;
    }

    public Produto(String produto, Double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public Produto(String produto, Double preco, Integer estoque) {
        this.produto = produto;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String exibirProduto() {

        if (this.estoque == null) {
            return "Estoque não informado.";
        }

        if (this.estoque == 0) {
            return "Produto esgotado.";
        }

        return "O " + produto + " com valor de " + preco +
               " com " + estoque + " unidades disponíveis.";
    }
}