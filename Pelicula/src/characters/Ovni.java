package characters;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Ovni extends Images {
    public Ovni(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        anim();
        addTo(window);
    }

    public void move() throws InterruptedException {
        Thread move = new Thread(() -> {
            try {
                Thread.sleep(2500);
                for (int i = 0; i < 350; i++) {
                    image.moveBy(-2, 0);
                    Thread.sleep(5);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        move.start();
    }

    public void anim(){
        Thread anim = new Thread(() -> {
            try {
                while (true){
                    for (int i=1; i<=2; i++){
                        setImage("imgs/ovni/ovni" + i + ".png");
                        Thread.sleep(100);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        anim.start();
    }

}
