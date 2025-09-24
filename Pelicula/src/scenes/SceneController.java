package scenes;

import uwcse.graphics.GWindow;

import java.io.IOException;

public class SceneController {
    public static void start() throws IOException, InterruptedException {
        GWindow window = new GWindow("zipzipzop",800,600);
        window.setExitOnClose();

        //Scene1.start(window);
        Scene2.start(window);
    }
}
