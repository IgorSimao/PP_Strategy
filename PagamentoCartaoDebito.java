

public class PagamentoCartaoDebito implements Strategy{

    @Override
    public void realizarPagamento() {
        Carrinho carrinho = new Carrinho();
        Float valorCarrinho = carrinho.valorTotal;

        System.out.println("Valor Total: " + valorCarrinho);
        System.out.println("Pagamento com cartão débito: 10% OFF ");
        System.out.println("Valor Final: " + (valorCarrinho * 0.90));
        
    }
    
}
