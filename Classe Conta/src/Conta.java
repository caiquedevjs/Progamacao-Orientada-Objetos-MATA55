public class Conta {
    private String agencia;
    private Integer numero;
    private String tipo;
    private Integer saldo;
    private Integer limite;
    private Titular titular;

    public Conta(String agencia, Integer numero, String tipo, Integer saldo, Titular titular){
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.limite = 100;
        this.titular = titular;
    }

    public Conta(String agencia, Integer numero, String tipo,Titular titular){
        this.agencia = agencia;
        this.numero = numero;

        if(this.tipo.equals("comum")){
            this.saldo =0;
            this.limite =null;
        }
        
       
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    
    public void sacar(Integer valor){
        if(this.tipo.equals("comum")){
            if(this.saldo < valor){
                System.out.println("Seu saldo é insuficiente para sacar esse valor");
            }
            else{
                this.saldo -= valor;
                System.out.println("Você acabou de sacar o valor de :" + valor);
            }
        }
        if(this.tipo.equals("especial")){
            if(this.saldo < valor){
                if(this.limite < valor){
                    System.out.println("Seu saldo  + limite é insuficiente para sacar esse valor");
                }
                else{
                    this.limite -= valor;
                    System.out.println("Você acabou de sacar do seu limite emergencial :" + valor);
                }
            }
            else{
                this.saldo -= valor;
                System.out.println("Você acabou de sacar o valor de :" + valor);
            }

        }
    }
    public void depositar(Integer valor){
        this.saldo = valor;
        System.out.println("Você acabou de depositar o valor de :" + valor);
    }

    

}