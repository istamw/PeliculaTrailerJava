package characters;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Cato extends Images{
    public Cato(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        addTo(window);
    }

    public void startWalking() throws IOException, InterruptedException {
        Thread animar = new Thread(() -> {
            try {
                animWalk();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        animar.start();
        walkCowPen();
    }

    public void voltearAtras(int sleep) throws InterruptedException{
        for (int i=1; i<=11; i++){
            setImage("imgs/cato/anim/cato" + i + ".png");
            Thread.sleep(sleep);
        }
    }

    public void voltearAdelante(int sleep) throws InterruptedException{
        for (int i=11; i>0; i--){
            setImage("imgs/cato/anim/cato" + i + ".png");
            Thread.sleep(sleep);
        }
    }

    private void walkCowPen() throws InterruptedException, IOException {
        isWalking = true;
        int pasos = 200;
        for (int i=0; i<pasos; i++){
            image.moveBy(1,0);
            Thread.sleep(10);
        }
        isWalking = false;
    }

    private void animWalk() throws InterruptedException {
        while (isWalking){
            for (int i=1; i<=2; i++){
                setImage("imgs/cato/mini/cato" + i + ".png");
                Thread.sleep(100);
            }
        }
        setImage("imgs/cato/mini/cato.png");
    }

    private boolean isWalking = false;
}