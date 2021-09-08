package Lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("стол", "стул", "стол", "кресло", "кресло", "кресло", "стул", "стол", "диван", "стул", "диван", "стул", "стол"));
        System.out.println("Массив слов: " + arrayList);

// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Set<String> set = new HashSet<>();
        for (String s : arrayList)
            set.add(s);
        System.out.println("Массив уникальных слов: " + set);

// Посчитать, сколько раз встречается каждое слово.
        for (String s : set)
            System.out.println("Слово *" + s
                    + "* встречается " + Collections.frequency(arrayList, s) + " раз.");

    }
}






