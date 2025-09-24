package props;

import uwcse.graphics.GWindow;
import uwcse.graphics.Oval;
import uwcse.graphics.Polygon;

import java.awt.*;

public class Mill extends Thread{
    public Mill(GWindow window) throws InterruptedException {
        this.window = window;
        setShadow();
        setMillBottom();
        setMillTop();
        setWheel();
    }

    private void setMillBottom(){
        millBottom.addPoint(270,304);
        millBottom.addPoint(312,322);
        millBottom.addPoint(388,322);
        millBottom.addPoint(420,304);
        millBottom.addPoint(390,124);
        millBottom.addPoint(306,124);

        millBottomDark.addPoint(306,124);
        millBottomDark.addPoint(270,304);
        millBottomDark.addPoint(312,322);
        millBottomDark.addPoint(328,124);

        millBottom.addTo(window);
        millBottomDark.addTo(window);
    }

    private void setMillTop(){
        millTop.addPoint(292,124);
        millTop.addPoint(401,124);
        millTop.addPoint(359,49);
        millTop.addPoint(334,49);

        millTop.addTo(window);
    }

    private void setWheel(){
        wheel.addTo(window);
    }

    private void setShadow(){
        shadow.addPoint(420,304);
        shadow.addPoint(331,380);
        shadow.addPoint(270,304);

        shadow.addTo(window);
    }

    public void moveBlades() throws InterruptedException {
        int pivotX = 347;
        int pivotY = 87;
        blade1.addPoint(372,80);
        blade1.addPoint(372, 102);
        blade1.addPoint(440,112);
        blade1.addPoint(440, 70);

        blade2.addPoint(372,80);
        blade2.addPoint(372, 102);
        blade2.addPoint(440,112);
        blade2.addPoint(440, 70);

        blade3.addPoint(372,80);
        blade3.addPoint(372, 102);
        blade3.addPoint(440,112);
        blade3.addPoint(440, 70);

        blade4.addPoint(372,80);
        blade4.addPoint(372, 102);
        blade4.addPoint(440,112);
        blade4.addPoint(440, 70);

        blade1.addTo(window);
        blade2.addTo(window);
        blade2.rotateAround(pivotX,pivotY,90);
        blade3.addTo(window);
        blade3.rotateAround(pivotX,pivotY,180);
        blade4.addTo(window);
        blade4.rotateAround(pivotX,pivotY,270);

        while (true){
            blade1.rotateAround(pivotX,pivotY,2);
            blade2.rotateAround(pivotX,pivotY,2);
            blade3.rotateAround(pivotX,pivotY,2);
            blade4.rotateAround(pivotX,pivotY,2);
            Thread.sleep(20);
        }
    }

    public void run(){
        try {
            moveBlades();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private final GWindow window;

    private final Color millBottomColor = new Color(184, 111, 80);
    private final Color millBottomDarkColor = new Color(138,83,59);
    private final Polygon millBottom = new Polygon(millBottomColor, true);
    private final Polygon millBottomDark = new Polygon(millBottomDarkColor, true);

    private final Color millTopColor = new Color(115,62,57);
    private final Polygon millTop = new Polygon(millTopColor, true);

    private final Color wheelColor = new Color(90,105,136);
    private final Oval wheel = new Oval(347-15,87-15,30,30,wheelColor,true);

    private final Color bladesColor = new Color(62, 39,49);

    private final Polygon blade1 = new Polygon(bladesColor, true);

    private final Polygon blade2 = new Polygon(bladesColor, true);
    private final Polygon blade3 = new Polygon(bladesColor, true);
    public final Polygon blade4 = new Polygon(bladesColor, true);

    private final Color shadowColor = new Color(24,20,37,100);
    private final Polygon shadow = new Polygon(shadowColor, true);
}
