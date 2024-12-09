package lesson10;

public class Bowl extends Cat {
    int catFood = 10;
    boolean saturation = false;

    public Bowl(String name) {
        super(name);
    }

    public void count(int food) {
        if (food > catFood) {
            System.out.println("Кот съел корм, но остался голодным.");
        } else {
            saturation = true;
            catFood -= food;
        }
    }

    public void addFood(int food) {
        catFood += food;
    }
}
