public class Principal {
    public static void main(String[] args) throws MinhaEx.CorrigirValorIntException {
        Leitura leitura = new Leitura();
        int opcao = 0;

        while (opcao != 4) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Casquinha");
                System.out.println("2. Cascao");
                System.out.println("3. Sundae");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção:\n ");

                opcao = leitura.lerInteiro();

                switch (opcao) {
                    case 1:
                        Casquinha casquinha = Leitura.criarCasquinha();
                        perguntarEntrega(casquinha, leitura);
                        casquinha.exibirDetalhes();
                        break;
                    case 2:
                        Cascao cascao = Leitura.criarCascao();
                        perguntarEntrega(cascao, leitura);
                        cascao.exibirDetalhes();
                        break;
                    case 3:
                        Sundae sundae = Leitura.criarSundae();
                        perguntarEntrega(sundae, leitura);
                        sundae.exibirDetalhes();
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                }
            } catch (MinhaEx.CorrigirValorIntException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void perguntarEntrega(Entrega entrega, Leitura leitura) throws MinhaEx.CorrigirValorIntException {
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
                    throw new MinhaEx.CorrigirValorIntException("Opção inválida. Entrega não solicitada.",
                            opcaoEntrega);
            }
        } catch (MinhaEx.CorrigirValorIntException e) {
            throw new MinhaEx.CorrigirValorIntException("Valor decimal inválido: " + e.getMessage(), e);
        }
    }
}
