package task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.fillColor("Фиолетовый");
        circle.borderColor("Зелёный");
        circle.characteristics();
        System.out.println("\n");
        Rectangle rectangle = new Rectangle(8, 10);
        rectangle.fillColor("Красный");
        rectangle.borderColor("Белый");
        rectangle.characteristics();
        System.out.println("\n");
        Triangular triangular=new Triangular(5,3,5);
        triangular.fillColor("Синий");
        triangular.borderColor("Берюзовый");
        triangular.characteristics();
    }

}
