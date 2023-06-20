package lesson_8_objects.Glass;

public class Main1 {
    public static void main(String[] args) {

        //  Cоздание обьекта     (NEW всегда создает новый отдельный обьект памяти даже с одинакомыми параметрами)
        Glass glass4 = new Glass(250,"black","plastic");
        Glass glass5 = glass4;
        glass5.volume = 300;
        System.out.println(glass4.volume);
        //glass4 и glass5 это просто 2 линки на 1 обьект в этом случае

//      Создание обьекта по перегруженому конструктору
        Glass glass6 = new Glass(250,"black");
        System.out.println("volume :" + glass6.volume +"color :" +glass6.color + "  material :  "  + glass6.material);
//        если в конструкторе нету стрингового значение, которое мы написали в принт аут, значет будет налл
//        если интовое значение отсутствует =  будет 0

    }
}
