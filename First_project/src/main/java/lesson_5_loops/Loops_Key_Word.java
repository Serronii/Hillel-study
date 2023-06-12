package lesson_5_loops;

public class Loops_Key_Word {
    public static void main(String[] args) {

//            нечетные от 1 до 20

        for (int x = 0; x <= 20; x++) {
//           (если тут тру оно выполняет continue(пропускает четное число) если фолс выполняет систем аут
            if (x % 2 == 0) {
                continue;
            }
            System.out.println("Нечетное" + " " + x );

        }

//        Выводить значения и когда равно или больше 10 остановить
        int i = 0;
        while (true) {
            i = i + 3;
            System.out.println(i);
            if (i>=10) {
                break;
            }
        }


    }
}