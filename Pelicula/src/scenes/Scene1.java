package scenes;

import characters.Cato;
import characters.Cow;
import props.*;
import utils.Music;
import utils.Trans;
import uwcse.graphics.GWindow;

import java.io.IOException;

/**
 * Escena 1 de el trailer
 *
 * @author istam
 */

public class Scene1 {
    /**
     * Metodo principal en el que se ejecuta la escena al ser llamada
     * @param window ventana contenedora
     * @throws IOException
     * @throws InterruptedException
     */
    public static void start(GWindow window) throws IOException, InterruptedException {
        Music init = new Music("init.wav");
        init.start();
        new Trans("imgs/trans/init.png",2500,window);
        init.finish();
        backGround = new BackGround( 0,0, "imgs/backgrounds/landscape.png", window);
        Music ambient = new Music("ambient.wav");
        ambient.start();

        crop = new Crop(0,0, "imgs/crop.png", window);
        mill = new Mill(window,20);
        mill.start();
        house = new House(window);
        cowPen = new CowPen(0,0, "imgs/cowpen.png", window);
        straw = new Straw(0,0, "imgs/straw.png", window);
        cow1 = new Cow(610,309, "imgs/cow/miniCow.png",window);
        cow2 = new Cow(660,335, "imgs/cow/miniwoc.png",window);
        cow3 = new Cow(550,335, "imgs/cow/miniCow.png",window);
        cow4 = new Cow(604,355, "imgs/cow/miniCow.png",window);
        cato = new Cato(320,360, "imgs/cato/mini/cato.png", window);

        Thread.sleep(500);
        cato.walkCowPen();

        Thread.sleep(1000);
        ambient.finish();
        finished();
    }

    /**
     * Limpiar la ventana cuando la escena finalice
     */
    private static void finished(){
        backGround.removeFromWindow();
        crop.removeFromWindow();
        mill.removeFromWindow();
        house.removeFromWindow();
        cowPen.removeFromWindow();
        straw.removeFromWindow();
        cow1.removeFromWindow();
        cow2.removeFromWindow();
        cow3.removeFromWindow();
        cow4.removeFromWindow();
        cato.removeFromWindow();
    }

    //declaracion de las variables en uso por la escena
    private static BackGround backGround;
    private static Crop crop;
    private static Mill mill;
    private static House house;
    private static CowPen cowPen;
    private static Straw straw;
    private static Cow cow1;
    private static Cow cow2;
    private static Cow cow3;
    private static Cow cow4;
    private static Cato cato;
}