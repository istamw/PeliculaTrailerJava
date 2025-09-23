import props.House;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        GWindow window = new GWindow("zipzobzab",800, 600);
        window.setExitOnClose();

        House house = new House(window);
    }
}