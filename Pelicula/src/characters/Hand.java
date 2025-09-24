package characters;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Hand extends Images {
    public Hand(String path, GWindow window) throws IOException {
        super(-900, -900, path);
        addTo(window);
    }

    public void appearHand1() throws InterruptedException {
        image.moveTo(240,560);
        for (int i=0; i<85; i++){
            image.moveBy(0,-2);
            Thread.sleep(5);
        }
    }

    public void appearHand2(){

    }
}
