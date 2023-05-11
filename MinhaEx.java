public class MinhaEx Exception{
    private int valorOpcao;
    private int numero;

    public MinhaEx(String mensagem, int numero) {
        super(mensagem);
        this.numero = numero;
    }

    public int getValorOpcao() {
        return valorOpcao;
    }

    public static class CorrigirValorDecimalException extends Exception {
        public CorrigirValorDecimalException(String mensagem) {
            super(mensagem);
        }
    }

    public static class CorrigirValorBooleanoException extends Exception {
        public CorrigirValorBooleanoException(String mensagem) {
            super(mensagem);
        }
    }

    public static class InformacaoInsuficienteException extends Exception {
        public InformacaoInsuficienteException(String mensagem) {
            super(mensagem);
        }
    }
}
