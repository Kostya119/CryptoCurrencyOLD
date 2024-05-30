package portfolio;

import java.util.ArrayList;

public class Wallet {
    private double balance;

    public Wallet(double b) {
        this.balance = b;
        this.transactionList = new ArrayList<>();
    }

    public Wallet() {
        this.balance = 0;
        this.transactionList = new ArrayList<>();
    }

    public double getBalance999() {
        return balance;
    }

    public void setBalance999(double balance999) {
        this.balance = balance999;
    }

    private ArrayList<Transaction> transactionList;

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }
    public Transaction getTransaction(int index){
       if (index < 0 || index >= transactionList.size()) {
           return null;
       }else {
           return transactionList.get(index);
       }
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }
}

