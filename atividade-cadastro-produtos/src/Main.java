import javax.swing.*;

void main() {
    JFrame janela = new JFrame("Janela");
    // Criando uma nova janela

    janela.setSize(600,900);
    // tamanho da janela
    janela.setLayout(null);
    // desativa o layout automatico

    JLabel labelNome = new JLabel("Nome do Produto:");
    // texto informando qual sera o preenchimento do input (nome)
    labelNome.setBounds(20, 10, 150, 40);
    // tamanho e posicionamento do texto
    JTextField inputNome = new JTextField();
    // campo de texto para o nome do produto
    inputNome.setBounds(20, 40, 150, 40);
    // tamanho e posicionamento do campo de texto

    JLabel labelPreco = new JLabel("Preço do Produto");
    // texto informando qual sera o preenchimento do input (preco)
    labelPreco.setBounds(20, 70, 150, 40);
    // tamanho e posicionamento do texto
    JTextField inputPreco = new JTextField();
    // campo de texto para o preco do produto
    inputPreco.setBounds(20, 100, 150, 40);
    // tamanho e posicionamento do campo de texto

    JLabel labelQuant = new JLabel("Quantidade:");
    // texto informando qual sera o preenchimento do input (quantidade)
    labelQuant.setBounds(20, 130, 150, 40);
    // tamanho e posicionamento do texto
    JTextField inputQuant = new JTextField();
    // campo de texto para a quantidade do produto
    inputQuant.setBounds(20, 160, 150, 40);
    // tamanho e posicionamento do campo de texto

    JButton botaoCadastro = new JButton("Cadastrar");
    // cria um botao com um texto dentro
    botaoCadastro.setBounds(20, 220, 150, 40);
    // tamanho e posicionamento do botaoCadastro

    JButton botaoReset = new JButton("Limpar");
    // cria um botao com um texto dentro
    botaoReset.setBounds(20, 280, 150, 40);
    // tamanho e posicionamento do botaoReset

    JLabel labelInfo = new JLabel("Informações do Produto:");
    // texto informando o conteúdo do campo de texto
    labelInfo.setBounds(180, 10, 150, 40);
    // tamaho e posicionamento da labelInfo
    JTextArea infoProduto = new JTextArea();
    // cria um campo de texto
    infoProduto.setBounds(180, 40, 400, 280);
    // tamaho e posicionamento do infoProduto

    botaoCadastro.addActionListener(e -> {

        if (inputNome.getText().isEmpty() ||
                inputPreco.getText().isEmpty() ||
                inputQuant.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos de preenchimento vazios!");
        } else if (Double.valueOf(inputPreco.getText()) < 0) {
            JOptionPane.showMessageDialog(null,
                    "O preço do produto não pode ser inferior a R$ 0,00");
        } else if (Integer.valueOf(inputQuant.getText()) < 0) {
            JOptionPane.showMessageDialog(null,
                    "A quantidade do produto não pode ser inferior 0");
        } else {
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            double preco = Double.parseDouble(inputPreco.getText());
            int quantidade = Integer.parseInt(inputQuant.getText());

            infoProduto.setText("Nome: " +inputNome.getText()+
                    "\nPreço: R$ " +inputPreco.getText()+
                    "\nQuantidade: " +inputQuant.getText()+
                    "\nValor total em estoque: R$ " +preco*quantidade);
        }
    });

    botaoReset.addActionListener(e -> {
        inputNome.setText("");
        inputPreco.setText("");
        inputQuant.setText("");
        infoProduto.setText("");
    });

    janela.add(labelNome); // adiciona labelNome à janela
    janela.add(inputNome); // adiciona inputNome à janela
    janela.add(labelPreco); // adiciona labelPreco à janela
    janela.add(inputPreco); // adiciona inputNome à janela
    janela.add(labelQuant); // adiciona labelQuant à janela
    janela.add(inputQuant); // adiciona inputNome à janela
    janela.add(botaoCadastro); // adiciona botaoCadastro à janela
    janela.add(botaoReset); // adiciona botaoReset à janela
    janela.add(infoProduto); // adiciona infoProduto à janela
    janela.add(labelInfo); // adiciona labelInfo à janela
    janela.setVisible(true); // torna a janela vísivel
}