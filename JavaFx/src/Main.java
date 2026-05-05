import javax.swing.*;

void main() {

    JFrame janela = new JFrame("Exemplo Swing");
    // criando uma "telinha" (janela)

    janela.setSize(300, 200);
    // definindo uma largura e altura para a telinha

    janela.setLayout(null);
    // organiza automaticamente a posição e o tamanho dos componentes


    JButton botao = new JButton("Enviar");
    // criando um botão

    botao.setBounds(20, 20,150, 40);
    // define a posição do botao, largura e altura

    // e -> {} -- representa uma função
    JTextField input = new JTextField();
    // cria uma entrada de texto
    input.setBounds(20, 80, 150, 40);
    // definindo uma altura e tamanho para a caixa de texto de entrada

    botao.addActionListener(e -> {
        String texto = input.getText();

        JOptionPane.showMessageDialog(null, "Você digitou " +texto);
    });

    janela.add(input);
    // adiciona a caixa de entrada a janela
    janela.add(botao);
    // adiciona o botao a janela
    janela.setVisible(true);
    // defini com que a telinha apareça
}
