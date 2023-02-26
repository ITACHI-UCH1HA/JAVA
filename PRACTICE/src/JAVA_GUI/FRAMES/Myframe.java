package JAVA_GUI.FRAMES;

import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {
    Myframe(){
        this.setTitle("Tic Tac Toe");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setVisible(true);
        ImageIcon image=new ImageIcon("imaged.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255,140,0125));
    }
}
