class Cascao extends Sorvete {
    private int quantidadeAdicional;
    private boolean granulado;

    public Cascao(String sabor, double preco, int quantidadeAdicional, boolean granulado) {
        super(sabor, preco);
        this.quantidadeAdicional = quantidadeAdicional;
        this.granulado = granulado;
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
    public void coletarEndereco() {
        
    }
    @Override
    public double calcularTaxaEntrega() {
       
        return 0;
    }
}
