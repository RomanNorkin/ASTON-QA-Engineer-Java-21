package task2;

public class Rectangle implements Shape, Fillable, Borderlands {
    private double width;
    private double height;
    private String incolor;
    private String outcolor; 

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimetr() {
        return 2 * (width + height);
    }

    @Override
    public double ploshad() {
        return width * height;
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
        System.out.println("Прямоугольник:\nПериметр: " + perimetr() + "\nПлощадь: " + ploshad() + "\nВнутренняя заливка: " + incolor + "\nЦвет обводки: " + outcolor);
    }
}

