package GeekBrains_Java_QA.HomeWork_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[3];

        array[0] = 25;
        array[1] = 72;
        array[2] = 58;

        System.out.println("Массив до взаимодействия: " + Arrays.toString(array));
        swapElements(array, 0, 2);
        System.out.println("Поменяем 1й и 3й элементы массива местами: " + Arrays.toString(array));

        ArrayList<Integer> arrayList = arrToArrayList(array);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2, orange3, orange4);
        box1.add(apple3);
        box2.add(orange1);

        System.out.println(box1.compare(box2));
        if (box1.compare(box2)) {
            System.out.println("Коробки равны по весу");
        } else System.out.println("Коробки не равны по весу");

        Box<Apple> box3 = new Box<Apple>();
        box1.shift(box3);
    }

    private static void swapElements(Object[] _array, int num1, int num2) {
        Object t = _array[num1];
        _array[num1] = _array[num2];
        _array[num2] = t;
    }

    private static <T> ArrayList<T> arrToArrayList(T[] _array) {
        return new ArrayList<T>(Arrays.asList(_array));
    }
}
