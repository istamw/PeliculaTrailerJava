package props;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

/**
 * Clase que crea los rollos de paja de decoracion
 *
 * @author istam
 */

public class Straw extends Images {
    /**
     * Construcctor de los rollos de paja
     * @param x posicion x
     * @param y posicion y
     * @param path ruta a la imagen
     * @param window ventana contenedora
     * @throws IOException
     */
    public Straw(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        image.addTo(window);
    }
}
