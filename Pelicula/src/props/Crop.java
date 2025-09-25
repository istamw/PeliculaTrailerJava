package props;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

/**
 * Clase para crear el maizal
 *
 * @author istam
 */

public class Crop extends Images {
    /**
     * Construcctor para crear el maizal
     * @param x posicion X
     * @param y posicion Y
     * @param path ruta a la Imagen
     * @param window ventana contenedora
     * @throws IOException
     */
    public Crop(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        image.addTo(window);
    }
}
