import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cannonball cannonball = new Cannonball(0);
        ArrayList<Point> locations = cannonball.shoot(20, 50, 1);

        for (Point p : locations) {
            System.out.println("Location: " + p);
        }
    }
}