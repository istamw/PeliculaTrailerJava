package utils;

import uwcse.graphics.GWindow;
import uwcse.graphics.ImageShape;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Images {
    public Images(int x, int y, String path) throws IOException {
        try {
            img = ImageIO.read(Objects.requireNonNull(this.getClass().getClassLoader().getResource(path)));
            this.image = new ImageShape(img, x, y);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void addTo(GWindow window){
        image.addTo(window);
    }

    public void setImage(String path){
        try {
            img = ImageIO.read(Objects.requireNonNull(this.getClass().getClassLoader().getResource(path)));
            image.setImage(img);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private Image img;
    private ImageShape image;
}
