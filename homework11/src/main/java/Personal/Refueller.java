package Personal;

import Transport.Abstraction.Transport;

public class Refueller {

    public void fill(Transport transport){ //сюда приходят все наследники с транспорта
        transport.isFilled();
    }
}
