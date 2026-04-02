public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    public ContaCorrente() {
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo() - 12);
        IO.println("Seu saldo após o descosnto da Tarifa Mensal: " +getSaldo());
        exibirSaldo();
    }
}
