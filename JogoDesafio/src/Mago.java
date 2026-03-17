import java.util.Scanner;

public class Mago extends Personagem{
//    Atributos
    private String ataqueMaisForte;
    private String defesaMenor;

    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

//    Métodos

    @Override
    public void atacar() {

    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(dano);
    }

    @Override
    public void mostrarStatus() {
        super.mostrarStatus();
    }


}
