import java.util.Scanner;

public class PagamentoCurso {
    private String nome;
    private int matricula;
    private double valor;
    private double desconto;
    private double dataPagamento;

    public PagamentoCurso(String nome, int matricula, double valor, double dataPagamento ) {
        this.nome = nome;
        this.matricula = matricula;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    @Override
    public String toString() {
        return "PagamentoCurso{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", valor=" + valor +
                ", data de pagamento=" + dataPagamento +
                '}';
    }

    //Métodos
    public void pagar() {
        int resposta;

        Scanner sc = new Scanner(System.in);
        IO.println("Selecione a forma de pagamento: 1 - À vista / 2 - Parcelado sem Juros");
        resposta = Integer.parseInt(sc.next());

        if (resposta == 1) {
            IO.println("Selecionado: À vista");
        }
        if (resposta == 2) {
            IO.println("Selecionado: Parcelado sem Juros");
        } else {
            IO.println("Digite uma resposta válida (1 - 2)");
        }
    }


    public double getDesconto() {
        IO.println("Valor descontado:");
        return desconto;
    }

    public void setDesconto(double valor) {
        desconto = (valor * 0.10);
    }
}
