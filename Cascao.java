import java.util.Scanner;

class Cascao extends Sorvete {
    private int quantidadeAdicional;
    private boolean granulado;

    public Cascao(String sabor, double preco, int quantidadeAdicional, boolean granulado) {
        super(sabor, preco);
        this.quantidadeAdicional = quantidadeAdicional;
        this.granulado = granulado;
        setPreco(getPreco() + calcularTaxaEntrega());
    }

    public int getQuantidadeAdicional() {
        return quantidadeAdicional;
    }

    public void setQuantidadeAdicional(int quantidadeAdicional) {
        this.quantidadeAdicional = quantidadeAdicional;
    }

    public boolean isGranulado() {
        return granulado;
    }

    public void setGranulado(boolean granulado) {
        this.granulado = granulado;
    }

    @Override
    public double calcularTaxaEntrega() {
        return 0.05 * getPreco();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do cascao:");
        System.out.println("Sabor: " + getSabor());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Quantidade adicional: " + quantidadeAdicional);
        System.out.println("Granulado: " + granulado);
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
