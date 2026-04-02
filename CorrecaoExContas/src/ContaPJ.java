public class ContaPJ extends Conta{

    public ContaPJ(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    public ContaPJ() {
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo() - 20);
        IO.println("Seu saldo após o descosnto da Tarifa Mensal: " +getSaldo());
        exibirSaldo();
    }
}
