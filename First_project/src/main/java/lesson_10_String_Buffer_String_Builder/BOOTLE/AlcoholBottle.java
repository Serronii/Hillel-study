package lesson_10_String_Buffer_String_Builder.BOOTLE;

    public abstract class AlcoholBoottle {
        //от абстракного класа НЕ можно создать обьект, Только наследуемся
        int alcoholProcent;
        String name;

        // ЕСЛИ создаем конструктор с параметрами ((паблик не обьязательно писать)), то дефолтный теряется
        public AlcoholBoottle(int alcoholProcent, String name) {
            this.alcoholProcent = alcoholProcent;
            this.name = name;

        }
        //Если мы НЕ создаем конструктор, у нас он есть дефолтный под капотом
        public AlcoholBoottle(){} //вот так он выглядит
    }
    
