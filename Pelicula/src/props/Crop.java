package props;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Crop extends Images {
    public Crop(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        image.addTo(window);
    }
}
