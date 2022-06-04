package Practicas;

import java.util.Scanner;

public class EvenAndOddDetector {
    public static void main(String[] args) {
        long n = 0;
        int mod = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert any natural number: ");
        n = sc.nextLong();
        sc.close();
        mod = (int) (n % 2);

        switch (mod) {
            case 0:
                System.out.println("The number "+ n +" is even number");
                break;
            default :
                System.out.println("The number "+ n +" is odd number");
                break;
        }
    }
}