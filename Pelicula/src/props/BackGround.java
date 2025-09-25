package props;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

/**
 * Clase para crear objetos de tipo BackGround
 *
 * @author istam
 */

public class BackGround extends Images {

    /**
     * Construcctor del background
     * @param x posicion X
     * @param y posicion Y
     * @param path ruta a la Imagen
     * @param window ventana contenedora
     * @throws IOException
     */
    public BackGround(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        addTo(window);
    }

    /**
     * Mover el fondo con una animacion especifica
     * @throws IOException
     * @throws InterruptedException
     */
    public void move() throws IOException, InterruptedException {
        Thread move = new Thread(() -> {
            try {
                for (int i=0;i<600;i++){
                    image.moveBy(-2,0);
                    Thread.sleep(6);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        move.start();
    }
}
