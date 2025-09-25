package characters;

import utils.Images;
import utils.Music;
import uwcse.graphics.GWindow;

import java.io.IOException;

/**
 * Personaje Gato
 *
 * @author istam
 */

public class Cato extends Images{
    /**
     * Construcctor de un nuevo gato
     * @param x posicion X
     * @param y posicion Y
     * @param path ruta al IMAGE
     * @param window ventana contenedora
     * @throws IOException
     */
    public Cato(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        image.addTo(window);
    }

    /**
     * Caminar hacia el Corral de las vacas
     * @throws InterruptedException
     * @throws IOException
     */
    public void walkCowPen() throws InterruptedException, IOException {
        animWalk();
        isWalking = true;
        int pasos = 200;
        for (int i=0; i<pasos; i++){
            image.moveBy(1,0);
            Thread.sleep(10);
        }
        isWalking = false;
    }

    /**
     * Caminar hacia la casa
     * @throws InterruptedException
     * @throws IOException
     */
    public void walkHouse() throws InterruptedException, IOException {
        animWalk();
        isWalking = true;
        int pasos = 200;
        for (int i=0; i<pasos; i++){
            image.moveBy(-1,0);
            Thread.sleep(10);
        }
        isWalking = false;
    }

    /**
     * caminar hacia el maizal
     * @throws IOException
     * @throws InterruptedException
     */
    public void walkCrop() throws IOException, InterruptedException {
        animWalk();
        isWalking = true;
        for (int i=0; i<100; i++){
            image.moveBy(-1,0);
            if (i%2==0) image.moveBy(0,-1);
            Thread.sleep(10);
        }
        for (int i=0; i<100; i++){
            image.moveBy(1,0);
            if (i%2==0) image.moveBy(0,-1);
            Thread.sleep(10);
        }
        for (int i=0; i<50; i++){
            image.moveBy(0,-1);
            Thread.sleep(10);
        }
        for (int i=0; i<140; i++){
            image.moveBy(1,0);
            if (i%2==0) image.moveBy(0,-1);
            Thread.sleep(10);
        }
        for (int i=0; i<130; i++){
            image.moveBy(1,0);
            Thread.sleep(10);
        }

        isWalking = false;
    }

    /**
     * Hacer animacion de 'cuatro'
     * @throws InterruptedException
     */
    public void four() throws InterruptedException {
        boom.start();
        int dif = 15;
        image.moveBy(-dif,-dif);
        setImage("imgs/cato/mini/catoFour.png");
        Thread.sleep(1000);
        image.moveBy(dif,dif);
        setImage("imgs/cato/mini/cato.png");
        boom.finish();
    }

    /**
     * Animacion de voltear para atras
     * @param sleep tiempo de espera entre cada frame
     * @throws InterruptedException
     */
    public void voltearAtras(int sleep) throws InterruptedException{
        for (int i=1; i<=11; i++){
            setImage("imgs/cato/anim/cato" + i + ".png");
            image.moveBy(0,20);
            Thread.sleep(sleep);;
        }
    }

    /**
     * Realizar la animacion de caminado (En un hilo separado)
     * @throws IOException
     * @throws InterruptedException
     */
    private void animWalk() throws IOException, InterruptedException {
        Thread animar = new Thread(() -> {
            try {
                while (isWalking){
                    step.start();
                    for (int i=1; i<=2; i++){
                        setImage("imgs/cato/mini/cato" + i + ".png");
                        Thread.sleep(100);
                    }
                }
                step.finish();
                setImage("imgs/cato/mini/cato.png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        animar.start();
    }

    //Declaracion y inicializacion de las variables en uso
    private boolean isWalking = false;
    private Music step = new Music("step1.wav");
    Music boom = new Music("boom.wav");
}