package Lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {


// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

    public static void main(String args[]) {
        PhoneData hm = new PhoneData();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String secondName = in.nextLine();

        hm.add("Сидоров", "111-111-11-11");
        hm.add("Петров", "222-222-22-22");
        hm.add("Сидоров", "333-333-33-33");
        hm.add("Федоров", "444-444-44-44");
        hm.add("Федоров", "555-555-55-55");


        System.out.println("Абонент(ы) по фамилии " + secondName + ", контакты: " + hm.get(secondName));
    }
}
