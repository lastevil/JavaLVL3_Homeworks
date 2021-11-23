package gb.homework.lesson1;

import java.util.ArrayList;

public class Box<F extends Fruit>{

    private ArrayList<F> arr =new ArrayList<>();

    public boolean putToBox(F fruit){
        if (arr.size()!=0 && arr.get(0).getClass().getName()!= fruit.getClass().getName()){
            System.out.println("не та коробка с фруктами");
            return false;
        }
        else {
            String className = fruit.getClass().getName().substring(fruit.getClass().getPackageName().length()+1);
            System.out.println(className+" убран в ящик");
            arr.add(fruit);
            return true;
        }
    }

    public float getWeight(){
        float sum = 0;
        if (this.arr.size()!=0){
        for (F a: this.arr) {
            sum+=a.getWeight();
        }
            return sum;
        }
        return sum;
    }

    public boolean compare(Box<? extends Fruit> o2) {
        if (this.getWeight()==o2.getWeight()){
            return true;
        }
        else{
            return false;
        }
    }

    public void intersperse(Box <? super Fruit> toBox){
        for (F a: this.arr) {
            if (!toBox.putToBox(a)) {
               return;
            }
        }
        this.arr.clear();
        System.out.println("Фрукты перемещены в ящик");
    }
}
