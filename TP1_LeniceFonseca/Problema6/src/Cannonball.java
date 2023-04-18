import java.awt.*;
import java.util.ArrayList;

public class Cannonball {

    private double pX;
    private double pY;
    private double vX;
    private double vY;

    public Cannonball(int pX) {
        this.pX = pX;
        this.pY = 0;
        this.vX = 0;
        this.vY = 0;
    }

    public void move(double deltaSec) {
        double distance = vX * deltaSec;
        pX += distance;
        pY += vY * deltaSec + 0.5 * (-9.81) * deltaSec * deltaSec;
        vY += -9.81 * deltaSec;
    }

    public Point getLocation() {
        int x = (int) Math.round(pX);
        int y = (int) Math.round(pY);
        return new Point(x, y);
    }

    public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
        vX = v * Math.cos(Math.toRadians(alpha));
        vY = v * Math.sin(Math.toRadians(alpha));
        ArrayList<Point> locations = new ArrayList<>();
        while (pY >= 0) {
            move(deltaSec);
            Point location = getLocation();
            locations.add(location);
        }
        return locations;
    }
}
