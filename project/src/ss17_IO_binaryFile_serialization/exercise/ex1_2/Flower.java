package ss17_IO_binaryFile_serialization.exercise.ex1_2;

import java.io.Serializable;

public class Flower implements Serializable {
    private int id;
    private String name;
    private String color;
    private String smell;
    public Flower() {

    }
    public Flower(int id, String name, String color, String smell) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.smell = smell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isSmell() {
       return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", smell=" + smell +
                '}';
    }
}
