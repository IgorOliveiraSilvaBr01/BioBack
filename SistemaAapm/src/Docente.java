public class Docente {
    private String id;
    private String cpf;
    private String telefone;
    private String cargo;
    private String nome;
    private String email;

    @Override
    public String toString() {
        return "Docente{" +
                "id='" + id + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cargo='" + cargo + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Docente(String id, String cpf, String telefone,
                   String cargo, String nome, String email) {
        this.id = id;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cargo = cargo;
        this.nome = nome;
        this.email = email;
    }

    //Métodos
    //virarsocio
    //comprarcamisa
}
