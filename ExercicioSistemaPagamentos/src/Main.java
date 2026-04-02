void main() {
    ContaCorrente cc01 = new ContaCorrente(001, 001, "Igor", 500, 400);
    ContaCorrente cc02 = new ContaCorrente(002, 002, "Heitor", 600, 800);
    ContaSalario cs01 = new ContaSalario(002, 003, "Gustavo", 850, 0);

    cc01.pix(100, cc02);

    cc01.cartaoCredito(700);

    cc02.boletoBancario(300);

//    int selecaoAcao;
//    Scanner sc = new Scanner(System.in);
//    IO.println("Selecionar Ação: ");
//    IO.println("1 - PIX | 2 - Pagar Compras no Crédito | 3 - Pagar conta com Boleto");


}
