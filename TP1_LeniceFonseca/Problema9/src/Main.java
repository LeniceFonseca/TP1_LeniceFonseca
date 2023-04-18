import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

        private static final Map<String, Integer> COLOR_VALUE = new HashMap<>();

        static {
            COLOR_VALUE.put("black", 0);
            COLOR_VALUE.put("brown", 1);
            COLOR_VALUE.put("red", 2);
            COLOR_VALUE.put("orange", 3);
            COLOR_VALUE.put("yellow", 4);
            COLOR_VALUE.put("green", 5);
            COLOR_VALUE.put("blue", 6);
            COLOR_VALUE.put("violet", 7);
            COLOR_VALUE.put("gray", 8);
            COLOR_VALUE.put("white", 9);
        }


    public static void main(String[] args) {

        String[] colors = {"red", "violet", "green", "gold"};
        double resistance = resistance(colors);
        double tolerance = tolerance(colors);
        System.out.printf("Resistor value: %.3f kΩ ±%.2f%%\n", resistance / 1000, tolerance);

    }


    private static double resistance(String[] colors) {
        int digit1 = COLOR_VALUE.get(colors[0]);
        int digit2 = COLOR_VALUE.get(colors[1]);
        int multiplier = (int) Math.pow(10, COLOR_VALUE.get(colors[2]));
        return (digit1 * 10 + digit2) * multiplier;
    }

    private static double tolerance(String[] colors) {
        String toleranceColor = colors[3];
        if (toleranceColor.equals("brown")) {
            return 1;
        } else if (toleranceColor.equals("red")) {
            return 2;
        } else if (toleranceColor.equals("orange")) {
            return 3;
        } else if (toleranceColor.equals("yellow")) {
            return 4;
        } else if (toleranceColor.equals("green")) {
            return 0.5;
        } else if (toleranceColor.equals("blue")) {
            return 0.25;
        } else if (toleranceColor.equals("violet")) {
            return 0.1;
        } else if (toleranceColor.equals("gray")) {
            return 0.05;
        } else {
            return 5;
        }
    }
}
