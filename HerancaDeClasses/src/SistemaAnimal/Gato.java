package SistemaAnimal;

public class Gato extends Animal{

    public Gato(){}

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    // Métodos


    @Override
    public void fazerSom() {
        super.fazerSom();
        IO.println("Miau Miau Miau");
    }
}
