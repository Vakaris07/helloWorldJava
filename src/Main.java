//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int balance=1000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Your balance: "+balance);
        System.out.println("Enter the amount you would like to deposit:");
        int amount=sc.nextInt();
        balance=balance+amount;
        System.out.println("Your new balance is :"+balance);

        System.out.println("Enter the amount you would like to withdraw:");
        int amount2=sc.nextInt();

         balance=balance-amount2;
        System.out.println("Your new balance is :"+balance);





        }

    }
