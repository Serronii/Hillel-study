package Transport.Moto;

import Transport.Abstraction.Transport;

public class Moto extends Transport {

    private int mileage;
    private String bodyMoto;
    private String makeMoto;


    public Moto(String type, int yearOfProduction, int mileage, String bodyMoto, String makeMoto) {
        super(type, yearOfProduction);
        this.mileage = mileage;
        this.bodyMoto = bodyMoto;
        setMakeMoto(makeMoto);
    }

    public int getMileage(){
        System.out.println("Mileage - " + this.mileage);
        return mileage;
}
    public void setMakeMoto(String makeMoto){
        this.makeMoto = makeMoto;
    }

    public String getMakeMoto(){
        System.out.println("MakeMoto - " + this.makeMoto);
        return makeMoto;
    }

    public String getBodyMoto() {
        System.out.println("BodyMoto - " + this.bodyMoto);
        return bodyMoto;
    }
    public void setBodyMoto(String bodyMoto) {
        if (bodyMoto !=null ) {
            this.bodyMoto = bodyMoto;
        }   else {
            System.out.println("You are trying set null");
        }
    }
}
