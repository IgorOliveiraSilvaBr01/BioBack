public abstract class Conta {

    // Atributos
    private int numero;
    private int agencia;
    private double saldo;
    private String titular;

    // Constructor

    public Conta(int numero, int agencia, double saldo, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
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
    public double depositar (double valor){
        return saldo = saldo + valor;
    }

    public double sacar (double valor) {
        if (valor > saldo) {
            IO.println("você está pobre");
            return saldo;
        } else {
            return saldo = saldo - valor;
        }
    }

    public void exibirSaldo (){
        IO.println("Seu saldo é: " +saldo);
    }

    public abstract void calcularTarifaMensal ();
}
