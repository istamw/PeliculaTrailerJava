package props;

import utils.Images;
import uwcse.graphics.GWindow;

import java.io.IOException;

public class BackGround extends Images {

    public BackGround(int x, int y, String path, GWindow window) throws IOException {
        super(x, y, path);
        addTo(window);
    }
}
