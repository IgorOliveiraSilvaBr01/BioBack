public class Arqueiro extends Personagem{
//    Atributos
    private String ataqueRapido;
    private String defesaMedia;

    public Arqueiro(String nome, int vida, int ataque, int defesa) {
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

    public void disparoPreciso(Personagem alvo){
        IO.println(this.getNome()+ " executou um disparo preciso em " +alvo.getNome());

        int forcaDisparo = this.getAtaque() + (this.getAtaque() / 2);

        receberDano(forcaDisparo);
    }
}
