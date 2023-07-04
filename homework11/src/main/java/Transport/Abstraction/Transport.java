package Transport.Abstraction;

public abstract class Transport {

   private String type;
   private int yearOfProduction;


   public Transport(String type,int yearOfProduction){
       this.type = type;
       this.yearOfProduction = yearOfProduction;

   }

}
