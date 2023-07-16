package enam;

public enum DesignCarColor {

   // обьекты
   RED("red"), //public static final DesignCarColor RED = new DesignCarColor; - под капотом
   WHITE,
   BLACK,
   GRAY,
   BLUE,
   ;


//    private DesignCarColor(){ - вот такой конструктор создается по дефолту без параметров
   // Каждый метод применим к каждому обьекту выше

   //поля
   private String name;

   public String getName() {
      return name;
   }

   //по умолчанию у енама контруктор приватный
   DesignCarColor(String name) {
      this.name = name;
   }
   //Создаем конструктор пустой для обьектов в которых нету name, иначе будет подчеркивать красным
   DesignCarColor(){

   }

   @Override
   public String toString() {
      return "DesignCarColor{" +
              "name='" + name + '\'' +
              '}';
   }

   public void printEnum(){
      System.out.println("name " + name);
   }

}
