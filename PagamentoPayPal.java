public class PagamentoPayPal implements Strategy{
    @Override
    public void realizarPagamento() {
        Carrinho carrinho = new Carrinho();
        Float valorCarrinho = carrinho.valorTotal;

        System.out.println("Valor Total: " + valorCarrinho);
        System.out.println("Pagamento com PAYPAL: 5% OFF ");
        System.out.println("Valor Final: " + (valorCarrinho * 0.95));
        
    }
}
