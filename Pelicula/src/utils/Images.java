package utils;

import uwcse.graphics.GWindow;
import uwcse.graphics.ImageShape;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

/**
 * Clase que maneja la creacion de imagenes de manera más sencilla
 *
 * @author istam
 */

public class Images {
    /**
     * Crear una nueva imagen
     * @param x posicion x
     * @param y posicion y
     * @param path ruta a la Imagen
     * @throws IOException
     */
    public Images(int x, int y, String path) throws IOException {
        try {
            img = ImageIO.read(Objects.requireNonNull(this.getClass().getClassLoader().getResource(path)));
            this.image = new ImageShape(img, x, y);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Agrega la imagen a la window
     * @param window ventana contenedora
     */
    public void addTo(GWindow window){
        image.addTo(window);
    }

    /**
     * Quita a la imagen de la window
     */
    public void removeFromWindow(){
        image.removeFromWindow();
    }

    /**
     * Cambia la imagen de el ImageShape actual
     * @param path ruta nueva
     */
    public void setImage(String path){
        try {
            img = ImageIO.read(Objects.requireNonNull(this.getClass().getClassLoader().getResource(path)));
            image.setImage(img);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Obtiene la cordenada x de la imagen
     * @return coordenada x
     */
    public int getX(){
        return image.getX();
    }

    /**
     * Obtiene la cordenada y de la imagen
     * @return coordenada y
     */
    public int getY(){
        return image.getY();
    }

    //Variables de instancia
    private Image img;
    protected ImageShape image;
}
