package enam;

public enum DesignCarColor {

   // обьекты
   RED("123"), //public static final DesignCarColor RED = new DesignCarColor - под капотом
   WHITE,
   BLACK,
   GRAY,
   BLUE,
   ;
//    private DesignCarColor(){ - вот такой конструктор создается по дефолту без параметров

   //поля
   private String name;

   public String getName() {
      return name;
   }

   DesignCarColor(String name) {
      this.name = name;
   }
}

