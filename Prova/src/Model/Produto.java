package model;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;

    public Produto() {
    }

    public Produto(int codigo, String nome, double preco, int quantidade, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void entradaEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public void saidaEstoque(int qtd) {
        this.quantidade -= qtd;
    }

    public int getSaldo() {
        return this.quantidade;
    }

    public String toString() {
        return "Produto{codigo=" + this.codigo + ", nome='" + this.nome + "', preco=" + this.preco + ", quantidade=" + this.quantidade + ", categoria=" + this.categoria + "}";
    }
}