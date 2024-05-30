package portfolio;

import java.util.ArrayList;

public class Portfolio {
    Wallet wallet;


    public Portfolio(double balance) {
        this.wallet = new Wallet(balance);
    }

    public void buyCryptocurrency(CryptoCurrency currency, double quantity, double price) {
        double sum = quantity * price;
        if (wallet.getBalance999() >= sum) {
            wallet.setBalance999(wallet.getBalance999() - sum);
            Transaction t = new Transaction(TransactionEnumType.BUY, currency, quantity, price);
            wallet.addTransaction(t);
        } else {
            System.out.println("No money");
        }
    }

    public void sellCryptocurrency(CryptoCurrency currency, double quantity, double price) {
        Transaction t = new Transaction(TransactionEnumType.SELL, currency, quantity, price);
        double sum = quantity * price;
        wallet.setBalance999(wallet.getBalance999() + sum);
        wallet.addTransaction(t);
    }

    public double getCoinQuantity(CryptoCurrency currency) {
        int i = 0;
        double quntity = 0;
        while (wallet.getTransaction(i) != null) {
            Transaction t = wallet.getTransaction(i);
            if (t.getTransactionType() == TransactionEnumType.BUY && t.getCryptoCurrency() == currency) {
                quntity = quntity + t.getTransactionQuantity();

            } else if (t.getTransactionType() == TransactionEnumType.SELL && t.getCryptoCurrency() == currency) {
                quntity = quntity - t.getTransactionQuantity();
            }
            i++;
        }
        return quntity;
    }
}
