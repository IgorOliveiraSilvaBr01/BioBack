public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    public ContaPoupanca() {
    }

    @Override
    public void calcularTarifaMensal() {
        IO.println("Nãoa houve desconto na tarifa!");
        exibirSaldo();
    }
}
