package portfolio;

public class CryptoCurrency {
    private String name;
    private String symbol;

    private double price; //USDT price

    public CryptoCurrency() {
        name = "undefiend";
    }

    public CryptoCurrency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String s) {
        this.symbol = s;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public CryptoCurrency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
}
