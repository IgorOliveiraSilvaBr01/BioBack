public class Medico  extends Funcionario{
    private int crm;

    public Medico() {}

    public Medico(String nome, double salario, String cpf, int crm) {
        super(nome, salario, cpf);
        this.crm = crm;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }


}
