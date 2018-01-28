package LearnJava.StaticUsages;

import java.util.ArrayList;

public class Util {


    public static int addItemsRateFromCart(ArrayList<Integer> itemsRates){
        int totalRate = 0;
        for(int i : itemsRates){
            totalRate = totalRate + i;
        }
        return totalRate;
    }
}
