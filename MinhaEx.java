import java.util.Scanner;

public class MinhaEx extends Exception {
    private Object objeto;
    private Integer inteiro;

    public MinhaEx(String mensagem, Object objeto) {
        super(mensagem);
        this.objeto = objeto;
    }

    public MinhaEx(String mensagem, Integer inteiroErr) {
        super(mensagem);
        this.inteiro = inteiroErr;
    }

    public MinhaEx(String entrada) {
    }

    public Object getObjeto() {
        return objeto;
    }

    public Integer getInt() {
        return inteiro;
    }

    public static Integer corrigirValorInt() {
        Scanner scanner = new Scanner(System.in);
        Integer inteiroCorrigido = null;
        
        while (inteiroCorrigido == null || inteiroCorrigido < 0) {
            System.out.println("Realizando correção para valor invalido...");
            System.out.print("Digite um novo valor: ");
            String input = scanner.nextLine();
    
            try {
                int novoValor = Integer.parseInt(input);
                if (novoValor >= 0) {
                    inteiroCorrigido = novoValor;
                } else {
                    System.out.println("Valor inválido. O valor deve ser maior ou igual a zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Não é nem numero fdp!");
            }
        }
        
        scanner.close();
        return inteiroCorrigido;
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
