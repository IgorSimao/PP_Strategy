import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Context context = new Context(new PagamentoCartaoDebito());

        System.out.println("Selecione a forma de pagamento:");
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("MENU");
            System.out.println("1. Pagamento Cartão Débito");
            System.out.println("2. Pagamento PayPal");
            System.out.println("3. Pagamento Cartão Crédito");
            System.out.println("4. Pagamento Pix");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção 1 - Pagamento Cartão Débito.");
                    context.setStrategy(new PagamentoCartaoDebito());
                    context.executarPagamento();
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2 - Pagamento PayPal");
                    context.setStrategy(new PagamentoPayPal());
                    context.executarPagamento();
                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3 - Pagamento Cartão Crédito");
                    context.setStrategy(new PagamentoCartaoParcelado());
                    context.executarPagamento();
                    break;
                case 4:
                    System.out.println("Você escolheu a Opção 4 - Pagamento Pix");
                    context.setStrategy(new PagamentoPix());
                    context.executarPagamento();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma opção válida.");
                    break;
            }
            
            System.out.println();
        } while (opcao != 0);
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

