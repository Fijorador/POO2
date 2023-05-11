import java.util.Scanner;

class Sorvete implements Entrega {
    private String sabor;
    private double preco;
    private String endereco;
    private String numero;
    private String bairro;

    public Sorvete(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public static Entrega perguntarEntrega(Sorvete sorvete, Entrega endereco) throws MinhaEx.CorrigirValorIntException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coletar Endereço de Entrega:");

        System.out.print("Digite o nome do destinatário: ");
        String nomeDestinatario = scanner.nextLine();

        System.out.print("Digite o endereço: ");
        endereco = scanner.nextLine();

        System.out.print("Digite o número: ");
        numero = scanner.nextLine();

        System.out.print("Digite o bairro: ");
        bairro = scanner.nextLine();

        System.out.println("\nEndereço de entrega do sorvete:");
        System.out.println("Nome do destinatário: " + nomeDestinatario);
        System.out.println("Endereço: " + endereco + ", " + numero);
        System.out.println("Bairro: " + bairro);

        setPreco(getPreco() + calcularTaxaEntrega());

        scanner.close();
    }

    @Override
    public double calcularTaxaEntrega() {
        return 0;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do sorvete:");
        System.out.println("Sabor: " + getSabor());
        System.out.println("Preço: R$" + getPreco());
    }

    @Override
    public void exibirEndereco() {
        System.out.println("Endereço de entrega do sorvete:");
        System.out.println("Endereço: " + endereco + ", " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("Preço total com taxa: R$" + (getPreco() + calcularTaxaEntrega()));
    }
    
}
