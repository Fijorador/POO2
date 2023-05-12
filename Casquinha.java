

class Casquinha extends Sorvete {
    private String formato;
    private boolean crocante;

    public Casquinha(String sabor, double preco, String formato, boolean crocante) {
        super(sabor, preco);
        this.formato = formato;
        this.crocante = crocante;
        setPreco(getPreco() + 5.00);
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean isCrocante() {
        return crocante;
    }

    public void setCrocante(boolean crocante) {
        this.crocante = crocante;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nDetalhes da casquinha:");
        System.out.println("Sabor: " + getSabor());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Formato: " + formato);
        System.out.println("Crocante: " + crocante);
    }

    @Override
    public double calcularTaxaEntrega() {
        return 0.3 * getPreco();
    }

}
