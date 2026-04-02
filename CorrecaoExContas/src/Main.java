void main() {
    ContaCorrente cc = new ContaCorrente(1, 1, 500, "Irineu");
    ContaPoupanca cp = new ContaPoupanca(2, 2, 600, "Banjoo");
    ContaPJ cpj = new ContaPJ(3, 3, 1000, "Igor" );

    IO.println("Conta Corrente");
    cc.depositar(200);
    cc.sacar(2000);
    cc.exibirSaldo();
    cc.calcularTarifaMensal();

    IO.println("-------------------------------------");
    IO.println("Conta Poupança");
    cp.depositar(200);
    cp.sacar(150);
    cp.exibirSaldo();
    cp.calcularTarifaMensal();

    IO.println("-------------------------------------");
    IO.println("Conta Pessoa Jurídica");
    cpj.depositar(100);
    cpj.sacar(20);
    cpj.exibirSaldo();
    cpj.calcularTarifaMensal();
}
