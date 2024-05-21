package EightKyo;

public class SquareSum {
    public static int squareSum(int[] n) {
        var sum = 0;

        for (int num : n) {
            sum += num * num;
        }

        return sum;
    }
}

/*
Задание:
На вход подается массив целых чисел.
Нужно написать метод суммирования квадратов каждого элемента.

Пример:
[1, 2, 2] вернет 9,
1^2 + 2^2 + 2^2 = 9
 */

/*
Ссылка: https://www.codewars.com/kata/515e271a311df0350d00000f/java
 */