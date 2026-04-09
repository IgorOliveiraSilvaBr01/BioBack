void main() {

    List<Pessoa> listaCache = new ArrayList<>();
    List<Pessoa> listaBCD = new ArrayList<>();

    listaBCD.add(new Pessoa(1, "Ana Clara", 18));
    listaBCD.add(new Pessoa(2, "Igor Oliveira", 18));
    listaBCD.add(new Pessoa(3, "Marcio da Silva", 50));
    listaBCD.add(new Pessoa(4, "Maria Eduarda", 26));


    listaCache.add(new Pessoa(5, "Jose Silva", 50));

//    IO.println(listaCache);


    Scanner sc = new Scanner(System.in);
    int resposta;

    IO.println("Digite um ID do usuário que deseja buscar:");
    resposta = sc.nextInt();

    for (Pessoa pessoa : listaCache) {
        if (resposta == pessoa.getId()){
            IO.println("Pessoa encontrada no cache: " +pessoa);
            // Se não estiver, busque no banco
        }
    }

    for (Pessoa pessoa : listaBCD) {
        if (resposta == pessoa.getId()) {
            IO.println("Pessoa buscada no banco e adicionada ao cache: " +pessoa);
        }
    }


}