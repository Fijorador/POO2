import java.util.Scanner;

class Sorvete implements Entrega {
    private String sabor;
    private double preco;
    private String endereco;

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
    public String coletarEndereco() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coletar Endereço de Entrega:");

        System.out.print("Digite a rua: ");
        String rua = scanner.nextLine();

        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();

        System.out.print("Digite o bairro: ");
        String bairro = scanner.nextLine();

        String endereco = rua + ", " + numero + ", " + bairro;

        scanner.close();
        return endereco;
    }

    @Override
    public double calcularTaxaEntrega() {

        return 0.0;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do sorvete:");
        System.out.println("Sabor: " + getSabor());
        System.out.println("Preço: R$" + getPreco());
    }

    @Override
    public void exibirEndereço() {
        System.out.println("Endereço de entrega do sorvete:");
        System.out.println("Endereço: " + endereco);
    }

}
