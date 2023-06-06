public class PagamentoCartaoParcelado implements Strategy{

    @Override
    public void realizarPagamento() {
        Carrinho carrinho = new Carrinho();
        Float valorCarrinho = carrinho.valorTotal;

        System.out.println("Valor Total: " + valorCarrinho);
        System.out.println("Pagamento com cartão Parcelado: 5% de Juro");
        System.out.println("Valor Final: " + (valorCarrinho * 1.05));
        
    }
}
