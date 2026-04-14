void main() {
    Pedidos pedido = new Pedidos(01234, "Igor", StatusPedido.AGUARDANDO_PAGAMENTO);

    pedido.statusInicial();

    pedido.avancarStatus();

    Scanner sc = new Scanner(System.in);
    String resposta;

//    IO.println("Deseja cancelar seu pedido? -- Sim ou Não");
//    resposta = sc.next();



    pedido.cancelarPedido();

    pedido.statusFinal();
}