public class ContaCorrente extends Conta{
    // Constructors
    public ContaCorrente(String numero, String agencia, String titular, double saldo, double limiteCredito) {
        super(numero, agencia, titular, saldo, limiteCredito);
    }

    public ContaCorrente() {
    }

    // Métodos
    public void pix (double valor, Conta destinatario){
        if (valor > getSaldo()){
            IO.println("Saldo insuficiente para transferência PIX");
            IO.println("Saldo Atual: R$ " +getSaldo() +" --- Valor da Transferência: R$ " +valor);
            IO.println();
        } else {
            IO.println(this.getTitular() + " realizou uma transferência via PIX para " + destinatario.getTitular());
            IO.println("Valor da Transferência: R$ " + valor);
            this.setSaldo(getSaldo() - valor);
            destinatario.setSaldo(destinatario.getSaldo() + valor);
            IO.println(this.getTitular() +" - Saldo Atual: R$ " +getSaldo());
            IO.println(destinatario.getTitular()+ " - Saldo Atual: R$ " +destinatario.getSaldo());
            IO.println();
        }
    }

    @Override
    public void cartaoCredito(double valor) {
        super.cartaoCredito(valor);
        if (valor > getLimiteCredito()) {
            IO.println("Limite de Crédito insuficiente");
            IO.println("Limite do Crédito: R$ " +getLimiteCredito() +" --- Valor do Pagamento: R$ " +valor);
            IO.println();
        } else {
            IO.println("Valor do Pagamento: R$ " +valor);
            IO.println("Pagamento Aprovado!");
            IO.println();
        }
    }

    @Override
    public void creditoParcelado(double valor) {
        super.creditoParcelado(valor);
        if (valor >= 100){
            IO.println("Valor do pagamento: R$" +valor);
            IO.println("Parcelado em 4x sem juros!");
            IO.println("Pagamento Aprovado!");
            IO.println();
        } else {
            IO.println("Não é possível parcelar pagamentos com valor abaixo de R$ 100,00");
            IO.println();
        }
    }

    @Override
    public void boletoBancario(double valor) {
        super.boletoBancario(valor);
        IO.println("Valor do pagamento: R$ " +valor);
        IO.println("Pagamento Aprovado!");
        IO.println("Valor do boleto: R$ " +valor);
        IO.println("Data de Vencimento: 30 dias (atraso: sujeito a multa)");
        IO.println();
    }
}
