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
    public void atacar(Personagem alvo) {
        super.atacar(alvo);
    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(dano);
    }

    @Override
    public void mostrarStatus() {
        super.mostrarStatus();
    }

    public void lancarMagia (Personagem alvo){
        IO.println(this.getNome()+ " lançou magia em " +alvo.getNome());

        int forcaMagia =  this.getAtaque() + (this.getAtaque() / 2 );

        alvo.receberDano(forcaMagia);
    }

}
