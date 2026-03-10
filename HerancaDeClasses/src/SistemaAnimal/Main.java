package SistemaAnimal;

public class Main {
    static void main() {
        Cachorro cachorro = new Cachorro("Fofinho", "preto", 10.5);
        cachorro.fazerSom();

        Vaca vaca = new Vaca("Odette", "preta", 200);
        vaca.fazerSom();

        Gato gato = new Gato("Labu", "cinza", 10);
        gato.fazerSom();
    }
}
