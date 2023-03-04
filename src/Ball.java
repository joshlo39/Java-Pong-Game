import  java.awt.*;
import  java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed=3;


    Ball(int x, int y, int width, int height){
        super(x,y,width,height);
        random = new Random();
        int randomxDirection = random.nextInt(2);//either 0 or 1
        if(randomxDirection == 0)
            randomxDirection--;
        setXDirection(randomxDirection*initialSpeed);


        int randomyDirection = random.nextInt(2);//either 0 or 1
        if(randomyDirection == 0)
            randomyDirection--;
        setyDirection(randomyDirection*initialSpeed);



    }

    public void setXDirection(int randomXDirection){
        xVelocity =  randomXDirection;


    }
    public void setyDirection(int randomyDirection){
        yVelocity = randomyDirection;


    }
    public void move(){
        x += xVelocity;
        y += yVelocity;


    }
    public void draw(Graphics g){
        g.setColor(Color.MAGENTA);
        g.fillOval(x,y,height,width);


    }




}
