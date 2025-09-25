package scenes;

import characters.Cow;
import characters.Hand;
import props.BackGround;
import utils.Music;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Scene2 {
    private static BackGround backGround;
    private static Cow cow1;
    private static Cow cow2;
    private static Cow cow3;
    private static Cow cow4;
    private static Hand hand1;
    private static Hand hand2;
    private static Hand hand3;
    private static Hand hand4;

    public static void start(GWindow window) throws IOException, InterruptedException {
        backGround = new BackGround(0,0,"imgs/backgrounds/scene2.png", window);
        Music pop = new Music("pop.wav");
        pop.start();
        cow1 = new Cow(150,176,"imgs/cow/cow.png",window);
        cow2 = new Cow(400,136,"imgs/cow/cow2.png",window);
        cow3 = new Cow(100,300,"imgs/cow/cow2.png",window);
        cow4 = new Cow(430,300,"imgs/cow/cow.png",window);

        hand2 = new Hand("imgs/hand/hand3.png",window);
        hand1 = new Hand("imgs/hand/hand1.png",window);
        hand3 = new Hand("imgs/hand/hand4.png",window);
        hand4 = new Hand("imgs/hand/hand2.png",window);

        Thread.sleep(1000);

        hand1.appearHand1();
        Thread.sleep(500);
        hand2.appearHand2();
        new Music("moo.wav");
        Thread.sleep(500);
        hand3.appearHand3();
        Thread.sleep(500);
        hand4.appearHand4();

        Thread.sleep(2000);
        pop.finish();
        finished();
    }

    private static void finished(){
        backGround.removeFromWindow();
        cow1.removeFromWindow();
        cow2.removeFromWindow();
        cow3.removeFromWindow();
        cow4.removeFromWindow();
        hand1.removeFromWindow();
        hand2.removeFromWindow();
        hand3.removeFromWindow();
        hand4.removeFromWindow();
    }
}
