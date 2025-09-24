package scenes;

import characters.Cato;
import characters.Cow;
import props.*;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Scene1 {
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

    public static void start(GWindow window) throws IOException, InterruptedException {
        backGround = new BackGround( 0,0, "imgs/backgrounds/landscape.png", window);

        crop = new Crop(0,0,"imgs/crop.png", window);
        mill = new Mill(window);
        mill.start();
        house = new House(window);
        cowPen = new CowPen(0,0,"imgs/cowpen.png", window);
        straw = new Straw(0,0,"imgs/straw.png", window);
        cow1 = new Cow(610,309,"imgs/cow/minicow.png",window);
        cow2 = new Cow(660,335,"imgs/cow/miniwoc.png",window);
        cow3 = new Cow(550,335,"imgs/cow/minicow.png",window);
        cow4 = new Cow(604,355,"imgs/cow/minicow.png",window);
        cato = new Cato(320,360,"imgs/cato/mini/cato.png", window);

        Thread.sleep(2000);
        cato.startWalking();

        Thread.sleep(1000);
        finished();
    }

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
}