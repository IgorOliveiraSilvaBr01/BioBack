package Exercicio;

public class Torta extends Doce{

    public Torta(){}

    public Torta(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void cobertura() {
        super.cobertura();
        IO.println("Morango");
    }

    @Override
    public void massa() {
        super.massa();
        IO.println("Chocolate");
        IO.println();
    }
}
