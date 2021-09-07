package Lesson3;

import java.util.ArrayList;

public class MyBox<T extends Fruit> {
    private ArrayList<T> obj;
    //private float box_weight;

    public MyBox() {
        this.obj = new ArrayList<>();
    }

    public void add(T... element) {
        for (int i=0; i < element.length; i++) {
           // if (element[i].getClass() instanceof Apple && this.obj.getClass().getName()) {
                this.obj.add(element[i]);
         //   }
/*
            else
            {
                System.out.println("Нельзя положить " + element[i].getClass().getName() + " в коробку с " + this.getClass().getName());
            }
*/
        }
    }

    public void del(T element) {
        this.obj.remove(element);
    }

    public void getElements() {
        this.obj.forEach(el -> System.out.println(el.toString()));
    }
    //Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
// вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    public float getWeight() {
        float sum = 0;
        for (int i = 0; i < obj.size(); i++)
            sum += obj.get(i).getWeight();
        return sum;
    }

    //Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
// которую подадут в compare() в качестве параметра. true – если их массы равны,
// false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;

    public boolean compare(MyBox b) {
        return this.getWeight() == b.getWeight();
    }

    //Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
// которые были в первой;
//Не забываем про метод добавления фрукта в коробку.

    public void takeBox(MyBox b) {
        if(this.getClass() == b.getClass()) {
            for(int i = 0; i <b.obj.size(); i++) this.obj.add(this.obj.size(), (T) b.obj.get(i));
            b.obj.clear();
        }
        else System.out.println("Нельзя добавить " + b.getClass().getName() + " в коробку с " + this.getClass().getName());
    }

}
