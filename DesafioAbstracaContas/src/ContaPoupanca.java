public class ContaPoupanca extends Conta{ // sem trarifa mensal
    // Constructors
    public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    // Métodos
    @Override
    public void depositar(double valor) {
        super.depositar(valor);
        IO.println(this.getTitular()+ " fez um depósito no valor de R$ " +valor);
        double depositar = getSaldo() + valor;
        setSaldo(depositar);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        IO.println(this.getTitular()+ " realizou um saque no valor de R$ " +valor);
        double sacar = getSaldo() - valor;
        setSaldo(sacar);
    }

    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
        IO.println("Saldo de " +this.getTitular() +": R$ " +getSaldo());
        IO.println("Não possui valor de tarefa mensal!");
    }

    @Override
    public void calcularTarifaMensal() {

    }
}
