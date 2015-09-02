package com.thoughtworks.tddintro.accountbalance;

import com.thoughtworks.tddintro.Account.Account;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    private Account account = new Account(100);

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

        assertThat(account.deposit(50), is(150));

    }

    @Test
    //@Ignore
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

        assertThat(account.withdraw(50), is(50));
    }

    @Test
    //@Ignore
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

        Account overdrawnAccount = new Account(50);
        assertThat(overdrawnAccount.withdraw(100), is(50));
    }
}
