
public class Produto {
    private String nome;
    private double precoUnitario;
    private int quantidadeEstoque;
    public Produto(String nome, double precoUnitario, int quantidadeEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidadeEstoque >= quantidade)
            quantidadeEstoque -= quantidade;
        else
            System.out.println("Quantidade insuficiente no estoque.");
    }
}
