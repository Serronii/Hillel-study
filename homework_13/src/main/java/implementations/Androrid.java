package implementations;

import abstractions.SmartphonesCondition;

public class Androrid extends SmartphonesCondition {

    public Androrid(boolean simCard, double cardBalance) {
        super(simCard, cardBalance);
    }

    @Override
    public String call() {
        if (getSimCard() == true && getCardBalance() > 0) {
            String x = "Making a call from Android ";
            return x;
        } else if (getSimCard() == true && getCardBalance() <= 0) {
            String y = "Not enough funds on your balance";
            return y;
        } else if (getSimCard() == false && getCardBalance() > 0) {
            String z = "Sim card slot is empty";
            return z;
        } else if (getSimCard() == false && getCardBalance() <= 0) {
            String z = "Sim card slot is empty";
            return z;
        }
        return "";
    }

    @Override
    public String sms() {
        if (getSimCard() == true && getCardBalance() >= 0.25) {
            String x = "Please enter a message and select a recipient";
            return x;
        } else if (getSimCard() == true && getCardBalance() <= 0.24) {
            String y = "Not enough funds on your balance";
            return y;
        } else if (getSimCard() == false && getCardBalance() > 0) {
            String z = "Sim card slot is empty";
            return z;
        } else if (getSimCard() == false && getCardBalance() <= 0) {
            String z = "Sim card slot is empty";
            return z;
        }
        return "";
    }

    @Override
    public String internet() {
        if (getWifiConection() == true && getSimCard() == true && getCardBalance() > 0) {
            String y = "You should select mobile or wifi connection type";
            return y;
        } else if (getWifiConection() == true && getSimCard() == true && getCardBalance() <= 0) {
            String x = "Not enough funds on your balance. Only wifi conection is available";
            return x;
        } else if (getWifiConection() == false && getSimCard() == true && getCardBalance() <= 0) {
            String z = "No wifi connections available. Not enough funds on your balance";
            return z;
        } else if (getWifiConection() == false && getSimCard() == true && getCardBalance() >= 0) {
            String q = "No wifi connections available. Only 5G connection available";
            return q;
        } else if (getWifiConection() == true && getSimCard() == false && getCardBalance() >= 0) {
            String a = "Sim card slot is empty. Only wifi conection is available";
            return a;
        } else if (getWifiConection() == true && getSimCard() == false && getCardBalance() < 0) {
            String b = "Sim card slot is empty. Only wifi conection is available";
            return b;
        } else if (getWifiConection() == false && getSimCard() == false && getCardBalance() < 0) {
            String b = "Sim card slot is empty. No wifi connections available";
            return b;
        } else if (getWifiConection() == false && getSimCard() == false && getCardBalance() >= 0) {
            String b = "Sim card slot is empty. No wifi connections available";
            return b;
        }
        return "";
    }
}