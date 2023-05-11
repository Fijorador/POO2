import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws MinhaEx.CorrigirValorIntException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Menu:");
            System.out.println("1. Casquinha");
            System.out.println("2. Cascao");
            System.out.println("3. Sunday");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            Leitura leitura = new Leitura();
            int opcao = leitura.lerInteiro();

            switch (opcao) {
                case 1:
                    Casquinha casquinha = Leitura.criarCasquinha();
                    perguntarEntrega(casquinha, leitura);
                    break;
                case 2:
                    Cascao cascao = Leitura.criarCascao();
                    perguntarEntrega(cascao, leitura);
                    break;
                case 3:
                    Sundae sundae = Leitura.criarSundae();
                    perguntarEntrega(sundae, leitura);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    throw new MinhaEx.CorrigirValorIntException("Opção inválida. Saindo.", opcao);
            }
        } finally {
            scanner.close();
        }
    }

    public static void perguntarEntrega(Entrega entrega, Leitura leitura) throws MinhaEx.CorrigirValorIntException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Deseja entrega?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            System.out.print("Escolha uma opção: ");

            int opcaoEntrega = leitura.lerInteiro();

            switch (opcaoEntrega) {
                case 1:
                    entrega.coletarEndereco();
                    System.out.println("Endereço coletado para entrega.");
                    break;
                case 2:
                    System.out.println("Entrega não solicitada.");
                    break;
                default:
                    System.out.println("Opção inválida. Entrega não solicitada.");
                    break;
            }
        } finally {
            scanner.close();
        }
    }
}
