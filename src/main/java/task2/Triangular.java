package task2; 

public class Triangular implements Shape, Fillable, Borderlands {
    private double side1;
    private double side2;
    private double side3;
    private String incolor;
    private String outcolor;

    public Triangular(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimetr() {
        return side1 + side2 + side3;
    }

    @Override
    public double ploshad() {
        double halfPerimetr = perimetr() / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - side1) * (halfPerimetr - side2) * (halfPerimetr - side3));
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
        System.out.println("Треугольник:\nПериметр: " + perimetr() + "\nПлощадь: " + ploshad() + "\nВнутренняя заливка: " + incolor + "\nЦвет обводки: " + outcolor);
    }
}

