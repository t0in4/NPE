import java.util.Objects;

public class Main {
    public static String concatStrings(String s1, String s2){
        return s1.concat(s2);
    }
    public static void main(String[] args) {
        // проверка на NPE
        String string = null;
        // C использованием тернарного оператора
        System.out.println(string == null ? 0 : string.length() );
        // переложение тернарного оператора на if - else
        /*if (string == null) {
                    0;
        } else {
                    string.length();
        }*/
        // сравнение строк вызывает Null pointer exception
        String str = null;
        /*if (str.equals("abc")) {
            System.out.println("Одинаковы");
        }*/
        // избегаем NPE
        if ("abc".equals(str)) {
            System.out.println("Одинаковы");
        }
        // что если два переменных оба String и мы не знаем
        String s1 = null;
        String s2 = null;
        if (java.util.Objects.equals(s1,s2)) {
            System.out.println("Строки одинаковы");
        }
        // Правила для избегания NPE
        // 1. для ссылочных типов используем условие для проверки
        //      переменной - не равна ли она null
        // 2. стараемся избежать присвоения / назначения null для
        //     инициализации переменной где бы то нибыло.
        // 3. использовать NPE-безопасные методы из
        //    стандартной библиотеки.
        System.out.println(concatStrings(s1, s2));



    }
}