package portfolio;

enum TransactionEnumType {
    BUY, SELL
}

public class Transaction {
    private TransactionEnumType transactionType;
    private CryptoCurrency currency;
    private double quantity;
    private double price;

    public Transaction(TransactionEnumType transactionType, CryptoCurrency currency, double quantity, double price) {
        this.transactionType = transactionType;
        this.currency = currency;
        this.quantity = quantity;
        this.price = price;


    }
    @Override
    public String toString() {
        return "Transaction: " + transactionType + ", Cryptocurrency: " + currency.getName() +
                " (" + currency.getSymbol() + "), Quantity: " + quantity + ", Price: " + price;
    }
    public double getTransactionQuantity() {
        return quantity;
    }

    public TransactionEnumType getTransactionType() {
        return transactionType;
    }
    public CryptoCurrency getCryptoCurrency() {
        return currency;
    }
}


