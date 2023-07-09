package implementations;

import abstractions.SmartphonesCondition;

public class Androrid extends SmartphonesCondition {

    public Androrid(boolean simCard, int cardBalance) {
        super(simCard, cardBalance);
    }

    @Override
    public String call() {
        if (getSimCard() == true && getCardBalance() > 0) {
            String x = "Making a call from Android (гудки : турулулу - турулулу)";
            return x;
        } else if(getSimCard() == true && getCardBalance() <= 0){
            String y = "Not enough funds on your balance";
            return y;
        }else if(getSimCard() == true && getCardBalance() <= 0) {
            String y = "Not enough funds on your balance";
            return y;
        }
         return "";
    }

    @Override
    public int sms() {
        return 0;
    }

    @Override
    public int internet() {
        return 0;
    }
}
