package Lesson6;

public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Романова Стефания Антоновна", "Инженер", "roms@mail.ru", "892312312", 55000, 41);
        employee[1] = new Employee("Голубев Леонид Даниилович", "Инженер", "leo.golub@gmail.com", "892313315", 50000, 32);
        employee[2] = new Employee("Киселев Михаил Максимович", "Менеджер", "mihakis@yandex.ru", "896317335", 35000, 43);
        employee[3] = new Employee("Новикова Татьяна Игоревна", "Замдиректор", "novtanya@yandex.ru", "892322306", 70000, 18);
        employee[4] = new Employee("Сорокин Роман Матвеевич", "Директор", "romansoroka@yendex.ru", "891312714", 95000, 21);
        for (Employee i : employee)
            if (i.getAge() > 40)
                System.out.println(i);

        Park.Attractions attraction1 = new Park.Attractions("Детский поезд", "10:00 - 18:00", 90);
        Park.Attractions attraction2 = new Park.Attractions("Колесо обозрения", "09:00 - 22:00", 150);
        Park.Attractions attraction3 = new Park.Attractions("Комната смеха", "10:00 - 18:00", 150);
        Park.Attractions attraction4 = new Park.Attractions("Карусель цепочная", "10:00 - 18:00", 90);

        System.out.println(attraction1.getName());
        System.out.println(attraction1.getTime());
        System.out.println(attraction1.getCost());
    }
}

