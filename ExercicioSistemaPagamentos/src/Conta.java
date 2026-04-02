public abstract class Conta {
    // Atributos
    private int numero;
    private int agencia;
    private String titular;
    private double saldo;
    private double limiteCredito;

    // Constructor

    public Conta(int numero, int agencia, String titular, double saldo, double limiteCredito) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }

    public Conta (){};

    // Getters e Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
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

}
