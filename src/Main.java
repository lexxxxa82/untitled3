public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        {
            String s = "abc";
            int sLength = s.length(); //  размер строки Будет присвоено значение 3
            System.out.println(sLength);
        }
        String s = "abcde";
        System.out.println(s.contains("bcd"));
// true, так как строка s действительно содержит внутри себя последовательность символов "bcd"
        s.endsWith("de");
// true, так как строка s действительно заканчивается на "de"
        s.startsWith("ab");
// true, так как строка s действительно начинается с "ab"
        s.equals("abcde");
// true, так как содержимое строк равно
        s.equalsIgnoreCase("ABCDE");
// true, так как при приведении к нижнему регистру содержимое строк равно
        s.isEmpty();
// false, так как s.length() не равен 0
        s.isBlank();
// false, так как s.length() не равен 0 и имеет буквы и/или числа
        "   ".isBlank();
// true, так как строка не имеет внутри букв и чисел, но состоит из пробелов, т. е. пуста (этот метод отсутствует в 8-й версии Java)


        StringBuilder sb = new StringBuilder("123");
// Будет создана сущность StringBuilder на основе строки "123"
        sb.append("4567");
// Добавит нашей сущности sb (с "123" внутри) строку "456", изменив содержимое на "123456".


        System.out.println(sb);
        char c = sb.charAt(1);
        System.out.println(c);
// Также вернет символ по индексу 1, т. е. c получит значение ‘2’, так как именно этот символ находится на второй позиции

        int sbLength = sb.length();
        System.out.println(sbLength);
// Получит значение 6, так как именно такая длина у нашей строки “123456”, что лежит внутри сущности

        sb.reverse();
     // sb.replace('1','2');
        System.out.println(sb);
// Заменит все единицы в содержимом сущности на двойки, т. е. “223456”
        sb.setCharAt(1,'8');
        System.out.println(sb);
// Установит вместо символа по индексу 1 символ ‘5’, т. е. текущая строка изменится на “153456”

        sb.insert(1,"abc");
        System.out.println(sb);
// Установит в ячейки, начиная с первой, символы a, b и c, а ранее находившиеся там ячейки сдвинутся на позиции вперед, т. е. “1abc23456”

        sb.delete(1, 4);
        System.out.println(sb);
// Удалит из текущей строки все символы, начиная от ячейки с индексом 1 (включительно) и до ячейки с индексом 3 (не включительно), т. е. 2-й и 3-й символы строки будут удалены и содержимое изменится на “1456”

        sb.deleteCharAt(1);
        System.out.println(sb);
// Удалит из текущей строки символ, находящийся в ячейке по индексу 1, т. е. строка изменит свое состояние на “13456”

       sb.reverse();
        System.out.println(sb);
// Полностью развернет текущую строку, т. е. превратит ее в “654321”
        char[] symbols = {'a', 'b', 'c'};
        String stringFromSymbols = new String(symbols);
        System.out.println(stringFromSymbols);
        byte[] textInBytes = {33, 33, 33};
        String stringFromBytes = new String(textInBytes);
        System.out.println(stringFromBytes);

        {
            String y = "abcde";
            char x = y.charAt(2);
            System.out.println(x);
/* c будет инициализировано значением c, так как именно оно стоит
на третьей позиции в строке s (строка — это массив, т. е. 3-я позиция
располагается под индексом 2) */

            { s = "abcd";
            String s1 = s.toUpperCase();
            System.out.println(s1);}

/* s1 будет присвоена копия строки s, где все символы будут в верхнем
регистре, т. е. “ABCD” */

            { s = "ABCD";
             String s1 = s.toLowerCase();
            System.out.println(s1);}
/* s1 будет присвоено значение строки s, но все символы снова перейдут
 в нижний регистр, т. е. “abcd” */

            {
                s = "   abcd   ";
              String s1 = s.trim();
                System.out.println(s1);}
/* s1 будет присвоено значение строки s, но без «лидирующих» и
«завершающих» пробелов, они будут удалены, т. е. “abcd” */

            {s = "My name is Ivan";
              String[] words = s.split(" ");
                for (int i = 0; i < words.length; i++)
                System.out.println(words[i]);}

/* Данный метод создаст из строки массив, разбив ее на части.
Разделитель указывается в скобках. Мы указали в скобках пробел,
следовательно, делить строку на элементы метод будет в тех местах,
где стоит пробел, т. е. words будет равно {“My”, “name”, “is”, “Ivan”} */

            {s = "abcd";
              char[] r = s.toCharArray();
                for (int i = 0; i < r.length; i++)
                    System.out.println(r[i]);
            }
/* Преобразует строку в массив символов, присвоив c массив
вида {‘a’, ‘b’, ‘c’, ‘d’} */

            { s = "qwerty";
             String a = s.substring(1, 5);
                System.out.println(a);}

/* s1 получит значение, которое находится в строке s, начиная
с индекса 2 включительно и заканчивая индексом 4 не включительно, т. е. “cd” */

            { s = "ab c de";
             String s1 = s.replace(" ", "");
                System.out.println(s1);
            }

/* s1 получит копию строки s, но из этой копии будут удалены все
 пробелы (заменены символы из первого параметра (пробел) на символ
из второго параметра (пустая строка)) */

             String s2 = s.replace('a', 'x');
            System.out.println(s2);
/* s2 получит строку s, где все символы ‘a’ (первый параметр)
будут заменены на ‘b’ (второй параметр), т. е. “bb c de” */

            { s = "#";
           String s1 = s.repeat(10);
                System.out.println(s1);
            }
/* s1 получит строку s, которая будет повторена 10 раз (значение из скобок),
т. е. “##########” */
        }
    }

}