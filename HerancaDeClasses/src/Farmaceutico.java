public class Farmaceutico extends Funcionario{ // Classe filho - SubClasse
    // extends - puxa os atributos criados dentro da classe pai

    private int crf;

    public Farmaceutico() {} // Construtor vazio

    public Farmaceutico(String nome, double salario, String cpf, int crf) {
        super(nome, salario, cpf);
        this.crf = crf;
    } // Construtor com argumentos

    public int getCrf() {
        return crf;
    }

    public void setCrf(int crf) {
        this.crf = crf;
    }
}
