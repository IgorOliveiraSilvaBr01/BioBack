//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Farmaceutico farmaceutico1 = new Farmaceutico();

//    Funcionario igorFarmaceutico = new Farmaceutico();
    // cria um objeto da classe Funcionario, do tipo Farmaceutico

//    Farmaceutico heitorFarmaceutico = new Funcionario();
    // não funciona, pois um objeto não pode herdar dados de uma subclasse

    Medico nicolly = new Medico();

    List<Funcionario> listFuncionarios  = new ArrayList<>();

    listFuncionarios.add(farmaceutico1);
    listFuncionarios.add(nicolly);

    farmaceutico1.setNome("Igor");
}
