import java.util.Scanner;

public abstract class Personagem {
    //    Atributos

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

//    Construtores

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public Personagem(){};

//    Métodos

    public void atacar (){

    };

    public void receberDano (int dano){

    };

    public void mostrarStatus (){

    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
