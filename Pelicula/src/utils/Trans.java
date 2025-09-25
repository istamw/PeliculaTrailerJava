package utils;

import uwcse.graphics.GWindow;
import uwcse.graphics.Rectangle;

import java.awt.*;
import java.io.IOException;

public class Trans extends Images{
    public Trans(String path, int time, GWindow window) throws InterruptedException, IOException {
        super(0,0,path);
        addTo(window);
        Thread.sleep(time);
        removeFromWindow();
    }

    private int time;
}
