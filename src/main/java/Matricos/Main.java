package Matricos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of Matrix");
        int dydis = scan.nextInt();
        Matrix test1 = Matrix.generaterand(dydis, dydis); //pirmoji matrica
        Matrix test2 = Matrix.generaterand(dydis, dydis); //antroji matrica
        Matrix rezult = test1.multiplier(test2); //Rezultato objektas
        System.out.println(rezult.toString()); //Rezultato spausdinimas

    }
}