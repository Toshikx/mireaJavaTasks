package ru.mirea.ikbo_16_19.isaev;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape triangle = new Shape("triangle");
        System.out.println(triangle.toString());
    }
}
