package utils;

import uwcse.graphics.GWindow;
import uwcse.graphics.Rectangle;

import java.awt.*;
import java.io.IOException;

/**
 * Clase para manejar las transiciones entre escenas con texto
 *
 * @author istam
 */

public class Trans extends Images{
    /**
     * Crear una nueva transcicion
     * @param path ruta a la imagen
     * @param time tiempo de duracion de la trancicion
     * @param window ventana contenedora
     * @throws InterruptedException
     * @throws IOException
     */
    public Trans(String path, int time, GWindow window) throws InterruptedException, IOException {
        super(0,0,path);
        addTo(window);
        Thread.sleep(time);
        removeFromWindow();
    }

    //Variable para manejar el tiempo
    private int time;
}
