package gb.homework.lesson1;

public class App01 {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box();
        Box box2 = new Box();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        box.putToBox(orange1);
        box.putToBox(apple2);
        box1.putToBox(apple1);
        box.putToBox(orange2);
        box1.putToBox(apple1);
        box1.putToBox(apple2);
        box2.putToBox(orange2);
        System.out.println("вес Апельсинов в ящике "+box.getWeight());
        System.out.println("вес Яблок в ящике "+box1.getWeight());
        System.out.println(box.compare(box1));
        box.intersperse(box2);
        System.out.println("вес Апельсинов в ящике "+box.getWeight());
        System.out.println("вес Апельсинов в ящике "+box2.getWeight());

    }
}
