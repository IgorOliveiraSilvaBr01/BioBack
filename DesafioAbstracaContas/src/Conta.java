public abstract class Conta {
    // Atributos
    private int numero;
    private String agencia;
    private String titular;
    private double saldo;

    // Constructors

    public Conta(int numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    // Métodos
    public void depositar (double valor){

    }

    public void sacar (double valor){

    }

    public void exibirSaldo (){

    }

    public abstract void calcularTarifaMensal();
}