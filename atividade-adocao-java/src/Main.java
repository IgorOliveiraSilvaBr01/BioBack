import javax.swing.*;
import java.sql.PreparedStatement;

void main() {
    JFrame tela = new JFrame("Tela");

    tela.setSize(300, 600);
    tela.setLayout(null);

    JLabel labelNome = new JLabel("Nome");
    labelNome.setBounds(20, 50, 150, 40);
    tela.add(labelNome);

    JTextField inputNome = new JTextField();
    inputNome.setBounds(20, 80, 250, 40);
    tela.add(inputNome);

    JLabel labelIdade = new JLabel("Idade:");
    labelIdade.setBounds(20, 110, 150, 40);
    tela.add(labelIdade);

    JTextField inputIdade = new JTextField();
    inputIdade.setBounds(20, 140, 250, 40);
    tela.add(inputIdade);

    JLabel labelTipo = new JLabel("Tipo:");
    labelTipo.setBounds(20, 170, 150, 40);
    tela.add(labelTipo);

    JComboBox<Tipo> escolhaTipo = new JComboBox(Tipo.values());
    escolhaTipo.setBounds(20, 200, 250, 40);
    tela.add(escolhaTipo);

    JLabel labelRaca = new JLabel("Raça:");
    labelRaca.setBounds(20, 230, 150, 40);
    tela.add(labelRaca);

    JTextField inputRaca = new JTextField();
    inputRaca.setBounds(20, 260, 250, 40);
    tela.add(inputRaca);

    JLabel labelEndereco = new JLabel("Endereço:");
    labelEndereco.setBounds(20, 290, 150, 40);
    tela.add(labelEndereco);

    JTextField inputEndereco = new JTextField();
    inputEndereco.setBounds(20, 320, 250, 40);
    tela.add(inputEndereco);

    JLabel labelNumero = new JLabel("Número:");
    labelNumero.setBounds(20, 350, 150, 40);
    tela.add(labelNumero);

    JTextField inputNumero = new JTextField();
    inputNumero.setBounds(20, 380, 250, 40);
    tela.add(inputNumero);

    JButton buttonEnviar = new JButton("Enviar");
    buttonEnviar.setBounds(70, 430, 150, 40);
    tela.add(buttonEnviar);


    buttonEnviar.addActionListener(e -> {
        String sql = "INSERT INTO adocao(nome, idade, tipo, raca, endereco, telefone) VALUES (?, ?, ?, ?, ?, ?)";

        String nome = inputNome.getText();
        String idade = inputIdade.getText();
        String raca = inputRaca.getText();
        String endereco = inputEndereco.getText();
        String numero = inputNumero.getText();
        Tipo tipos = (Tipo)  escolhaTipo.getSelectedItem();

        // try - tenta executar o código / catch - se o código não funcionar indica uma mensagem de erro
        try {
            // conexao com o banco
            // Connection conexao = new Conexao.conectar();
            PreparedStatement ps = Conexao.conectar().prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, idade);
            ps.setString(3, tipos.name());
            ps.setString(4, raca);
            ps.setString(5, endereco);
            ps.setString(6, numero);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário calvo com sucesso!");
            ps.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    });



    tela.setVisible(true);
}
