void main() {
    ContaCorrente cc01 = new ContaCorrente(001, 001, "Igor", 500, 400);
    ContaCorrente cc02 = new ContaCorrente(002, 002, "Heitor", 600, 800);
    ContaSalario cs01 = new ContaSalario(002, 003, "Gustavo", 850, 0);

    //cc01.pix(100, cc02);

    //cc01.cartaoCredito(700);

    //cc02.boletoBancario(300);

    int selecaoAcao;
    int selecaoCredito;
    Scanner sc = new Scanner(System.in);
    IO.println("Selecionar Ação: ");
    IO.println("1 - PIX | 2 - Pagar Compras no Crédito | 3 - Pagar conta com Boleto");
    selecaoAcao = sc.nextInt();

    if (selecaoAcao == 1){
        cc01.pix(200, cc02);
    } else if (selecaoAcao == 2){
        Scanner sc01 = new Scanner(System.in);
        IO.println("Deseja parcelar a compra no crédito? --- 1 - SIM | 2 - NÃO");
        selecaoCredito = sc.nextInt();
        if (selecaoCredito == 1){
            cc01.creditoParcelado(150);
        } else {
            cc01.cartaoCredito(50);
        }
    } else {
        cc01.boletoBancario(300);
    }
}
