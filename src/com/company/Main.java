package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numbers[] = new int[11];
    int numbersMirrored[] = new int[11];
        System.out.println("enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            numbers[i] = number;
        }
        for (int i = 10; i > 0; i--) {
            int number = numbers[i];
            numbersMirrored[i] = number;
            System.out.println(number);
        }



    }
}
