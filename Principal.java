public class Principal {
    public static void main(String[] args) {
        Leitura leitura = new Leitura();
        int opcao = 0;
        String enderecoEntrega = null;


        while (opcao != 4) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Casquinha");
                System.out.println("2. Cascao");
                System.out.println("3. Sundae");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = leitura.lerInteiro();

                switch (opcao) {
                    case 1:
                        Casquinha casquinha = Leitura.criarCasquinha();
                        enderecoEntrega = Leitura.perguntarEntrega(casquinha, enderecoEntrega);
                        if (enderecoEntrega != null) {
                            System.out.println("Entrega: " + enderecoEntrega);
                        }
                        casquinha.exibirDetalhes();
                        break;
                    case 2:
                        Cascao cascao = Leitura.criarCascao();
                        enderecoEntrega = Leitura.perguntarEntrega(cascao, enderecoEntrega);
                        if (enderecoEntrega != null) {
                            System.out.println("Entrega: " + enderecoEntrega);
                        }
                        cascao.exibirDetalhes();
                        break;
                    case 3:
                        Sundae sundae = Leitura.criarSundae();
                        enderecoEntrega = Leitura.perguntarEntrega(sundae, enderecoEntrega);
                        if (enderecoEntrega != null) {
                            System.out.println("Entrega: " + enderecoEntrega);
                        }
                        sundae.exibirDetalhes();
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        break;
                }

                if (opcao == 4) {
                    break; // Saia do loop quando a opção 4 for selecionada
                }
            } catch (MinhaEx.CorrigirValorIntException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
