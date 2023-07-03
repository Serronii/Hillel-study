package homework.Transport.Moto;

import homework.Transport.Transport;

public class Moto extends Transport {

    public int mileage;
    String bodyMoto;
    String makeMoto;

    public Moto(String type,int yearOfProduction,int mileage,String bodyMoto,String makeMoto){
        super(type, yearOfProduction);
        this.mileage = mileage;
        this.bodyMoto = bodyMoto;
        this.makeMoto = makeMoto;

    }
}
