import characters.Cato;
import utils.*;

import uwcse.graphics.GWindow;
import uwcse.graphics.PolyShape;
import uwcse.graphics.Polygon;

import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        GWindow window = new GWindow(800, 600);
        Cato cato = new Cato(80,200,"imgs/cato/cato.png");
        Polygon pol = new Polygon(new Color(255,0,68,80),true);

        pol.addPoint(0,0);
        pol.addPoint(800,0);
        pol.addPoint(800,600);
        pol.addPoint(0,600);

        cato.addTo(window);
        pol.addTo(window);
        cato.voltearAtras(25);
        cato.voltearAdelante(25);

        while (true) {
            pol.rotateAround(400,300,4);
            Thread.sleep(2);
        }
    }
}