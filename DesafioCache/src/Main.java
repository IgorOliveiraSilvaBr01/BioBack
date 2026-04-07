void main() {

    List<Pessoa> listaCache = new ArrayList<>();
    List<Pessoa> listaBCD = new ArrayList<>();

    listaCache.add(new Pessoa(1, "Ana Clara", 18));
    listaCache.add(new Pessoa(2, "Igor Oliveira", 18));
    listaCache.add(new Pessoa(3, "Marcio da Silva", 50));
    listaCache.add(new Pessoa(4, "Maria Eduarda", 26));
    listaCache.add(new Pessoa(5, "Jose Silva", 76));

//    IO.println(listaCache);


    Scanner sc = new Scanner(System.in);
    int resposta;

    IO.println("Digite um ID do usuário que deseja buscar: (ex: 1, 2, 3) ");
    resposta = sc.nextInt();






}