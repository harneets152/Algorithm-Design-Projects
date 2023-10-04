// Harneet Singh
// Project 2
// 11/08/2021
import java.util.*;
import java.io.*;
public class Project2 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int sum;
        int res;
        int temp;
        int ratings[];
        int standings[];
        Scanner sc = null;
        try {
            sc = new Scanner(new File("input.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("Did you forget the input file?");
            System.exit(1);
        }
        x = sc.nextInt();
        if (x == 1) {
            System.out.println("Sum is 1");
            return;
        }
        ratings = new int[x + 1];
        standings = new int[x + 1];
        for (y = 0; y < x; y++) {
            ratings[y] = sc.nextInt();
        }
        ratings[x] = ratings[x - 1] + 1;
        res = 1;
        for (y = 0; y < x; y++) {
            if (ratings[y] < ratings[y + 1]) {
                standings[y] = res++;
            }
            else if (ratings[y] == ratings[y + 1]) {
                standings[y] = res;
            }
            else
            {
                z = y + 1;
                while (z < x - 1 && ratings[z] > ratings[z + 1]) {
                    z++;
                }
                temp = z - y + 1;
                standings[y] = Math.max(res, temp);
                res = 1;
            }
        }
        sum = 0;
        for (int results : standings) {
            sum += results;
        }
        System.out.println("Sum is " + sum);
    }
}