package Transport.Main;

import Transport.Abstraction.Transport;

public class MainTransport {
    public static void main(String[] args) {

        //создание анонимного класса\наследника от абстрактного класса
        //но нужно переопределить (оверайд) все абстрактные методы асбтрактного класса
        Transport transport = new Transport("Passanger",2013) {
            @Override
            public int calculatePrice() {
                return 0;
            }
            @Override
            public void isFilled() {

            }

        };
    }
}