package scenes;

import characters.Cow;
import characters.Hand;
import props.BackGround;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Scene2 {
    public static void start(GWindow window) throws IOException, InterruptedException {
        BackGround backGround = new BackGround(0,0,"imgs/backgrounds/scene2.png", window);
        Cow cow1 = new Cow(150,176,"imgs/cow/cow.png",window);
        Cow cow2 = new Cow(400,136,"imgs/cow/cow2.png",window);
        Cow cow3 = new Cow(100,300,"imgs/cow/cow2.png",window);
        Cow cow4 = new Cow(430,300,"imgs/cow/cow.png",window);

        Thread.sleep(1000);

        Hand hand1 = new Hand("imgs/hand/hand1.png",window);
        Hand hand2 = new Hand("imgs/hand/hand1.png",window);
        Hand hand3 = new Hand("imgs/hand/hand1.png",window);
        Hand hand4 = new Hand("imgs/hand/hand1.png",window);

        hand1.appearHand1();
        hand2.appearHand2();
    }
}
