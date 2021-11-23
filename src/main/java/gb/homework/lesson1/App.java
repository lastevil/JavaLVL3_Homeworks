package gb.homework.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        String[] strings = new String[4];
        strings[0]= "a";
        strings[1]="1";
        ArrayList b = arraytoArrayList(strings);
        System.out.println(b);

        Object[] objects = new Object[3];
        objects[0]= b;
        objects[1]= new Object();
        objects[2] = strings;
        ArrayList res2 = arraytoArrayList(objects);
        System.out.println(res2);

        Object[] c = changePlaceOfArrayElements(objects,0,2);
        System.out.println(c[0]+","+c[1]+","+c[2]);

    }

    public static <T> T[] changePlaceOfArrayElements(T[] mass, int from, int to){
        T change;
        change=mass[from];
        mass[from]=mass[to];
        mass[to]=change;
        return mass;
    }
    public static <T> ArrayList arraytoArrayList(T[] mass){
        ArrayList a = new ArrayList();
        for (T m: mass) {
            a.add(m);
        }
        return a;
    }
}
