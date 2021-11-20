package sk.javagame.mygame.objects;

import sk.javagame.mygame.FileWriteRead;

import java.awt.*;

public class Score {
    private int score = 0;

    public Score() {
    }

    public void scoreCount(int[][]column){
        for(int i = 0; i < column.length; i++) {
            if (column[i][0] < 200 && column[i][0] >197){
                score++;
            }
        }
    }

    public void paintScorePlayGame(Graphics2D g){
        g.setPaint(Color.darkGray);
        g.setFont(new Font("Serif",Font.BOLD,50));
        g.drawString(String.valueOf(score),350,50);
    }

    public void paintTopScoreMenu(Graphics2D g){
        g.setPaint(Color.darkGray);
        g.setFont(new Font("Serif",Font.BOLD,50));
        g.drawString(String.valueOf(score),350,50);
    }


    public int getScore(){
       return score;
   }
}
