public class MinhaEx extends Exception {
    private Object objeto;

    public MinhaEx(String mensagem, Object objeto) {
        super(mensagem);
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public static class CorrigirValorIntException extends MinhaEx {
        public CorrigirValorIntException(String mensagem, Object objeto) {
            super(mensagem, objeto);
        }
    }

    public static class CorrigirValorDecimalException extends MinhaEx {
        public CorrigirValorDecimalException(String mensagem, Object objeto) {
            super(mensagem, objeto);
        }
    }

    public static class CorrigirValorBooleanoException extends MinhaEx {
        public CorrigirValorBooleanoException(String mensagem, Object objeto) {
            super(mensagem, objeto);
        }
    }

    public static class InformacaoInsuficienteException extends MinhaEx {
        public InformacaoInsuficienteException(String mensagem, Object objeto) {
            super(mensagem, objeto);
        }
    }
}
