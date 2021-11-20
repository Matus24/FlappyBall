package sk.javagame.mygame.screens;

import sk.javagame.mygame.FileWriteRead;
import sk.javagame.mygame.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameOverScreen {

    private final BufferedImage gameOver;

    public GameOverScreen() {
        gameOver = ImageLoader.loadImage("images/GameOver.png");
    }

    public void paintGameOverScreen(Graphics2D g, int score){
        g.drawImage(gameOver,230,150,300,200,null);
        g.setPaint(Color.darkGray);
        g.setFont(new Font("Serif",Font.BOLD,27));
        g.drawString(String.valueOf(score),370,232);
        g.drawString(FileWriteRead.read("score.txt"),370,280);
    }
}
