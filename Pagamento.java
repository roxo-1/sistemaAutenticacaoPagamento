public abstract class Pagamento{
    protected double valor;
    public pagamento(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Valor do pagamento dever ser positivo!");
        }else if(valor>0){
            this.valor = valor;
        }else{
            throw new IllegalArgumentException("Valor do pagamento não deve ser nulo!");
        }
    }
    public abstract void processar();
}

public interface Autenticavel{
    boolean autenticar(String token);
}

public class Pix extends Pagamento implements Autenticavel{
    private String chavePix;
    public pix(double valor, String chavePix){
        if(chave == null){
            throw new IllegalArgumentException("Chave PIX inválida!");
        }
        this.chavePix = chavePix;
    }

    public void processarPix(){
        System.out.println("Processando pagamento no PIX.");
    }
    public boolean autenticarPix(String token) {
        return token != null && token.length() == 6; // contrato restrito
    }
}

public class CartaoCredito extends Pagamento implements Autenticavel{
    private String numeroCartaoCredito;
    public CartaoCredito(double valor, String numeroCartaoCredito){
        if(numeroCartao == null){
            throw new IllegalArgumentException("Número do cartão inválido");
        }
        this.numeroCartaoCredito = numeroCartaoCredito;
    }
    public void processarCartaoCredito(){
        System.out.println("Processando pagamento no Cartão");
    }
    public boolean autenticarCartaoCredito(String token){
        return token != null && token.length() == 6; // contrato restrito
    }
}