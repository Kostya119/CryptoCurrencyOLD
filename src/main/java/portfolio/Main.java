package portfolio;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio(500000.0);

        System.out.println("Wallet balance: " + portfolio.wallet.getBalance999());

        CryptoCurrency bitcoin = new CryptoCurrency("Bitcoin", "BTC");
        portfolio.buyCryptocurrency(bitcoin, 0.5, 60000.0);
        portfolio.sellCryptocurrency(bitcoin, 0.3, 70000.0);
        System.out.println("Bitcoin Quantity: " + portfolio.getCoinQuantity(bitcoin));

        CryptoCurrency ethereum = new CryptoCurrency("Ethereum", "ETH");
        portfolio.buyCryptocurrency(ethereum, 0.5, 3000);
        portfolio.sellCryptocurrency(ethereum, 0.2, 3100);
        System.out.println("Ethereum Quantity: " + portfolio.getCoinQuantity(ethereum));

        ArrayList<Transaction> transactionList = portfolio.wallet.getTransactionList();
        System.out.println("List of transactions:");
        for (Transaction transaction : transactionList) {
            System.out.println(transaction.toString());
        }

        System.out.println("Wallet balance: " + portfolio.wallet.getBalance999());
        runTests();
    }
    public static void runTests(){
        Tests tests = new Tests();
        tests.createPortfolio();
        tests.createWallet();
    }

}

