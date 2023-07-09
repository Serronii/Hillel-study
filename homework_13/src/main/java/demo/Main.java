package demo;

import implementations.Androrid;
import implementations.Iphone;

public class Main {
    public static void main(String[] args) {

        System.out.println("Android Phone");
        Androrid androrid1 = new Androrid(true, 0);

        System.out.println(androrid1.call());
        System.out.println(androrid1.sms());

        androrid1.setWifiConection(false);
        System.out.println(androrid1.internet());

        System.out.println("                       ");

        System.out.println("Iphone Phone");
        Iphone iphone = new Iphone(true,0);

        System.out.println(iphone.call());
        System.out.println(iphone.sms());

        iphone.setWifiConection(false);
        System.out.println(iphone.internet());
    }
}
