package characters;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

/**
 * Clase que crea una vaca
 * @author istam
 */

public class Cow extends Images {
    /**
     * Construcctor para crear una vaca
     * @param x posicion X
     * @param y posicion Y
     * @param path ruta a la IMAGEN
     * @param window ventana contenedora
     * @throws IOException
     */
    public Cow(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        image.addTo(window);
    }
}
