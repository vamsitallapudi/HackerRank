package main.interview.hourglass_matrix;


import java.util.Scanner;

public class HourGlassMatrix {
    public static void main(String[] args) {
        int rows = 6, columns = 6;

        int[][] array = new int[rows][columns];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
        }

    }
}
