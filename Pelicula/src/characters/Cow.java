package characters;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class Cow extends Images {
    public Cow(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        addTo(window);
    }
}
