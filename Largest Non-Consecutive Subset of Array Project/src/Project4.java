// Harneet Singh
// Project 4
// 12/13/2021
// Note: This is the same file I had mistakenly turned in for Project 3. You probably already know this based off the
// Note cont: comment I left on my Project 3 submission.
import java.util.*;
import java.io.*;
public class Project4 {
    public static void main(String[] args) {
        int x;
        int y;
        int suma;
        int sumb;
        int sumc;
        int array[];
        Scanner sc = null;
        try {
            sc = new Scanner(new File("input.txt")); //This should work since I had my own directory inserted which was "C:\\Users\\hsing\\Documents\\input.txt" however with all these projects including project 0 you had told us not to insert the directory which is why I only have input.txt here
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
