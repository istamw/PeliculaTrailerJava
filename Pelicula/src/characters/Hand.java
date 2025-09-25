package characters;

import utils.Images;
import utils.Music;
import uwcse.graphics.GWindow;

import java.io.IOException;

/**
 * Clase que crea una mano
 *
 * @author istam
 */

public class Hand extends Images {
    /**
     * Construcctor para crear una mano nueva
     * @param path ruta a la IMAGEN
     * @param window ventana contenedora
     * @throws IOException
     */
    public Hand(String path, GWindow window) throws IOException {
        super(-900, -900, path);
        addTo(window);
    }

    /**
     * Realizar la animacion de aparecer la mano 1
     * @throws InterruptedException
     */
    public void appearHand1() throws InterruptedException {
        image.moveTo(240,560);
        for (int i=0; i<85; i++){
            image.moveBy(0,-2);
            Thread.sleep(5);
        }
        click.start();
    }

    /**
     * Realizar la animacion de aparecer la mano 2
     * @throws InterruptedException
     */
    public void appearHand2() throws InterruptedException {
        image.moveTo(800,332);
        for (int i=0; i<150; i++){
            image.moveBy(-2,0);
            Thread.sleep(5);
        }
        click.start();
    }

    /**
     * Realizar la animacion de aparecer la mano 3
     * @throws InterruptedException
     */
    public void appearHand3() throws InterruptedException {
        image.moveTo(-300,-300);
        for (int i=0; i<100; i++){
            image.moveBy(2,2);
            Thread.sleep(5);
        }
        click.start();
    }

    /**
     * Realizar la animacion de aparecer la mano 4
     * @throws InterruptedException
     */
    public void appearHand4() throws InterruptedException {
        image.moveTo(800,-130);
        for (int i=0; i<110; i++){
            image.moveBy(-2,0);
            Thread.sleep(5);
        }
        click.start();
    }

    //Declarar y inicializar las variables en uso
    private Music click=click = new Music("click.wav");;
}
