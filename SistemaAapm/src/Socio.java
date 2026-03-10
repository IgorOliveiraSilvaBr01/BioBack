public class Socio {
    private String idAluno;
    private String idDocente;
    private String idSocio;
    private String idColaboradorExterno;

    @Override
    public String toString() {
        return "Socio{" +
                "idAluno='" + idAluno + '\'' +
                ", idDocente='" + idDocente + '\'' +
                ", idSocio='" + idSocio + '\'' +
                ", idColaboradorExterno='" + idColaboradorExterno + '\'' +
                '}';
    }

    public Socio(String idAluno, String idDocente,
                 String idSocio, String idColaboradorExterno) {
        this.idAluno = idAluno;
        this.idDocente = idDocente;
        this.idSocio = idSocio;
        this.idColaboradorExterno = idColaboradorExterno;
    }

    //Métodos
    //descontocamisa
    //alugararmario
    //cursaringles
}
