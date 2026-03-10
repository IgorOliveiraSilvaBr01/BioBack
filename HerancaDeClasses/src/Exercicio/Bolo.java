package Exercicio;

public class Bolo extends Doce{
    public Bolo(){}

    public Bolo(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void cobertura() {
        super.cobertura();
        IO.println("Ganash");
    }

    @Override
    public void massa() {
        super.massa();
        IO.println("Cenoura");
    }
}
