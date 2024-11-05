package org.example.service;

import org.example.assets.Account;

import java.util.ArrayList;

public class AccountService {
    private static ArrayList<Account> accounts = new ArrayList<Account>();

    public static double convert(double amount) {
        return amount * 3.5;
    }

    public static Account createAccount(String proprietary){
        accounts.add(new Account(proprietary));
        return accounts.get(accounts.size() - 1);
    }

    public static ArrayList<Account> getAccounts(){
        Account currentAccount;
        for (int i = 0; i < accounts.size(); i++) {
            currentAccount = accounts.get(i);
            System.out.println(currentAccount.toString());
        }
        return accounts;
    }
}
