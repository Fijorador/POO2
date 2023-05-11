class Sundae extends Sorvete {
    private boolean temCobertura;
    private boolean temFrutas;

    public Sundae(String sabor, double preco, boolean temCobertura, boolean temFrutas) {
        super(sabor, preco);
        this.temCobertura = temCobertura;
        this.temFrutas = temFrutas;
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
    public void coletarEndereco() {
       
    }
    @Override
    public double calcularTaxaEntrega() {
       
        return 0;
    }
}
