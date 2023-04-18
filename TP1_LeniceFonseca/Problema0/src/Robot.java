public class Robot {

    private int coordX;
    private int coordY;
    private Direction direction;

    public Robot() {
        coordX = 0;
        coordY = 0;
        direction = Direction.N;
    }

    public Robot(int coordX, int coordY, Direction direction) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.direction = direction;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void turnLeft() {
        if (direction == Direction.N) {
            direction = Direction.W;
            System.out.println("Your current direction: " + direction);
        }
        else if (direction == Direction.W) {
            direction = Direction.S;
            System.out.println("Your current direction: " + direction);
        }
        else if (direction == Direction.S) {
            direction = Direction.E;
            System.out.println("Your current direction: " + direction);
        }
        else if (direction == Direction.E) {
            direction = Direction.N;
            System.out.println("Your current direction: " + direction);
        }
        else {
            System.out.printf("Invalid!");
        }
    }

    public void turnRight() {
        if (direction == Direction.N) {
            direction = Direction.E;
            System.out.println("Your current direction: " + direction);
        }
        else if (direction == Direction.E) {
            direction = Direction.S;
            System.out.println("Your current direction: " + direction);
        }
        else if (direction == Direction.S) {
            direction = Direction.W;
            System.out.println("Your current direction: " + direction);
        }
        else if (direction == Direction.W) {
            direction = Direction.N;
            System.out.println("Your current direction: " + direction);
        }
        else {
            System.out.println("Invalid!");
        }
    }

    public void move() {
        if (direction == Direction.N) {
            coordY += 1;
        }
        else if (direction == Direction.E) {
            coordX += 1;
        }
        else if (direction == Direction.S) {
            coordY -= 1;
        }
        else if (direction == Direction.W) {
            coordX -= 1;
        }
    }

    public double getLocation() {
        return Math.sqrt(Math.pow(coordX, 2) + Math.pow(coordY, 2));
    }


}
