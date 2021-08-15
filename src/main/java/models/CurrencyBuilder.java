package models;

public class CurrencyBuilder {
    private String amount;
    private String currency;
    private String bank;


    public CurrencyBuilder setAmount(String amount){
        this.amount =amount;
        return this;
    }

    public CurrencyBuilder setCurrency(String currency){
        this.currency =currency;
        return this;
    }

    public CurrencyBuilder setBank(String bank){
        this.bank =bank;
        return this;
    }

    public Currency build(){ return new Currency(amount, currency, bank);}
}
