package javahomeworkweek5;
/**
 * * Write a Java program to iterate through all elements in an array list using Iterator.
 */




import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grape");
        fruitList.add("Mango");
        fruitList.add("Kiwi");
        fruitList.add("Orange");
        fruitList.add("BlackBerry");
        fruitList.add("Strawberry");
        fruitList.add("Cherry");
        ListIterator<String> iterator = fruitList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " , ");
        }

    }
}
