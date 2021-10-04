package com.bridgelabz.Utility;

import java.util.Scanner;

public class bankDetails {
    Scanner scanner;
    public bankDetails(){
        scanner =new Scanner(System.in);
    }
    public int getIntValue(){
        return scanner.nextInt();
    }
    public float getFloatValue(){
        return scanner.nextFloat();
    }
    public String getString(){
        return scanner.nextLine();
    }

    public float depositOrWithdrow(String name, int account_No, float amount) {
        System.out.println("Enter your Option : \n 1. Deposit 2.Withdraw ");
        int option = getIntValue();
        if (option == 1) {
            amount = diposit(amount);
        } else if (option == 2) {
            amount = withdraw(amount);
        }
        return amount;
    }

    public void displayDetails(String name, int account_No, float amount) {
        System.out.println("Account Holder Name : "+name+"\n Account number : "+account_No);
        System.out.println("Your Balance is : " + amount);
    }

    public float diposit(float amount) {
        System.out.println("Enter amount you want to deposit : ");
        float depositAmt=getFloatValue();
        amount+=depositAmt;
        return amount;
    }

    public float withdraw(float amount) {
        System.out.println("Enter amount you want to withdraw : ");
        float withdrawAmt=getFloatValue();
        if (withdrawAmt<=amount)
                amount-=withdrawAmt;
        else
            System.out.println("Insufficient Balance !");
        return amount;
    }
}
