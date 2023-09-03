package org.patterns.cash;

public enum Currency {

    EURO("€"),
    USD("$"),
    UAH("GRN"),
    GBP("£");

    private String sign;

    Currency(String sign) { //у енама всегда приватний констр
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
