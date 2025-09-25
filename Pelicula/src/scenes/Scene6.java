package scenes;

import characters.Cato;
import characters.Ovni;
import props.BackGround;
import utils.Music;
import utils.Rain;
import utils.Trans;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Scene6 {
    public static void start(GWindow window) throws IOException, InterruptedException {
        new Trans("imgs/trans/dots.png", 2000, window);

        backGround = new BackGround(0,0,"imgs/backgrounds/scene6.png",window);
        ovni = new Ovni(900,0,"imgs/ovni/ovni1.png",window);
        cato = new Cato(80,50,"imgs/cato/anim/cato1.png", window);

        rain = new Rain(0,0,window);
        rain.start();

        Music rain = new Music("rain2.wav");
        rain.start();

        Music landing = new Music("alien.wav");
        landing.start();
        Music extra = new Music("landing.wav");
        extra.start();

        Thread.sleep(1000);
        backGround.move();
        ovni.move();
        cato.voltearAtras(400);

        extra.finish();

        Thread.sleep(2500);
        landing.finish();
        rain.finish();
        finished();

        Music night = new Music("zipzopzap.wav");
        night.start();
        new Trans("imgs/trans/zipzopzap.png", 6000, window);
        night.finish();
    }

    private static void finished(){
        backGround.removeFromWindow();
        cato.removeFromWindow();
        ovni.removeFromWindow();
        rain.removeFromWindow();
    }

    private static BackGround backGround;
    private static Cato cato;
    private static Ovni ovni;
    private static Rain rain;
}
