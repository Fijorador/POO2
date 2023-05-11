import java.util.Scanner;

class Sorvete implements Entrega {
    private String sabor;
    private double preco;

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
    public void coletarEndereco() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coletar Endereço de Entrega:");

        System.out.print("Digite o nome do destinatário: ");
        String nomeDestinatario = scanner.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();

        System.out.print("Digite o bairro: ");
        String bairro = scanner.nextLine();

        System.out.println("Endereço de entrega do sorvete:");
        System.out.println("Nome do destinatário: " + nomeDestinatario);
        System.out.println("Endereço: " + endereco + ", " + numero);
        System.out.println("Bairro: " + bairro);

        setPreco(getPreco() + calcularTaxaEntrega());

        scanner.close();
    }

    @Override
    public double calcularTaxaEntrega() {
        return 5.00;
    }

    @Override
    public void exibirDetalhes() {
    }
    @Override
    public void exibirEndereco() {
        System.out.println("Endereço de entrega não disponível para sorvete.");
    }
    
}
