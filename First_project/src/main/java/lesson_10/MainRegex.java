package lesson_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z]",Pattern.CASE_INSENSITIVE); // задаем условие проверки (регекс выражение)
        Matcher matcher = pattern.matcher("Visit Java!"); // задаем елемент для проверки (визит джава)
        System.out.println(matcher.find()); // проверка тру фолс


    }
}
