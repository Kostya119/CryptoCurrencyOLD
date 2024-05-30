package portfolio;

public class Tests {
    public void createPortfolio() {
        Portfolio portfolio = new Portfolio(50000.0);
        if(portfolio == null){
            System.out.println("Test failure! - createPortfolio");
        }else {
            System.out.println("OK");
        }
    }

    public void createWallet() {
        Wallet wallet = new Wallet(1000.0);
        if (wallet == null){
            System.out.println("Test failure! - createPortfolio");
        }else {
            System.out.println("OK");
        }
    }
}
