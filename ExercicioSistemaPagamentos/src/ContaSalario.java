public class ContaSalario extends Conta{
    public ContaSalario(int numero, int agencia, String titular, double saldo, double limiteCredito) {
        super(numero, agencia, titular, saldo, limiteCredito);
    };

    public ContaSalario(){};

    // Métodos
    public void pix (){
        IO.println("Uma conta salário não pode fazer pix");
    }


}
