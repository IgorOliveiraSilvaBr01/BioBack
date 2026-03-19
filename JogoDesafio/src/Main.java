void main() { // Instanciando Objetos
    Mago mago = new Mago("Davy Jones", 100, 40, 5);

    Arqueiro arqueiro = new Arqueiro("Alanzoka", 100, 20, 10);

    Guerreiro guerreiro = new Guerreiro("BRKsEDU", 100, 30, 20);

    // Sistema de seleção de personagens e Seleção de ataque (qual personagem atacar)

    while (mago.getVida() > 0 && guerreiro.getVida() > 0 && arqueiro.getVida() > 0) {
        int selecaoPersonagem;
        IO.println();
        Scanner sc1 = new Scanner(System.in);
        IO.println("Selecione um personagem:");
        IO.println(" 1 - Mago | 2 - Guerreiro | 3 - Arqueiro");
        selecaoPersonagem = sc1.nextInt();

        int selecaoAtaque;
        IO.println();
        Scanner sc2 = new Scanner(System.in);
        IO.println("Selecione um personagem para atacar:");
        IO.println(" 1 - Mago | 2 - Guerreiro | 3 - Arqueiro");
        selecaoAtaque = sc2.nextInt();

        // Sistema de seleção de ações (ataque normal, habilidade ou mostrar status)
        // 1 - ataque normal / 2 - habilidade / 3 - mostrar status

        int selecaoAcao;
        IO.println();
        Scanner sc3 = new Scanner(System.in);
        IO.println("Qual ação executar:");
        IO.println("1 - Ataque Normal | 2 - Habilidade Especial | 3 - Mostrar Status");
        selecaoAcao = sc3.nextInt();

        // Sessão de Ações
        if (selecaoAcao == 1) { // ataque normal
            if (selecaoPersonagem == 1) {
                if (selecaoAtaque == 2) {
                    mago.atacar(guerreiro);
                } else if (selecaoAtaque == 3) {
                    mago.atacar(arqueiro);
                }
            } else if (selecaoPersonagem == 2) {
                if (selecaoAtaque == 1) {
                    guerreiro.atacar(mago);
                } else if (selecaoAtaque == 3) {
                    guerreiro.atacar(arqueiro);
                }
            } else if (selecaoPersonagem == 3) {
                if (selecaoAtaque == 1) {
                    arqueiro.atacar(mago);
                } else if (selecaoAtaque == 2) {
                    arqueiro.atacar(guerreiro);
                }
            }
        } else if (selecaoAcao == 2) { // habilidade especial
            if (selecaoPersonagem == 1) {
                if (selecaoAtaque == 2) {
                    mago.lancarMagia(guerreiro);
                } else if (selecaoAtaque == 3) {
                    mago.lancarMagia(arqueiro);
                }
            } else if (selecaoPersonagem == 2) {
                if (selecaoAtaque == 1) {
                    guerreiro.ataquePesado(mago);
                } else if (selecaoAtaque == 3) {
                    guerreiro.ataquePesado(arqueiro);
                }

            } else if (selecaoPersonagem == 3) {
                if (selecaoAtaque == 1) {
                    arqueiro.disparoPreciso(mago);
                } else if (selecaoAtaque == 2) {
                    arqueiro.disparoPreciso(guerreiro);
                }
            }
        } else if (selecaoAcao == 3) { // mostrar status
            if (selecaoPersonagem == 1) {
                mago.mostrarStatus();
            } else if (selecaoPersonagem == 2) {
                guerreiro.mostrarStatus();
            } else if (selecaoPersonagem == 3) {
                arqueiro.mostrarStatus();
            }
        }

        if (mago.getVida() <= 0) { // Mostra quem perdeu a batalha após a vida de um personagem zerar
            IO.println();
            IO.println("---- FIM DA BATALHA ----");
            IO.println(mago.getNome() + " Perdeu!!");
        } else if (guerreiro.getVida() <= 0) {
            IO.println();
            IO.println("---- FIM DA BATALHA ----");
            IO.println(guerreiro.getNome() + " Perdeu!!");
        } else if (arqueiro.getVida() <= 0) {
            IO.println();
            IO.println("---- FIM DA BATALHA ----");
            IO.println(arqueiro.getNome() + " Perdeu!!");
        }
    }

    // Sistema de Ranking com base na vida dos personagens (quem tiver mais vida ganha, quem tiver menos vida perde)
    IO.println();
    IO.println("---- RANKING FINAL ----");

//    Personagem[] ranking = {mago, guerreiro, arqueiro};
//
//    for ( int i = 0; i < 3; i++) {
//        for (int j = i + 1; j < 3; j++) {
//            if (ranking[j].getVida() > ranking[i].getVida()) {
//                Personagem temporario = ranking[i];
//                ranking[i] = ranking[j];
//                ranking[j] = temporario;
//            }
//        }
//    }
//
//    for ( int i = 0; i < 3; i++) {
//        String status = ranking[i].getVida() > 0 ? "(Vida acima de 0)" : "(Vida zerada)";
//
//        IO.println((i + 1) + "º Lugar: " +ranking[i].getNome() + " - Vida: " +ranking[i].getVida() + " " +status);
//    }


//    if (mago.getVida() <= 0 || guerreiro.getVida() == 0 || arqueiro.getVida() == 0) {
//        if (mago.getVida() <= 0) {
//            IO.println(mago.getNome() + " 3° Lugar --- Vida: " + mago.getVida());
//        } else if (guerreiro.getVida() <= 0) {
//            IO.println(guerreiro.getNome() + " 3° Lugar --- Vida: " + guerreiro.getVida());
//        } else if (arqueiro.getVida() <= 0) {
//            IO.println(arqueiro.getNome() + " 3° Lugar --- Vida: " + arqueiro.getVida());
//        }
//    }
//
//
//    if (mago.getVida() <= 50 || guerreiro.getVida() <= 50 || arqueiro.getVida() <= 50) {
//        if (mago.getVida() <= 50) {
//            IO.println(mago.getNome() + " 2° Lugar --- Vida: " + mago.getVida());
//        } else if (guerreiro.getVida() <= 50) {
//            IO.println(guerreiro.getNome() + " 2° Lugar --- Vida: " + guerreiro.getVida());
//        } else if (arqueiro.getVida() <= 50) {
//            IO.println(arqueiro.getNome() + " 2° Lugar --- Vida: " + arqueiro.getVida());
//        }
//    }
//
//
//    if (mago.getVida() > 50 || guerreiro.getVida() > 50 || arqueiro.getVida() > 50) {
//        if (mago.getVida() > 50) {
//            IO.println(mago.getNome() + " 1° Lugar --- Vida: " + mago.getVida());
//        } else if (guerreiro.getVida() > 50) {
//            IO.println(guerreiro.getNome() + " 1° Lugar --- Vida: " + guerreiro.getVida());
//        } else if (arqueiro.getVida() > 50) {
//            IO.println(arqueiro.getNome() + " 1° Lugar --- Vida: " + arqueiro.getVida());
//        }
//    }

}