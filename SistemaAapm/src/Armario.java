public class Armario {
    private String idArmario;
    private String idSocio;

    @Override
    public String toString() {
        return "Armario{" +
                "idArmario='" + idArmario + '\'' +
                ", idSocio='" + idSocio + '\'' +
                '}';
    }

    public Armario(String idArmario, String idSocio) {
        this.idArmario = idArmario;
        this.idSocio = idSocio;
    }

    //Métodos
    //acessararmario
}
