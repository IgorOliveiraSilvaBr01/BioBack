package SistemaCinema;

public class Series {
    private String genero;
    private String nome;
    private int episodios;
    private int numTemporadas;
    private int duracaoEpisodio;
    private String plataforma;

    public Series(String genero, String nome, int episodios,
                  int numTemporadas, int duracaoEpisodio, String plataforma) {
        this.genero = genero;
        this.nome = nome;
        this.episodios = episodios;
        this.numTemporadas = numTemporadas;
        this.duracaoEpisodio = duracaoEpisodio;
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Series{" +
                "genero='" + genero + '\'' +
                ", nome='" + nome + '\'' +
                ", episodios=" + episodios +
                ", numTemporadas=" + numTemporadas +
                ", duracaoEpisodio=" + duracaoEpisodio + "minutos" +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }

//    Métodos

}
