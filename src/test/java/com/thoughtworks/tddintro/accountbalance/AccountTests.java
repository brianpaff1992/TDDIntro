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
    @Ignore
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

    }

    @Test
    @Ignore
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
