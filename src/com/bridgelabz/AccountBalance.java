package com.bridgelabz;

import java.util.Scanner;

public class AccountBalance {
    private int amount = 5000;

    int getAmount() {
        return amount;
    }

    void Debit(int amount) {
        if (amount >= this.amount) {
            System.out.println("please enter amount less than that");
            return;
        }
        this.amount = this.amount - amount;
        System.out.println("Remaining Balance is : " + this.getAmount());
    }
}

class GetBalance extends AccountBalance {
    public static void main(String[] args) {
        GetBalance get = new GetBalance();
        System.out.println("enter amount to debit from account : ");
        Scanner sc = new Scanner(System.in);
        get.Debit(sc.nextInt());

    }
}
