package lesson_10_String_Buffer_String_Builder;

public class part1 {
    //String Buffer - Обьект который изменяет свое состояние
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("world!");

        String result = stringBuilder.toString();
        System.out.println(result);
        //В этом примере мы создаем ОБЬЕКТ StringBuilder и последовательно добавляем к нему фрагменты строки методом append().
        // Затем мы вызываем метод toString() для получения результирующей строки и выводим ее на экран.
        // Все операции изменения строки выполняются непосредственно внутри объекта StringBuilder
        // без создания дополнительных объектов строки.
//-----------------------------------------------------------------------------------------------------------------------------
        String str1 = "Hello";
        String str2 = " ";
        String str3 = "world!";

        String result1 = str1 + str2 + str3;
        System.out.println(result1);
        //В этом примере мы создаем отдельные строки str1, str2 и str3 и затем объединяем их операцией конкатенации (+).
        // Каждая операция конкатенации создает новый объект строки, содержащий результат.
        // Затем мы выводим результирующую строку на экран.
//-----------------------------------------------------------------------------------------------------------------------------
    String k = "Hello Java";
    StringBuilder stringBuilder1 = new StringBuilder(k);
        stringBuilder1.insert(10,'X'); //добавляем в пустой 10 индекс "Х"
        stringBuilder1.insert(1,'Y'); //инсерт НЕ заменяет а вставляет дополнительный символ
        stringBuilder1.append(" Вафлисты"); //добавляет
        System.out.println(stringBuilder1);







}














}
