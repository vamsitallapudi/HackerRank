package LearnJava.StaticUsages;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> itemsPrice = new ArrayList<>();
        itemsPrice.add(99);
        itemsPrice.add(150);
        itemsPrice.add(45);
        System.out.println(Util.addItemsRateFromCart(itemsPrice));
    }
}
