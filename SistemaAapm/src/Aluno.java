public class Aluno {
    private String id;
    private String cpf;
    private String telefone;
    private String telefoneResponsavel;
    private String maticula;
    private String nome;
    private String email;

    @Override
    public String toString() {
        return "Aluno{" +
                "id='" + id + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", telefoneResponsavel='" + telefoneResponsavel + '\'' +
                ", maticula='" + maticula + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Aluno(String id, String cpf, String telefone,
                 String telefoneResponsavel, String maticula,
                 String nome, String email) {
        this.id = id;
        this.cpf = cpf;
        this.telefone = telefone;
        this.telefoneResponsavel = telefoneResponsavel;
        this.maticula = maticula;
        this.nome = nome;
        this.email = email;
    }

    //Métodos
    //virarsocio
    //comprarcamisa
}
