void main() {
    Mago mago = new Mago("Davy Jhones", 100, 20, 5);

    Arqueiro arqueiro = new Arqueiro("Igor", 125, 10, 15);

    Guerreiro guerreiro = new Guerreiro("Heitor", 200, 20, 30);


    int selecaoPersonagem;
    Scanner sc1 = new Scanner(System.in);
    IO.println("Selecione um personagem:");
    IO.println(" 1 - Mago | 2 - Guerreiro | 3 - Arqueiro");
    selecaoPersonagem = sc1.nextInt();

    int selecaoAtaque;
    Scanner sc2 = new Scanner(System.in);
    IO.println("Selecione um personagem para actacar:");
    IO.println(" 1 - Mago | 2 - Guerreiro | 3 - Arqueiro");
    selecaoAtaque = sc2.nextInt();

    if (selecaoPersonagem == 1) {
        if (selecaoAtaque == 2) {
            IO.println(mago.getNome() + " atacou " + guerreiro.getNome());
        } else if (selecaoAtaque == 3) {
            IO.println(mago.getNome() + " atacou " + arqueiro.getNome());
        } else if (selecaoPersonagem == 2) {
            if (selecaoAtaque == 1) {
                IO.println(guerreiro.getNome() + " atacou " + mago.getNome());
            } else if (selecaoAtaque == 3) {
                IO.println(guerreiro.getNome() + " atacou " + arqueiro.getNome());
            }
        } else if (selecaoPersonagem == 3) {
            if (selecaoAtaque == 1){
                IO.println(arqueiro.getNome()+ " atacou " +mago.getNome());
            } else if (selecaoAtaque == 2){
                IO.println(arqueiro.getNome()+ " atacou " +guerreiro.getNome());
            }
        }
    }
}