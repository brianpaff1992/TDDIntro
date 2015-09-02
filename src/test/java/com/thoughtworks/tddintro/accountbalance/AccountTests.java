package com.thoughtworks.tddintro.accountbalance;

import com.thoughtworks.tddintro.Account.Account;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    private Account account = new Account();

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

        assertThat(account.deposit(5), is(5));

    }

    @Test
    //@Ignore
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

        account.deposit(5);
        assertThat(account.withdraw(2), is(3));
    }

    @Test
    //@Ignore
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

        account.deposit(3);
        assertThat(account.withdraw(5), is(3));
    }
}
