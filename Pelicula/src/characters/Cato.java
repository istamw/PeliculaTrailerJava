package characters;

import utils.Images;

import java.io.IOException;

public class Cato extends Images {
    public Cato(int x, int y, String path) throws IOException {
        super(x, y, path);
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
}