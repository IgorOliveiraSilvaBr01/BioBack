public class ContaCorrente extends Conta{
    // Constructors
    public ContaCorrente(int numero, int agencia, String titular, double saldo, double limiteCredito) {
        super(numero, agencia, titular, saldo, limiteCredito);
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
            IO.println(this.getTitular()+ " pagou com o cartão de crédito");
            IO.println("Valor do Pagamento: R$ " +valor);
            IO.println();
        }
    }

    @Override
    public void boletoBancario(double valor) {
        super.boletoBancario(valor);
        IO.println(this.getTitular() +" pagou a fatura do cartão com um boleto bancário.");
        IO.println("O boleto deve ser pago em 1 semana.");
        IO.println("Valor do boleto: R$ " +valor);
        IO.println();
    }
}
