package scenes;

import utils.Music;
import uwcse.graphics.GWindow;
import java.io.IOException;

public class SceneController {
    public static void start() throws IOException, InterruptedException {
        GWindow window = new GWindow("zipzipzop", 800, 600);
        window.setExitOnClose();

        Scene1.start(window);
        Scene2.start(window);
        Scene3.start(window);
        Scene4.start(window);
        Scene5.start(window);
        Scene6.start(window);
        System.exit(0);
    }
}
