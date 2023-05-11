import java.util.Scanner;

public class Leitura {
    private static Scanner scanner;

    public Leitura() {
        scanner = new Scanner(System.in);
    }

    public static Entrega perguntarEntrega(Sorvete sorvete, String endereco) throws MinhaEx.CorrigirValorIntException {
        try {
            System.out.println("Deseja entrega?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            System.out.print("Escolha uma opção: ");

            int opcaoEntrega = lerInteiro();

            switch (opcaoEntrega) {
                case 1:
                    endereco = sorvete.coletarEndereco();
                    System.out.println("Endereço coletado para entrega.");
                    return endereco;
                case 2:
                    System.out.println("Entrega não solicitada.");
                    break;
                default:
                    throw new MinhaEx.CorrigirValorIntException("Opção inválida. Entrega não solicitada.",
                            opcaoEntrega);
            }
        } catch (MinhaEx.CorrigirValorIntException e) {
            throw new MinhaEx.CorrigirValorIntException("Valor inteiro inválido: " + e.getMessage(), e);
        }
        return null; // Retorna null se a entrega não for solicitada
    }

    public static int lerInteiro() throws MinhaEx.CorrigirValorIntException {
        System.out.print("Digite um número inteiro: ");
        if (scanner.hasNextLine()) {
            String entrada = scanner.nextLine();
            try {
                int numeroInteiro = Integer.parseInt(entrada);
                return numeroInteiro;
            } catch (NumberFormatException e) {
                throw new MinhaEx.CorrigirValorIntException("Valor inteiro inválido: " + entrada, e);
            }
        } else {
            throw new MinhaEx.CorrigirValorIntException("Nenhuma linha encontrada para leitura.", scanner);
        }
    }

    public double lerDecimal() throws MinhaEx.CorrigirValorDecimalException {
        System.out.print("Digite um número decimal: ");
        if (scanner.hasNextLine()) {
            String entrada = scanner.nextLine();
            try {

                double numeroDecimal = Double.parseDouble(entrada);
                return numeroDecimal;
            } catch (NumberFormatException e) {
                throw new MinhaEx.CorrigirValorDecimalException("Valor decimal inválido: " + entrada, e);
            }
        } else {
            throw new MinhaEx.CorrigirValorDecimalException("Nenhuma linha encontrada para leitura.", scanner);
        }
    }

    public String lerLinhaTexto() {
        System.out.print("Escreva: ");
        if (scanner.hasNextLine()) {
            return scanner.nextLine().toLowerCase();
        } else {
            return "";
        }
    }

    public boolean lerBooleano() throws MinhaEx.CorrigirValorBooleanoException {
        System.out.print("Digite 0 para 'false' ou 1 para 'true': ");
        if (scanner.hasNextLine()) {
            String entrada = scanner.nextLine();
            if (entrada.equals("0")) {
                return false;
            } else if (entrada.equals("1")) {
                return true;
            } else {
                throw new MinhaEx.CorrigirValorBooleanoException("Valor booleano inválido: " + entrada, entrada);
            }
        } else {
            throw new MinhaEx.CorrigirValorBooleanoException("Nenhuma linha encontrada para leitura.", scanner);
        }
    }

    public void fecharScanner() {
        scanner.close();
    }

    public static Sundae criarSundae() {
        Leitura leitura = new Leitura();

        System.out.print("Digite o sabor do sundae: ");
        String sabor = leitura.lerLinhaTexto();

        double preco = 0.0;
        boolean temCobertura = false;
        boolean temFrutas = false;

        try {
            System.out.print("O sundae tem cobertura? (true/false): ");
            temCobertura = leitura.lerBooleano();

            System.out.print("O sundae tem frutas? (true/false): ");
            temFrutas = leitura.lerBooleano();
        } catch (MinhaEx.CorrigirValorBooleanoException e) {
            System.out.println("Ocorreu um erro ao ler os valores. Por favor, verifique sua entrada.");
            e.printStackTrace();
        }

        Sundae sundae = new Sundae(sabor, preco, temCobertura, temFrutas);

        return sundae;
    }
    public static Cascao criarCascao() {
        Leitura leitura = new Leitura();

        System.out.print("Digite o sabor do cascão: ");
        String sabor = leitura.lerLinhaTexto();

        double preco = 0.0;
        int quantidadeAdicional = 0;
        boolean granulado = false;

        try {

            System.out.print("Digite a quantidade adicional: ");
            quantidadeAdicional = leitura.lerInteiro();

            System.out.print("O cascão tem granulado? (true/false): ");
            granulado = leitura.lerBooleano();
        } catch (MinhaEx.CorrigirValorIntException
                | MinhaEx.CorrigirValorBooleanoException e) {
            System.out.println("Ocorreu um erro ao ler os valores. Por favor, verifique sua entrada.");
            e.printStackTrace();
        }

        Cascao cascao = new Cascao(sabor, preco, quantidadeAdicional, granulado);

        return cascao;
    }
    public static Casquinha criarCasquinha() {
        Leitura leitura = new Leitura();

        System.out.print("Digite o sabor da casquinha: ");
        String sabor = leitura.lerLinhaTexto();

        double preco = 0.0;
        String formato = "";
        boolean crocante = false;

        try {

            System.out.print("Digite o formato da casquinha: (Copo Baixo / Copo Alto) ");
            formato = leitura.lerLinhaTexto();

            System.out.print("A casquinha é crocante? (true/false): ");
            crocante = leitura.lerBooleano();
        } catch (MinhaEx.CorrigirValorBooleanoException e) {
            System.out.println("Ocorreu um erro ao ler os valores. Por favor, verifique sua entrada.");
            e.printStackTrace();
        }

        Casquinha casquinha = new Casquinha(sabor, preco, formato, crocante);

        return casquinha;
    }
}
