public class Main {
    static void main() {
        FrontEnd Front01;
        Front01 = new FrontEnd("Sistemas para Internet", "Exatas", 2, 40, 800.00);

//        Front01.setAvaliacao(1);

        // PagamentoCurso

        PagamentoCurso Pagamento01 = new PagamentoCurso("SI", 1234, 800.00, 01);

        Pagamento01.setDesconto(800.00);
        IO.println(Pagamento01.getDesconto());
    }
}
