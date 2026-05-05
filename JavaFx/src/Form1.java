import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Form1 {
    static void main() {

        List <Pessoa> pessoas = new ArrayList<>();

        JFrame janela = new JFrame("Janela");
        janela.setSize(500, 400);
        janela.setLayout(null);

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(20, 10, 150, 40);

        JTextField inputNome = new JTextField("Digite seu nome");
        inputNome.setBounds(20, 40, 150, 40);

        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setBounds(20, 70, 150, 40);

        JTextField inputEmail = new JTextField("Digite seu email");
        inputEmail.setBounds(20, 100, 150, 40);

        JLabel labelTelefone = new JLabel("Telefone:");
        labelTelefone.setBounds(20, 130, 150, 40);

        JTextField inputTelefone = new JTextField("Digite seu email");
        inputTelefone.setBounds(20, 160, 150, 40);

        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(20, 210, 150, 40);

        JButton botaoMostrar = new JButton("Mostrar lista");
        botaoMostrar.setBounds(20, 260, 150, 40);

        botaoEnviar.addActionListener(e -> {
            Pessoa p1 = new Pessoa(inputNome.getText(), inputEmail.getText(), inputTelefone.getText());
            pessoas.add(p1);

            JOptionPane.showMessageDialog(null, "Dados enviados para a lista!!");
        });

        botaoMostrar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Pessoas cadastradas: " +pessoas);
        });

        janela.add(labelNome);
        janela.add(inputNome);
        janela.add(labelEmail);
        janela.add(inputEmail);
        janela.add(labelTelefone);
        janela.add(inputTelefone);
        janela.add(botaoEnviar);
        janela.add(botaoMostrar);
        janela.setVisible(true);
    }

}
