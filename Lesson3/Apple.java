package Lesson3;

public class Apple extends Fruit {
    public Apple(float w) {

        super(w);
    }
    @Override
    public String toString() {
        return "Яблоко весом " + this.getWeight();
    }
}
