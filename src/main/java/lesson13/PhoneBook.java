package lesson13;

import java.util.*;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneNumbers;


    public PhoneBook() {

        phoneNumbers = new HashMap<>();

    }


    public void add(String lastName, String number) {

        if (phoneNumbers.containsKey(lastName)) {

            phoneNumbers.get(lastName).add(number);

        } else {

            ArrayList<String> numbers = new ArrayList<>();

            numbers.add(number);

            phoneNumbers.put(lastName, numbers);

        }

    }


    public ArrayList<String> get(String lastName) {

        return phoneNumbers.get(lastName);

    }

}

