package Lesson3;

public class Orange extends Fruit {
    public Orange(float w) {

        super(w);
    }

    @Override
    public String toString() {
        return "Апельсин весом " + this.getWeight();
    }
}
