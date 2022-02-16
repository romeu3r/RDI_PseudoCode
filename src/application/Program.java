package application;

import support.Actions;
import support.FactoryActions;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Actions am = FactoryActions.Actions();
        try {
            System.out.println("Welcome to our Pseudocode, i'm glad to receive you here!");
            System.out.println("Before all, what kind of action you want make? (Chose one, please.)");
            System.out.print("[1] Show all data request? \n[2] Search order by name? \n[3] Show client most spend money? \n[4] Show client with more orders? ");
            int chose = sc.nextInt();
            if (chose == 1)
                am.printAllOrders().forEach(System.out::println);
            if (chose == 2) {
                System.out.print("Please, type your name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
