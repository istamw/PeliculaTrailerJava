package utils;

import uwcse.io.Sound;
import java.io.File;

/**
 * Clase que maneja la creacion y reproduccion de musica de manera más sencilla
 *
 * @author istam
 */

public class Music {
    /**
     * Se extrae el sonido como un objeto de la clase Sound
     * @param sound Sonido
     */
    public Music(String sound){
        sonido = new Sound(this.getClass().getClassLoader().getResource("sounds" + File.separator+sound));
    }

    /**
     * Reproduce el sonido
     **/
    public void start(){
        //sonido.getClip();
        sonido.play();

    }

    /**
     * finaliza el sonido
     */
    public void finish(){
        sonido.stop();
    }

    //Se instancia el sonido
    private final Sound sonido;
}
