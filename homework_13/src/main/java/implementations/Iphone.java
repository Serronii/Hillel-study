package implementations;

import abstractions.SmartphonesCondition;

public class Iphone extends SmartphonesCondition {

    public Iphone(boolean simCard, int cardBalance) {
        super(simCard, cardBalance);
    }

    @Override
    public String call() {
        return "x";
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
