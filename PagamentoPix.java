public class PagamentoPix implements Strategy{
    @Override
    public void realizarPagamento() {
        Carrinho carrinho = new Carrinho();
        Float valorCarrinho = carrinho.valorTotal;

        System.out.println("Valor Total: " + valorCarrinho);
        System.out.println("Pagamento com PIX: 15% OFF ");
        System.out.println("Valor Final: " + (valorCarrinho * 0.85));
        
    }
}
