package com.thoughtworks.tddintro.Account;

/**
 * Created by Brian on 9/1/2015.
 */
public class Account {
    private int amount;

    public Account(int startAmount) {
        amount = startAmount;
    }

    public int deposit(int i) {
        amount = amount +i;
        return amount;
    }

    public int withdraw(int i)
    {
        if(amount < i)
        {
            return amount;
        }
        else {
            amount = amount - i;
            return amount;
        }
    }
}
