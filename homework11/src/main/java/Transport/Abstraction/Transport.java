package Transport.Abstraction;

public abstract class Transport {

    private String type;
    private int yearOfProduction;
    private int price;

    public Transport(String type, int yearOfProduction) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public int getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void isFilled();
   public abstract int calculatePrice();


}
