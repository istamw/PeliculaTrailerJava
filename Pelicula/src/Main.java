import props.BackGround;
import props.House;
import props.Mill;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Main {

    public static Mill mill;
    public static House house;

    public static void main(String[] args) throws IOException, InterruptedException {
        GWindow window = new GWindow("zipzobzab",800, 600);
        window.setExitOnClose();

        BackGround backGround = new BackGround( 0,0,"imgs/landscape.png", window);

        mill = new Mill(window);
        mill.start();
        house = new House(window);
    }
}