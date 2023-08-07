package ss4_class_object_constructor.exercise;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    int speed = SLOW;
    boolean status = false;
    double radius = 5;
    String color = "blue";


    public String getSpeed() {
        if (speed == 1) {
            return "SLOW";
        } else if (speed == 2) {
            return "MEDIUM";
        } else if (speed == 3) {
            return "FAST";
        } else {
            return "speed is invalid";
        }

    }
    private void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isStatus()) {
            return "fan is on : " + "color: " + this.getColor() + " ,radius: " + this.getRadius() + " ,speed: " + this.getSpeed();
        } else {
            return "fan is off: " + "color: " + this.getColor() + " ,radius: " + this.getRadius();
        }

    }
    public Fan() {

    }
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setStatus(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setSpeed(2);
        System.out.println(fan1);
        
        Fan fan2 = new Fan();
        fan2.setStatus(false);
        fan2.setRadius(7);
        fan2.setColor("red");
        fan2.setSpeed(5);
        System.out.println(fan2);

    }
}
