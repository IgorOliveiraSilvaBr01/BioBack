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

    public void atacar (Personagem alvo){
        IO.println(this.nome+ " executou um ataque normal em " +alvo.getNome());
        alvo.receberDano(this.ataque);
    };

    public void receberDano (int danoRecebido){
        int danoReal = danoRecebido - this.defesa;

        if (danoReal < 0){
            danoReal = 0;
        }

        this.vida -= danoReal;

        if (this.vida < 0){
            this.vida = 0;
        }

        IO.println(this.nome+ " recebeu " +danoReal+ " de dano");
        IO.println("Vida atual: " +this.vida);
    };

    public void mostrarStatus (){
        IO.println(this.getNome()+ " - Status ");
        IO.println("Vida = " +this.getVida());
        IO.println("Ataque = " +this.getAtaque());
        IO.println("Defesa = " +this.getDefesa());
    };

    public String getNome() {
        return nome;
    }

//    Getters e Setters
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
}
