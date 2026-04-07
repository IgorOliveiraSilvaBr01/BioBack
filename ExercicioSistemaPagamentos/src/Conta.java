public abstract class Conta {
    // Atributos
    private String numero;
    private String agencia;
    private String titular;
    private double saldo;
    private double limiteCredito;

    // Constructor


    public Conta(String numero, String agencia, String titular, double saldo, double limiteCredito) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }

    public Conta (){};

    // Getters e Setters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }


    // Métodos

    public void pix (double valor, Conta destinatario){

    };

    public void cartaoCredito (double valor){

    };

    public void boletoBancario (double valor){

    };

    public void creditoParcelado (double valor){

    };

}
