package utils;

import uwcse.graphics.GWindow;
import uwcse.graphics.ImageShape;
import uwcse.graphics.Rectangle;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Rain extends Thread{
    public Rain(int x, int y, GWindow window){
        try {
            img = ImageIO.read(Objects.requireNonNull(this.getClass().getClassLoader().getResource("imgs/rain/rain30.png")));
            this.gif = new ImageShape(img, x, y);
            gif.addTo(window);
            gray.addTo(window);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void setImage(String path){
        try {
            img = ImageIO.read(Objects.requireNonNull(this.getClass().getClassLoader().getResource(path)));
            gif.setImage(img);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void removeFromWindow(){
        gif.removeFromWindow();
        gray.removeFromWindow();
    }

    public void run(){
        while (true) {
            for (int i=1; i<= 30; i++) {
                setImage("imgs/rain/rain" + i + ".png");
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private Image img;
    private ImageShape gif;
    private Color color = new Color(20,20,100,100);
    private Rectangle gray = new Rectangle(0,0,800,600,color,true);
}
