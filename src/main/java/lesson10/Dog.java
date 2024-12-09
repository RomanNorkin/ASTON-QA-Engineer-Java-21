package lesson10;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public void distance(int dist) {
        if (dist <= 500) {
            System.out.println(name + " пробежал " + dist + " метров ");
        } else {
            System.out.println("Не может пробежать более 500 метров");
        }
    }

    public void swim(int sdist) {
        if (sdist <= 10) {
            System.out.println(name + " проплыл " + sdist + " метров ");
        } else {
            System.out.println(name + " утонул");
        }
    }
}
