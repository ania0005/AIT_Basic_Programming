package entity;

public class BankCard {
    // тоже самое что и с Animal
    // BankCard это шаблон
    // BaseService это набор инструметнов для работы с сущностями
    public String id;
    public Double balance;

    public BankCard(String id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    private final BankCard[] arreyBankCard = new BankCard[10];


}

