package scenes;

import utils.Music;
import uwcse.graphics.GWindow;
import java.io.IOException;

/**
 * Clase que realiza el manejo y orden de ejecusión de las escenas
 *
 * @author istam
 */

public class SceneController {
    public static void start() throws IOException, InterruptedException {
        //ventana principal
        GWindow window = new GWindow("zipzipzop", 800, 600);
        window.setExitOnClose();

        //Escenas seguidas una tras otra
        Scene1.start(window);
        Scene2.start(window);
        Scene3.start(window);
        Scene4.start(window);
        Scene5.start(window);
        Scene6.start(window);
        System.exit(0);
    }
}
