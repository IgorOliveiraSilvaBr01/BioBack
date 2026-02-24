import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String setor;
    private String cargo;
    private LocalDate nasc;
    private double salario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    } // exibe o salario

    public void setSalario(double salario){ // atribui um valor
        this.salario = salario - 150; // desconto aplicado ao valor
    } // atribui um valor a salario

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
