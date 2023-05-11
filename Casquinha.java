class Casquinha extends Sorvete {
    private String formato;
    private boolean crocante;

    public Casquinha(String sabor, double preco, String formato, boolean crocante) {
        super(sabor, preco);
        this.formato = formato;
        this.crocante = crocante;
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

    public void exibirDetalhes() {
        System.out.println("Detalhes da casquinha:");
        System.out.println("Sabor: " + getSabor());
        System.out.println("Preço: " + getPreco());
        System.out.println("Formato: " + formato);
        System.out.println("Crocante: " + crocante);
    }

    @Override
    public double calcularTaxaEntrega() {

        return 0;
    }

}