package EightKyo;

public class ReversedStrings {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

/*
Кто-то сказал что лучше использовать StringBuffer() вместо StringBuilder(),
так как StringBuffer() - потокобезопасен.
 */

/*
Задание:
Написать метод, который принимает на вход строку
и переворачивает ее.

Пример:
'world'  =>  'dlrow'
'word'   =>  'drow'

Ссылка: https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
 */
