package abstractions;


public abstract class SmartphonesCondition implements Smartphones {

    private boolean simCard;

    private double cardBalance;

    private boolean wifiConection;

    public SmartphonesCondition(boolean simCard, double cardBalance) {
        this.simCard = simCard;
        this.cardBalance = cardBalance;
    }

    public boolean getSimCard() {
        return simCard;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setSimCard(boolean simCard) {
        this.simCard = simCard;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public boolean getWifiConection() {
        return wifiConection;
    }

    public void setWifiConection(boolean wifiConection) {
        this.wifiConection = wifiConection;
    }
}


