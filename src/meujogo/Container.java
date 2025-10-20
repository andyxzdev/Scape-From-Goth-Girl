package meujogo;

import meujogo.meujogo.Modelo.Fase;

import javax.swing.*;

// aqui é criado o mapa,os personagens etc
// aqui tbm vai ser a primeira tela que irá aparecer ao abrir o jogo
public class Container extends JFrame {
    public Container(){
        add(new Fase());
        setTitle("Meu jogo"); // texto da tela inicial
        setSize(1024,728); // define o tamanho da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha o jogo ao clicar no x
        setLocationRelativeTo(null); // null faz parecer no meio
        this.setResizable(false); // ajusta o ajuste da tela (minimizar ou maximizar)
        setVisible(true); // define que tudo isso sera visivel
    }

    public static void main(String[] args) {
        new Container();
    }
}
