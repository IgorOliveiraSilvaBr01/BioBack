import javax.swing.*;

void main() {
    JFrame janela = new JFrame("Janela");

    janela.setSize(500, 300);
    janela.setLayout(null);

    JLabel labelEmail = new JLabel("Email:");
    labelEmail.setBounds(20, 10, 150, 40);

    JTextField inputEmail = new JTextField("Digite seu email");
    inputEmail.setBounds(20, 40, 150, 40);

    JLabel labelSenha = new JLabel("Senha:");
    labelSenha.setBounds(20, 70, 150, 40);

    JTextField inputSenha = new JTextField("Digite sua senha");
    inputSenha.setBounds(20, 100, 150, 40);

    JButton buttonLogin = new JButton("Fazer Login");
    buttonLogin.setBounds(20, 160, 150, 40);

    JButton buttonLimpar = new JButton("Limpar Campos");
    buttonLimpar.setBounds(20, 210, 150, 40);

    buttonLogin.addActionListener(e -> {

        if ("123456".equals(inputSenha.getText()) && "admin@senai.com".equals(inputEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
        } else if ("".equals(inputSenha.getText())) {
            JOptionPane.showMessageDialog(null, "Campos de preenchimento vazios!");
        } else if ("".equals(inputEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Campos de preenchimento vazios!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
        }
    });

    buttonLimpar.addActionListener(e -> {
        inputEmail.setText("");
        inputSenha.setText("");
        JOptionPane.showMessageDialog(null, "Campos de preenchimento resetados");
    });

    janela.add(buttonLimpar);
    janela.add(buttonLogin);
    janela.add(labelEmail);
    janela.add(inputEmail);
    janela.add(labelSenha);
    janela.add(inputSenha);
    janela.setVisible(true);
}