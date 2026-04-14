public class Pedidos {
    // Atributos
    private int id;
    private String cliente;
    private StatusPedido status;

    // Constructors

    public Pedidos(int id, String cliente, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", status=" + status +
                '}';
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    // Métodos

    public void avancarStatus () {
        IO.println("Situação do Pedido: " + StatusPedido.PROCESSANDO +
                " -> " + StatusPedido.ENVIADO +
                " -> " + StatusPedido.ENTREGUE
        );
        this.setStatus(StatusPedido.ENTREGUE);
//        if (status == StatusPedido.AGUARDANDO_PAGAMENTO){
//            IO.println("Situação do Pedido: " +StatusPedido.AGUARDANDO_PAGAMENTO);
//        } else {
//            IO.println("Situação do Pedido: " +StatusPedido.PROCESSANDO+
//            " -> " +StatusPedido.ENVIADO+
//            " -> " +StatusPedido.ENTREGUE
//                    );
//            this.setStatus(StatusPedido.ENTREGUE);
//    }
    };

    public void cancelarPedido (){
        if (status == StatusPedido.ENTREGUE) {
            IO.println("Seu pedido não pode ser cancelado! -- Situação do Pedido: " +StatusPedido.ENTREGUE);
        } else {
            IO.println("Seu pedido foi cancelado! -- Situação do Pedido: " +StatusPedido.CANCELADO);
            this.setStatus(StatusPedido.CANCELADO);
        }
    };

    public void statusInicial (){
        IO.println("Status Inicial do Pedido: " +getStatus());
    }

    public void statusFinal (){
        IO.println("Status Final do Pedido: " +getStatus());
    }


}
