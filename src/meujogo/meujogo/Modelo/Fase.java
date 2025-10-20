package meujogo.meujogo.Modelo;

import javax.swing.*;
import java.awt.*;

// aqui vai tudo que vai acontecer na determinada fase atual,dificuldade inimigos etc
public class Fase extends JPanel {
    private Image fundo;

    public Fase (){
        ImageIcon referencia = new ImageIcon("\\assets\\bg1.png");
        fundo = referencia.getImage();
    }

    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        g.dispose();
    }
}
