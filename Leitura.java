import java.util.Scanner;

public class Leitura {
    private Scanner scanner;

    public Leitura() {
        scanner = new Scanner(System.in);
    }

    public int lerInteiro() throws CorrigirValorIntException {
        System.out.print("Digite um número inteiro: ");
        String entrada = scanner.nextLine();
        try {
            int numeroInteiro = Integer.parseInt(entrada);
            return numeroInteiro;
        } catch (NumberFormatException e) {
            throw new CorrigirValorIntException("Valor inteiro inválido: " + entrada);
        }
    }

    public double lerDecimal() throws CorrigirValorDecimalException {
        System.out.print("Digite um número decimal: ");
        String entrada = scanner.nextLine();
        try {
            double numeroDecimal = Double.parseDouble(entrada);
            return numeroDecimal;
        } catch (NumberFormatException e) {
            throw new CorrigirValorDecimalException("Valor decimal inválido: " + entrada);
        }
    }

    public String lerLinhaTexto() {
        while (true) {
            try {
                System.out.print("Escolha: ");
                String linhaTexto = scanner.nextLine();

                if (linhaTexto.length() < 3) {
                    throw new InformacaoInsuficienteException(
                            "Informação insuficiente. Digite pelo menos 3 caracteres.");
                }

                return linhaTexto.toLowerCase();
            } catch (InformacaoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean lerBooleano() throws CorrigirValorBooleanoException {
        System.out.print("Digite 0 para 'false' ou 1 para 'true': ");
        String entrada = scanner.nextLine();
        if (entrada.equals("0")) {
            return false;
        } else if (entrada.equals("1")) {
            return true;
        } else {
            throw new CorrigirValorBooleanoException("Valor booleano inválido: " + entrada);
        }
    }

    public void fecharScanner() {
        scanner.close();
    }

    static Sundae criarSundae() {
        Leitura leitura = new Leitura();

        System.out.print("Digite o sabor do sundae: ");
        String sabor = leitura.lerLinhaTexto();

        double preco = 0.0;
        boolean temCobertura = false;
        boolean temFrutas = false;

        try {
            System.out.print("Digite o preço do sundae: ");
            preco = leitura.lerDecimal();

            System.out.print("O sundae tem cobertura? (true/false): ");
            temCobertura = leitura.lerBooleano();

            System.out.print("O sundae tem frutas? (true/false): ");
            temFrutas = leitura.lerBooleano();
        } catch (CorrigirValorDecimalException | CorrigirValorBooleanoException e) {
            System.out.println("Ocorreu um erro ao ler os valores. Por favor, verifique sua entrada.");
            e.printStackTrace();
        }

        Sundae sundae = new Sundae(sabor, preco, temCobertura, temFrutas);
        return sundae;
    }

    static Cascao criarCascao() {
        Leitura leitura = new Leitura();

        System.out.print("Digite o sabor do cascão: ");
        String sabor = leitura.lerLinhaTexto();

        double preco = 0.0;
        int quantidadeAdicional = 0;
        boolean granulado = false;

        try {
            System.out.print("Digite o preço do cascão: ");
            preco = leitura.lerDecimal();

            System.out.print("Digite a quantidade adicional: ");
            quantidadeAdicional = leitura.lerInteiro();

            System.out.print("O cascão tem granulado? (true/false): ");
            granulado = leitura.lerBooleano();
        } catch (CorrigirValorDecimalException | CorrigirValorIntException | CorrigirValorBooleanoException e) {
            System.out.println("Ocorreu um erro ao ler os valores. Por favor, verifique sua entrada.");
            e.printStackTrace();
        }

        Cascao cascao = new Cascao(sabor, preco, quantidadeAdicional, granulado);

        return cascao;
    }

    static Casquinha criarCasquinha() {
        Leitura leitura = new Leitura();

        System.out.print("Digite o sabor da casquinha: ");
        String sabor = leitura.lerLinhaTexto();

        double preco = 0.0;
        String formato = "";
        boolean crocante = false;

        try {
            System.out.print("Digite o preço da casquinha: ");
            preco = leitura.lerDecimal();

            System.out.print("Digite o formato da casquinha: (Copo Baixo / Copo Alto) ");
            formato = leitura.lerLinhaTexto();

            System.out.print("A casquinha é crocante? (true/false): ");
            crocante = leitura.lerBooleano();
        } catch (CorrigirValorDecimalException | CorrigirValorBooleanoException e) {
            System.out.println("Ocorreu um erro ao ler os valores. Por favor, verifique sua entrada.");
            e.printStackTrace();
        }

        Casquinha casquinha = new Casquinha(sabor, preco, formato, crocante);

        return casquinha;
    }

}
