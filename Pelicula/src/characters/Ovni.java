package characters;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

/**
 * Clase para crear objetos ovni
 *
 * @author istam
 */

public class Ovni extends Images {
    /**
     * Construcctor para crear un nuevo ovni
     * @param x posicion X
     * @param y posicion Y
     * @param path ruta a la imagen
     * @param window ventana contenedora
     * @throws IOException
     */
    public Ovni(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        anim();
        addTo(window);
    }

    /**
     * Mueve al ovni con su animacion principal
     * @throws InterruptedException
     */
    public void move() throws InterruptedException {
        Thread move = new Thread(() -> {
            try {
                Thread.sleep(2500);
                for (int i = 0; i < 350; i++) {
                    image.moveBy(-2, 0);
                    Thread.sleep(5);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        move.start();
    }

    /**
     * Realiza un cambio de frames para hacer una animacion con sus 2 frames
     */
    public void anim(){
        Thread anim = new Thread(() -> {
            try {
                while (true){
                    for (int i=1; i<=2; i++){
                        setImage("imgs/ovni/ovni" + i + ".png");
                        Thread.sleep(100);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        anim.start();
    }

}
