package abstractions;

public abstract class SmartphonesCondition implements Smartphones {

    boolean simCard;

    int cardBalance;

    public SmartphonesCondition(boolean simCard, int cardBalance) {
        this.simCard = simCard;
        this.cardBalance = cardBalance;
    }

    public boolean getSimCard() {
        return simCard;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public void setSimCard(boolean simCard) {
        this.simCard = simCard;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }
}
