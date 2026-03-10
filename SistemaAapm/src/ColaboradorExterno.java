import java.util.Scanner;

public class ColaboradorExterno {
    private  int idColaborador;
    private int idSocio;

    @Override
    public String toString() {
        return "ColaboradorExterno{" +
                "idColaborador='" + idColaborador + '\'' +
                ", idSocio='" + idSocio + '\'' +
                '}';
    }

    public ColaboradorExterno(int idColaborador, int idSocio) {
        this.idColaborador = idColaborador;
        this.idSocio = idSocio;
    }

    //Métodos
    //doar

    public void doar (){
        double valorDoacao;
        Scanner sc = new Scanner(System.in);

        IO.println("Insira um valor para doação:");
        valorDoacao = sc.nextDouble();

        IO.println("Você fez uma doação no valor de:" +valorDoacao);
    }
}
