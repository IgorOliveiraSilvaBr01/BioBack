public class Guerreiro extends Personagem{
//    Atributos
    private String defesaMaior;
    private String ataqueMedio;

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    };

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

    public void ataquePesado (Personagem alvo){
        IO.println(this.getNome()+ " executou um ataque pesado em " +alvo.getNome());

        int forcaAtkPesado = this.getAtaque() + (this.getAtaque() / 2);

        receberDano(forcaAtkPesado);
    }
}
