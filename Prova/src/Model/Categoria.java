package model;

public class Categoria {
    private int codCategoria;
    private String nome;

    public Categoria() {
    }

    public Categoria(int codCategoria, String nome) {
        this.codCategoria = codCategoria;
        this.nome = nome;
    }

    public int getCodCategoria() {
        return this.codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Categoria{codCategoria=" + this.codCategoria + ", nome='" + this.nome + "'}";
    }
}