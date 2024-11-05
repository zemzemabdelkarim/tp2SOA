package org.example;

import org.example.service.AccountService;

public class Main {
    public static void main(String[] args) {
        System.out.println("first test convertion : ");
        System.out.println("\t 6DT = " + AccountService.convert(6)+"euros");

        System.out.println("\nsecond test create 3 accouts : ");
        System.out.println("\t" + AccountService.createAccount("zemzem"));
        System.out.println("\t" + AccountService.createAccount("abdelkarim"));
        System.out.println("\t" + AccountService.createAccount("hmed"));

        System.out.println("\nthird test list accounts : \n");
        AccountService.getAccounts();
    }
}