package enam;

public enum DesignCarColor {

   // обьекты
   RED(1200),
   WHITE(1100),
   BLACK(400),
   GRAY(200),
   BLUE(1800),
   GREEN(1800),
   YELLOW(2000),
   ;

//    private DesignCarColor(){ - вот такой конструктор создается по дефолту без параметров
   // Каждый метод применим к каждому обьекту выше

   //поля
   private int TaxPerColor;

   public int getTaxPerColor() {
      return TaxPerColor;
   }

   DesignCarColor(int taxPerColor) {
      TaxPerColor = taxPerColor;
   }

}