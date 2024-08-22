package Lesson6;

/*
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст
 * Конструктор класса должен заполнять эти поля при создании объекта
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name + "\n\n" +
                "Должность - " + position + "\n"
                + "Электронная почта - " + email + "\n"
                + "Телефон - " + phone + "\n"
                + "Заработная плата - " + salary + "\n"
                + "Возраст - " + age + "\n\n");
    }
}