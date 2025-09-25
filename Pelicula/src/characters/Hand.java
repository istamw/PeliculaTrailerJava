package characters;

import utils.Images;
import utils.Music;
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
        click.start();
    }

    public void appearHand2() throws InterruptedException {
        image.moveTo(800,332);
        for (int i=0; i<150; i++){
            image.moveBy(-2,0);
            Thread.sleep(5);
        }
        click.start();
    }

    public void appearHand3() throws InterruptedException {
        image.moveTo(-300,-300);
        for (int i=0; i<100; i++){
            image.moveBy(2,2);
            Thread.sleep(5);
        }
        click.start();
    }

    public void appearHand4() throws InterruptedException {
        image.moveTo(800,-130);
        for (int i=0; i<110; i++){
            image.moveBy(-2,0);
            Thread.sleep(5);
        }
        click.start();
    }

    private Music click=click = new Music("click.wav");;
}
