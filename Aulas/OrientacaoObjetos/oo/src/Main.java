public class Main {
    static void main() {

        Funcionario funcionario = new Funcionario();
        // Criando um novo objeto (funcionario)

        funcionario.setNome("João");
        // Atribuindo o nome "João" ao objeto funcionario usando set

        IO.println(funcionario.getNome());
        // Exibindo o nome do objeto funcionario usando get

        funcionario.setSalario(850);
        // Atribui o valor ao objeto funcionario usando set

        IO.println(funcionario.getSalario());
        // Exibe o salario do funcionario usando set

        funcionario.setCargo("Programador Júnior");
        // Atribui o valor ao obejto funcionario usando set

        IO.println(funcionario.getCargo());
        // Exibe o cargo do funcionario usando set
    }
}
