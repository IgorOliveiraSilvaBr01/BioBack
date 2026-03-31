public class Banco {
    static void main() {
        ContaCorrente CC = new ContaCorrente(01,"Itaú", "Igor Oliveira", 200.00);
        ContaPoupanca CP = new ContaPoupanca(02, "Santander", "Andre", 100.00);
        ContaPessoaJuridica CPJ = new ContaPessoaJuridica(03, "Banco do Brasil", "Medina", 50.00);

        CC.calcularTarifaMensal();
        CC.depositar(20.00);
        CC.sacar(10.00);
        CC.exibirSaldo();

        IO.println();

        CP.depositar(50.00);
        CP.sacar(70.00);
        CP.exibirSaldo();

        IO.println();

        CPJ.calcularTarifaMensal();
        CPJ.depositar(500.00);
        CPJ.sacar(100.00);
        CPJ.exibirSaldo();
    }
}
