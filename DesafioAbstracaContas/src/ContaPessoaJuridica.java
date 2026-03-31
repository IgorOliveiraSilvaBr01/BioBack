public class ContaPessoaJuridica extends Conta{ // cada saque tem uma taxa adicional de 1,50
    // Constructors
    public ContaPessoaJuridica(int numero, String agencia, String titular, double saldo) {
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
        IO.println(this.getTitular()+ " fez um saque no valor de R$ " +valor);
        IO.println("Taxa Adicional de Saque: R$ 1,50");
        double sacar = getSaldo() - valor - 1.50;
        setSaldo(sacar);
    }

    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
        IO.println("Saldo de " +this.getTitular()+ ": R$ " +getSaldo());
        IO.println("Valor da Tarifa Mensal: R$ 20.00");
    }

    @Override
    public void calcularTarifaMensal() {
        double calcularTarifaMensal = getSaldo() - 20;
        setSaldo(calcularTarifaMensal);
    }
}
