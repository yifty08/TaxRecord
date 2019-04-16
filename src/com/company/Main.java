package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("name: ");
        String name = scanner.nextLine();

        System.out.println("Purchase Amount: ");
        int purchaseAmount = scanner.nextInt();

        System.out.println("Tax code(pick from 0-3): ");
        int taxCode = scanner.nextInt();

        int salesTax = -1;

        if (taxCode==0){
            salesTax=0;
        } else if (taxCode==1){
            salesTax=3;
        } else if(taxCode==2){
            salesTax=5;
        } else if (taxCode==3){
            salesTax=7;
        }

        double totalAmountDue = purchaseAmount + purchaseAmount * salesTax/100;

        System.out.println("Name is: " + name + ", purchase Amount is " +
                purchaseAmount + ", sales tax is " + salesTax +
        "%, and total amount due is: " + totalAmountDue + " .");
    }
}
