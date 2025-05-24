package org.example;

import java.util.Scanner;

public class Task1_Algorithm {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Task1_Algorithm obj = new Task1_Algorithm();
        obj.checkNumber();
        obj.checkName();
        obj.printMultipleOfThree();
    }

    public  void checkNumber(){
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        if(inputNumber > 7){
            System.out.println("Hello");
        }
    }
    public void checkName(){
        System.out.println("Enter a name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        if(name.equals("John")){
            System.out.println("Hello john");
        }
        else {
            System.out.println("There is no such name");
        }
    }
    public void printMultipleOfThree(){
        System.out.print("Enter array elements separated by spaces: ");
        String[] inputArray = scanner.nextLine().split(" ");
        System.out.println("Numbers that are multiples of 3:");
        for (String element : inputArray) {
                int num = Integer.parseInt(element);
                if (num % 3 == 0) {
                    System.out.println(num);
                }
        }
    }
}
