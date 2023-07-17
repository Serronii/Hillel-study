package transport.moto;

import transport.abstraction.Transport;

public class Moto extends Transport {

    private int mileage;
    private String bodyMoto;
    private String brandMoto;
    private int basicPrice;

    public Moto(String type, int yearOfProduction,int price, int mileage, String bodyMoto, String brandMoto, int basicPrice) {
        super(type, yearOfProduction, price);
        this.mileage = mileage;
        this.bodyMoto = bodyMoto;
        setBrandMoto(brandMoto);
        this.basicPrice = basicPrice;
    }

    public int getMileage() {
        System.out.println("Mileage - " + this.mileage);
        return mileage;
    }

    public void setBrandMoto(String makeMoto) {
        this.brandMoto = makeMoto;
    }

    public String getMakeMoto() {
        System.out.println("MakeMoto - " + this.brandMoto);
        return brandMoto;
    }

    public String getBodyMoto() {
        System.out.println("BodyMoto - " + this.bodyMoto);
        return bodyMoto;
    }

    public void setBodyMoto(String bodyMoto) {
        if (bodyMoto != null) {
            this.bodyMoto = bodyMoto;
        } else {
            System.out.println("You are trying set null");}
        }
        public void setMileage(int mileage) {
            this.mileage = mileage;
        }
        public int getMilleage(){
        return mileage;
        }

//    @Override
//    public int calculatePrice() {
//
//      int priceReduction= (mileage / 1000) * 2000;
//      int price = basicPrice - priceReduction;
//      setPrice(price);
//      return price;
//
//    }
    @Override
    public String toString(){
        return bodyMoto + " " + brandMoto;
    }

    @Override
    public void isFilled() {
        System.out.println(getType() +" Is filling " + brandMoto);
    }

}
