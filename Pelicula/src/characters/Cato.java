package characters;

import utils.Images;
import utils.Music;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Cato extends Images{
    public Cato(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        addTo(window);
    }

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

    public void voltearAtras(int sleep) throws InterruptedException{
        for (int i=1; i<=11; i++){
            setImage("imgs/cato/anim/cato" + i + ".png");
            image.moveBy(0,20);
            Thread.sleep(sleep);;
        }
    }

    public void voltearAdelante(int sleep) throws InterruptedException{
        for (int i=11; i>0; i--){
            setImage("imgs/cato/anim/cato" + i + ".png");
            Thread.sleep(sleep);
        }
    }

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

    private boolean isWalking = false;
    private Music step = new Music("step1.wav");
    Music boom = new Music("boom.wav");
}