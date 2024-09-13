package lesson13;


import java.util.ArrayList;


public class Main {



    public static void main(String[] args) {



        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add("Сидоров", "7(606)137-35-49");

        phoneBook.add("Казюлькин", "7(749)468-89-02");

        phoneBook.add("Марченков", "7(111)900-21-68");

        phoneBook.add("Иванов", "7(614)223-51-32");

        phoneBook.add("Владимирович", "7(474)228-56-67");

        phoneBook.add("Иванов", "7(079)206-35-07");

        phoneBook.add("Иванов", "7(447)874-20-27");


        System.out.println("\nНомера телефонов на фамилию Сидоров:\n");

        ArrayList<String> sNumbers = phoneBook.get("Сидоров");

        for (String number : sNumbers) {

            System.out.println(number);

        }

        System.out.println("\nНомера телефонов на фамилию Казюлькин:\n");

        ArrayList<String> kNumbers = phoneBook.get("Казюлькин");

        for (String number : kNumbers) {

            System.out.println(number);


        }
        System.out.println("\nНомера телефонов на фамилию Марченков:\n");

        ArrayList<String> mNumbers = phoneBook.get("Марченков");

        for (String number : mNumbers) {

            System.out.println(number);
        }

        System.out.println("\nНомера телефонов на фамилию Иванов:\n");

        ArrayList<String> iNumbers = phoneBook.get("Иванов");

        for (String number : iNumbers) {

            System.out.println(number);
        }
        System.out.println("\nНомера телефонов на фамилию Владимирович:\n");

        ArrayList<String> vNumbers = phoneBook.get("Владимирович");

        for (String number : vNumbers) {

            System.out.println(number);
        }
    }
}

