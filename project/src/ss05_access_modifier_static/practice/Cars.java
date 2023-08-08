package ss05_access_modifier_static.practice;

public class Cars {
    private String name;
    private int energy;
    public static int countNumberOfCar;

    Cars(String name, int energy) {
        this.name = name;
        this.energy = energy;
        countNumberOfCar++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public static int getCountNumberOfCar() {
        return countNumberOfCar;
    }

    public static void setCountNumberOfCar(int countNumberOfCar) {
        Cars.countNumberOfCar = countNumberOfCar;
    }
}
