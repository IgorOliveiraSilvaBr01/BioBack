import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

void main() {
    JFrame tela = new JFrame("Tela");

    tela.setSize(500, 400);
    tela.setLayout(null);

    JLabel labelNome = new JLabel("Nome");
    labelNome.setBounds(20, 50, 150, 40);
    tela.add(labelNome);

    JTextField inputNome = new JTextField();
    inputNome.setBounds(20, 80, 250, 40);
    tela.add(inputNome);

    JLabel labelEmail = new JLabel("Email:");
    labelEmail.setBounds(20, 120, 150, 40);
    tela.add(labelEmail);

    JTextField inputEmail = new JTextField();
    inputEmail.setBounds(20, 150, 250, 40);
    tela.add(inputEmail);

    JButton buttonEnviar = new JButton("Enviar");
    buttonEnviar.setBounds(70, 200, 150, 40);
    tela.add(buttonEnviar);

    buttonEnviar.addActionListener(e -> {
        String sql = "INSERT INTO usuario(nome, email) VALUES (?, ?)";

        String nome = inputNome.getText();
        String email = inputEmail.getText();

        try {
            // conexao com o banco
            // Connection conexao = new Conexao.conectar();
            PreparedStatement ps = Conexao.conectar().prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, email);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário calvo com sucesso!");
            ps.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    });

    tela.setVisible(true);
}