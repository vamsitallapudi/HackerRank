package main.interview.sorting;

import java.util.*;


public class SortingComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

    static class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    static class Checker implements Comparator<Player> {
        public int compare(Player a, Player b) {
            if (a.score> b.score) {
//                to achieve descending order, sending as -1 if score of a > score of b
                return -1;
            } else if(a.score<b.score) {
//                to achieve descending order, sending as -1 if score of a > score of b
                return 1;
            } else {
//                else ascending comparision of name of a to b
                return (a.name).compareTo(b.name);
            }
        }
    }
}