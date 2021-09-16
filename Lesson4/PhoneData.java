package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;

//2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.

public class PhoneData {
    private HashMap<String, ArrayList<String>> hm;


    public PhoneData() {this.hm = new HashMap<>();}
    // В этот телефонный справочник с помощью метода add() можно добавлять записи,
    public void add(String key, String value) {

        ArrayList<String> tmp;
        if (this.hm.containsKey(key)) {
            tmp = this.hm.get(key);
        }
        else {
            tmp = new ArrayList<String>();
        }
        tmp.add(value);
        this.hm.put(key,tmp);
    }
    // а с помощью метода get() искать номер телефона по фамилии.
    public ArrayList<String> get(String key) {
        return this.hm.get(key);
    }

}
