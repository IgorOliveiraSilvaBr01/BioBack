package SistemaAnimal;

public class Vaca extends Animal{

    public Vaca(){}

    public Vaca(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    // Métodos


    @Override
    public void fazerSom() {
        super.fazerSom();
        IO.println("MUHHHHHHHHHHHHHHHH");
    }
}
