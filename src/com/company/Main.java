package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bank = new BankAccount();
        bank.deposit(20000);

        while (true){
            try {
                bank.withDraw(6000);
            } catch (LimitException e) {
                bank.withDraw(bank.getAmount());
                break;
            }
        }
    }
}
