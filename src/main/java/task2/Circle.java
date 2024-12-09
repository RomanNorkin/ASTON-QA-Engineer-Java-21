package task2; 

public class Circle implements Shape, Fillable, Borderlands {
    private double radius;
    private String incolor;
    private String outcolor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double ploshad() {
        return Math.PI * radius * radius;
    }

    @Override
    public void fillColor(String color) {
        this.incolor = color;
    }

    @Override
    public void borderColor(String color) {
        this.outcolor = color;
    }

    public void characteristics() {
        System.out.println("Круг:\nПериметр: " + perimetr() + "\nПлощадь: " + ploshad() + "\nВнутренняя заливка: " + incolor + "\nЦвет обводки: " + outcolor);
    }
}
