package SistemaAnimal;

public class Cachorro extends Animal{

    public Cachorro(){}

    public Cachorro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    // Métodos


    @Override
    public void fazerSom() {
        super.fazerSom();
        IO.println("AUAUUAUAUAU");
    }
}
