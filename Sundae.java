import java.util.Scanner;

class Sundae extends Sorvete {
    private boolean temCobertura;
    private boolean temFrutas;

    public Sundae(String sabor, double preco, boolean temCobertura, boolean temFrutas) {
        super(sabor, preco);
        this.temCobertura = temCobertura;
        this.temFrutas = temFrutas;
        setPreco(getPreco() + calcularTaxaEntrega());
    }

    public boolean isTemCobertura() {
        return temCobertura;
    }

    public void setTemCobertura(boolean temCobertura) {
        this.temCobertura = temCobertura;
    }

    public boolean isTemFrutas() {
        return temFrutas;
    }

    public void setTemFrutas(boolean temFrutas) {
        this.temFrutas = temFrutas;
    }

    @Override
    public double calcularTaxaEntrega() {
        return 0.07 * getPreco();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do sundae:");
        System.out.println("Sabor: " + getSabor());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Tem cobertura: " + temCobertura);
        System.out.println("Tem frutas: " + temFrutas);
    }
    @Override
    public String coletarEndereço() {
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
    
}
