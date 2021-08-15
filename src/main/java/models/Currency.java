package models;

public class Currency {
    private String amount;
    private String currency;
    private String bank;

    public Currency(String amount, String currency, String bank) {
        this.amount = amount;
        this.currency = currency;
        this.bank = bank;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getBank() {
        return bank;
    }
}
