package Practicas;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert 4 numbers");
        System.out.print("N1: ");
        n1 = sc.nextInt();
        System.out.print("N2: ");
        n2 = sc.nextInt();
        System.out.print("N3: ");
        n3 = sc.nextInt();
        System.out.print("N4: ");
        n4 = sc.nextInt();
        sc.close();

        if (n1>n2 && n1>n3 && n1>n4) {
            System.out.println("n1 is the fucking dick because he has "+ n1 +" waifus");
        } else if (n2>n1 && n2>n3 && n2>n4) {
            System.out.println("n2 is the fucking dick because he has "+ n2 +" waifus");
        } else if (n3>n1 && n3>n2 && n3>n4) {
            System.out.println("n3 is the fucking dick because he has "+ n3 +" waifus");
        } else {
            System.out.println("n4 is the fucking dick because he has "+ n4 +" waifus");
        }
    }
}
