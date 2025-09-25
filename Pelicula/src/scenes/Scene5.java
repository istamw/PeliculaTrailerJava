package scenes;

import characters.Cato;
import characters.Cow;
import props.*;
import utils.Images;
import utils.Music;
import utils.Rain;
import uwcse.graphics.GWindow;

import java.io.IOException;

/**
 * Escena 5 de el trailer
 *
 * @author istam
 */

public class Scene5 {
    /**
     * Metodo principal en el que se ejecuta la escena al ser llamada
     * @param window ventana contenedora
     * @throws IOException
     * @throws InterruptedException
     */
    public static void start(GWindow window) throws IOException, InterruptedException {
        Music night = new Music("rain2.wav");
        night.start();
        backGround = new BackGround( 0,0, "imgs/backgrounds/landscapeNight.png", window);
        Images whats = new Images(440, 160, "imgs/wtf.png");

        crop = new Crop(0,0, "imgs/crop.png", window);
        mill = new Mill(window,5);
        mill.start();
        house = new House(window);
        cowPen = new CowPen(0,0, "imgs/cowpen.png", window);
        straw = new Straw(0,0, "imgs/straw.png", window);
        cow1 = new Cow(610,309, "imgs/cow/minicow.png",window);
        cow2 = new Cow(660,335, "imgs/cow/miniwoc.png",window);
        cow4 = new Cow(604,355, "imgs/cow/minicow.png",window);
        cato = new Cato(320,360, "imgs/cato/mini/cato.png", window);
        rain = new Rain(0,0,window);
        rain.start();

        Thread.sleep(500);
        cato.walkCowPen();
        Thread.sleep(800);
        whats.addTo(window);
        cato.four();
        whats.removeFromWindow();
        cato.walkCrop();
        Thread.sleep(1000);
        night.finish();
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
        cow4.removeFromWindow();
        cato.removeFromWindow();
        rain.removeFromWindow();
    }

    //declaracion de las variables en uso por la escena
    private static BackGround backGround;
    private static Rain rain;
    private static Crop crop;
    private static Mill mill;
    private static House house;
    private static CowPen cowPen;
    private static Straw straw;
    private static Cow cow1;
    private static Cow cow2;
    private static Cow cow4;
    private static Cato cato;
}
