// Harneet Singh
// Project 1
// 10/04/2021
import java.util.*;
import java.io.*;
public class Project1 {
    public static void main(String[]args) {
        int x;
        int y;
        int z;
        int result [][];
        int fill [];
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\Users\\hsing\\Documents\\input.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("Did you forget the input file?");
            System.exit(1);
        }
        x = sc.nextInt();
        result = new int[x][x];
        for(y = 0;y < x; y++) {
            fill = new int[x];
            for(z = 0;z < x; z++) {
                int a = sc.nextInt();
                fill[a-1] = z + 1;
            }
            result[y] = fill;
        }
        for(y = 0;y < x; y++) {
            for(z = 0;z < x; z++) {
                System.out.print(result[y][z]+"\t");
            }
            System.out.println(" ");
        }
    }
}