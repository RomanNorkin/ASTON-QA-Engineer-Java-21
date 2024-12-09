package lesson10;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        Cat thomas = new Cat("Томас");
        Cat rijik = new Cat("Рыжик");
        Dog dog = new Dog("Мухтар");
        barsik.distance(200);
        thomas.distance(150);
        rijik.distance(201);
        dog.distance(150);
        rijik.swim(999);
        dog.swim(11);
        barsik.count(4);
        thomas.addFood(1);
        thomas.count(7);
        rijik.count(3);
    }
}
