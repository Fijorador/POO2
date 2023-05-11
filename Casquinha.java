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

    @Override
    public void coletarEndereco() {
       
    }
    @Override
    public double calcularTaxaEntrega() {
       
        return 0;
    }
}
