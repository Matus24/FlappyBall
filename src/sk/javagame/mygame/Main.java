package sk.javagame.mygame;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();

        obj.setBounds(0,0,800,600);
        obj.setTitle("Flappy ball");
        obj.setLocationRelativeTo(obj);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.add(gamePlay);

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
