package scenes;

import props.BackGround;
import utils.Music;
import utils.Trans;
import uwcse.graphics.GWindow;
import uwcse.graphics.Rectangle;

import java.awt.*;
import java.io.IOException;

/**
 * Escena 4 de el trailer
 *
 * @author istam
 */

public class Scene4 {
    /**
     * Metodo principal en el que se ejecuta la escena al ser llamada
     * @param window ventana contenedora
     * @throws IOException
     * @throws InterruptedException
     */
    public static void start(GWindow window) throws IOException, InterruptedException {
        Music night = new Music("night.wav");
        night.start();
        new Trans("imgs/trans/night.png",2000,window);
        scene4 = new BackGround(0,0, "imgs/scene4/scene4_1.png",window);
        flash = new Rectangle(0,0,800,600,Color.white,true);

        Music rain = new Music("rain.wav");
        rain.start();
        Thread.sleep(4000);

        flashing(window);

        Thread.sleep(3000);
        rain.finish();
        finished();
    }

    /**
     * Limpiar la ventana cuando la escena finalice
     */
    private static void finished(){
        scene4.removeFromWindow();
    }

    /**
     * Metodo para crear efecto de rayo en la escena 4
     * @param window ventana contenedora
     * @throws InterruptedException
     */
    private static void flashing(GWindow window) throws InterruptedException {
        flash.addTo(window);
        Thread.sleep(100);
        flash.removeFromWindow();
        Thread.sleep(100);
        flash.addTo(window);
        Thread.sleep(1200);
        scene4.setImage("imgs/scene4/scene4_2.png");
        flash.removeFromWindow();
    }

    //declaracion de las variables en uso por la escena
    private static BackGround scene4;
    private static Rectangle flash;
}
