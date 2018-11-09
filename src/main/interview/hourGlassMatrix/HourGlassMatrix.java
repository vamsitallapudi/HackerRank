package main.interview.hourGlassMatrix;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HourGlassMatrix {
    public static void main(String[] args) {
        List<Integer> sumList = new ArrayList<>();
        int rows = 6, columns = 6;

        int[][] array = new int[rows][columns];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<4;i++) {
            for(int j=0;j<4;j++) {
               sumList.add(calculateSumOfHourGlass(array, i,j));
            }
        }
        System.out.println(Collections.max(sumList));
    }

    private static int calculateSumOfHourGlass(int[][] array, int i, int j) {
        return (array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2]);
    }
}
