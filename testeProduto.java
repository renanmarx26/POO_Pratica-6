
public class TesteProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Livro", 30.99, 100);
        Produto produto2 = new Produto("Notebook", 4999.99, 5);

        System.out.println("Detalhes dos produtos antes de ser realizada as operações:");
        imprimirDetalhesProduto(produto1);
        imprimirDetalhesProduto(produto2);

        produto1.adicionarEstoque(5);
        produto2.removerEstoque(2);

        System.out.println("\nDetalhes dos produtos depois de ser realizada as operações:");
        imprimirDetalhesProduto(produto1);
        imprimirDetalhesProduto(produto2);
    }

    private static void imprimirDetalhesProduto(Produto produto) {
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço Unitário do Produto: R$" + produto.getPrecoUnitario());
        System.out.println("Quantidade do Produto em Estoque: " + produto.getQuantidadeEstoque() + "\n");
    }
}
