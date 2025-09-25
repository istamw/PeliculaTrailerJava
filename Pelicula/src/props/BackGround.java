package props;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class BackGround extends Images {

    public BackGround(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        addTo(window);
    }

    public void move() throws IOException, InterruptedException {
        Thread move = new Thread(() -> {
            try {
                for (int i=0;i<600;i++){
                    image.moveBy(-2,0);
                    Thread.sleep(6);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        move.start();
    }
}
