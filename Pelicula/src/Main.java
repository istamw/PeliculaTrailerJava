import props.*;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        GWindow window = new GWindow("zipzobzab",800, 600);
        window.setExitOnClose();

        BackGround backGround = new BackGround( 0,0,"imgs/landscape.png", window);

        Crop crop = new Crop(0,0,"imgs/crop.png", window);
        Mill mill = new Mill(window);
        mill.start();
        House house = new House(window);
        CowPen cowPen = new CowPen(0,0,"imgs/cowpen.png", window);
        Straw straw = new Straw(0,0,"imgs/straw.png", window);
    }
}