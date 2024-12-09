package lesson10;

public class Cat extends Animal {
    static int catFood = 10;
    boolean saturation = false;

    public Cat(String name) {
        super(name);
        this.name = name;


    }

    public void distance(int dist) {
        if (dist <= 200) {
            System.out.println(name + " пробежал " + dist + " метров ");
        } else {
            System.out.println("Кот Не может пробежать более 200 метров");
        }
    }

    public void swim(int sdist) {
        System.out.println("Кот не умеет плавать");
    }

    public void count(int food) {
        if (food > catFood) {
            System.out.println("Не достаточно еды для кота " + name);
        } else {
            saturation = true;
            catFood -= food;

            System.out.println(name + " сытый");
        }
    }

    public void addFood(int food) {
        catFood += food;
    }
}


