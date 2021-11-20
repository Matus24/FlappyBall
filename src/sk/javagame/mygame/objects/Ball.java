package sk.javagame.mygame.objects;

public class Ball {

    private static final int ballPosX = 200;
    private static int ballPosY = 300;
    private static int posBallJump = 80;
    private static int flyBall = 13;
    private static int gravity = 0;
    private static int iteratorGravity = 0;
    private static int helpTapNumber = 0;


    public static void ballGravity(boolean playGame){
        if(playGame && helpTapNumber == 0) {
            ballPosY += gravity;
            iteratorGravity++;
            if(iteratorGravity % 4 == 0 && gravity < 17) {
                gravity += 1;
            }

        }
    }

    public static void ballFly(boolean spacePressed){

        if(spacePressed && helpTapNumber == 0){
                helpTapNumber = 1;
        }
        if(!spacePressed){
            helpTapNumber = 0;
        }


        if(posBallJump <= 0 && helpTapNumber == 1){
            flyBall = 13;
            posBallJump = 80;
            helpTapNumber = 2;

        }

        if(posBallJump > 0){
            if(flyBall > 2) {
                flyBall -= 1;
            }
            posBallJump -=flyBall;
            ballPosY -= flyBall;
            gravity = 0;
        }

    }

    public static int getBallPosY(){
        return ballPosY;
    }

    public static int getBallPosX(){
        return ballPosX;
    }

    public static void setBallPosY(int ballPosY){
        Ball.ballPosY = ballPosY;
    }
}
