package enam;

public enum DesignCarColor {

   // обьекты
   RED(1.200),
   WHITE(1.100),
   BLACK(400),
   GRAY(200),
   BLUE(1.700),
   GREEN(1.800),
   YELLOW(2.000),
   ;

//    private DesignCarColor(){ - вот такой конструктор создается по дефолту без параметров
   // Каждый метод применим к каждому обьекту выше

   //поля
   private double TaxPerColor;

   public double getTaxPerColor() {
      return TaxPerColor;
   }

   DesignCarColor(double taxPerColor) {
      TaxPerColor = taxPerColor;
   }

}