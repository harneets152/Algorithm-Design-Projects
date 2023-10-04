// Harneet Singh
// Project 4
// 12/13/2021
import java.util.*;
import java.io.*;
public class Project3 {
    public static void main(String[] args) {
        int x;
        int y;
        int suma;
        int sumb;
        int sumc;
        int array[];
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\Users\\hsing\\Documents\\input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Did you forget the input file?");
            System.exit(1);
        }
        x = sc.nextInt();
        array = new int[x];
        for (y = 0; y < x; y++) {
            array[y] = sc.nextInt();
        }
        sc.close();
        suma = array[0];
        sumb = 0;
        for (y = 1; y < x; y++) {
            if (suma > sumb)
                sumc = suma;
            else
                sumc = sumb;
                suma = sumb + array[y];
                sumb = sumc;
        }
            if (suma > sumb)
                System.out.println(suma);
            else
                System.out.println(sumb);
        }
    }
