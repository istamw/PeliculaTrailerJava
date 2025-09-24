package props;

import uwcse.graphics.GWindow;
import uwcse.graphics.Polygon;

import java.awt.*;

public class House {
    public House(GWindow window){
        this.window = window;
        setShadow();
        setRoof();
        setSideHouse();
        setFrontHouse();
        setDoor();
    }

    private void setRoof(){
        roof.addPoint(158,216);
        roof.addPoint(339,275);
        roof.addPoint(278, 319);
        roof.addPoint(250, 380);
        roof.addPoint(69,314);
        roof.addPoint(100,258);

        roofOutline.addPoint(158,216);
        roofOutline.addPoint(339,275);
        roofOutline.addPoint(278, 319);
        roofOutline.addPoint(100,258);

        roofBack.addPoint(339,275);
        roofBack.addPoint(396,304);
        roofBack.addPoint(412,340);
        roofBack.addPoint(158,216);

        roofBack.addTo(window);
        roof.addTo(window);
        roofOutline.addTo(window);
    }

    private void setFrontHouse(){
        int meno = 10;
        frontHouse.addPoint(339,275);
        frontHouse.addPoint(278, 319);
        frontHouse.addPoint(250, 380);
        frontHouse.addPoint(249,471);
        frontHouse.addPoint(412-meno,392);
        frontHouse.addPoint(412-meno,335);
        frontHouse.addPoint(396-meno,304);

        frontHouseOutline.addPoint(339,275);
        frontHouseOutline.addPoint(278, 319);
        frontHouseOutline.addPoint(250, 380);
        frontHouseOutline.addPoint(249,471);
        frontHouseOutline.addPoint(412-meno,392);
        frontHouseOutline.addPoint(412-meno,335);
        frontHouseOutline.addPoint(396-meno,304);

        frontHouse.addTo(window);
        frontHouseOutline.addTo(window);
    }

    private void setSideHouse(){
        sideHouse.addPoint(250, 380);
        sideHouse.addPoint(249,471);
        sideHouse.addPoint(75,403);
        sideHouse.addPoint(75, 312);

        sideHouse.addTo(window);
    }

    private void setDoor(){
        final int EXTRA = 5;
        door.addPoint(300,450-EXTRA);
        door.addPoint(300,390);
        door.addPoint(371,357);
        door.addPoint(371,414-EXTRA);

        doorOutline.addPoint(300,450-EXTRA);
        doorOutline.addPoint(300,390);
        doorOutline.addPoint(371,357);
        doorOutline.addPoint(371,414-EXTRA);

        door.addTo(window);
        doorOutline.addTo(window);
    }

    private void setShadow(){
        shadow.addPoint(75,403);
        shadow.addPoint(38,438);
        shadow.addPoint(211,518);
        shadow.addPoint(357, 450);
        shadow.addPoint(404,393);
        shadow.addTo(window);
    }

    public void removeFromWindow(){
        roof.removeFromWindow();
        roofOutline.removeFromWindow();
        roofBack.removeFromWindow();
        frontHouse.removeFromWindow();
        frontHouseOutline.removeFromWindow();
        sideHouse.removeFromWindow();
        door.removeFromWindow();
        doorOutline.removeFromWindow();
        shadow.removeFromWindow();
    }

    private final GWindow window;

    private final Color roofColor = new Color(115, 62,67);
    private final Color roofOutlineColor = new Color(62,39,49);
    private final Polygon roof = new Polygon(roofColor,true);
    private final Polygon roofOutline = new Polygon(roofOutlineColor, false);
    private final Polygon roofBack = new Polygon(roofColor, true);

    private final Color frontHouseColorOutline = new Color(234,212,170);
    private final Color frontHouseColor = new Color(228,59,68);
    private final Polygon frontHouse = new Polygon(frontHouseColor, true);
    private final Polygon frontHouseOutline = new Polygon(frontHouseColorOutline, false);

    private final Color sideHouseColor = new Color(162,38,51);
    private final Polygon sideHouse = new Polygon(sideHouseColor, true);

    private final Color doorColor = new Color(62,39,49);
    private final Color doorColorOutline = new Color(234,212,170);
    private final Polygon door = new Polygon(doorColor, true);
    private final Polygon doorOutline = new Polygon(doorColorOutline, false);

    private final Color shadowColor = new Color(24,20,37,100);
    private final Polygon shadow = new Polygon(shadowColor, true);
}