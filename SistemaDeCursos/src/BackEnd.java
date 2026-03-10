import java.util.Scanner;

public class BackEnd {
    private String nome;
    private String area;
    private double duracao;
    private int vagas;
    private double valor;
    private int avaliacao;

    public BackEnd(String nome, String area, double duracao, int vagas, double valor) {
        this.nome = nome;
        this.area = area;
        this.duracao = duracao;
        this.vagas = vagas;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "BackEnd{" +
                "nome='" + nome + '\'' +
                ", area='" + area + '\'' +
                ", duracao=" + duracao + " anos" +
                ", vagas=" + vagas +
                ", valor=" + valor +
                '}';
    }

    // Métodos
    public void inscricao(){
        Scanner sc = new Scanner(System.in);
        String resposta;

        IO.println("Deseja se increver no curso?");
        resposta = sc.next();

        if (resposta == "sim"){
            IO.println("Inscrição realizada com sucesso!");
        } if (resposta == "não") {
            IO.println("Processo de inscrição cancelado!");
        } else {
            IO.println("Digite uma resposta válida! (sim ou não)");
        }
    }

    public void trancar(){
        Scanner sc = new Scanner(System.in);
        String resposta;

        IO.println("Deseja trancar o curso?");
        resposta = sc.next();

        if (resposta == "sim"){
            IO.println("Curso cancelado com sucesso!");
        } if (resposta == "não"){
            IO.println("Processo de cancelamento recusado!");
        } else {
            IO.println("Digite uma resposta válida! (sim ou não)");
        }
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
        IO.println("Você avaliou o curso de " +nome+ " com uma nota de: " +avaliacao);
    }
}
