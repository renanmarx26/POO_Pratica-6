
public class TesteProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Computador", 5999.99, 50);
        Produto produto2 = new Produto("Televisão", 3999.99, 20);

        System.out.println("Detalhes dos produtos antes de ser realizada as operações:");
        imprimirDetalhesProduto(produto1);
        imprimirDetalhesProduto(produto2);

        produto1.adicionarEstoque(10);
        produto2.removerEstoque(7);

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
