package EightKyo;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";

        switch (p1) {
            case("rock"):
                if (p2.equals("scissors")) return "Player 1 won!";
                break;

            case("scissors"):
                if (p2.equals("paper")) return "Player 1 won!";
                break;

            case("paper"):
                if (p2.equals("rock")) return "Player 1 won!";
                break;
        }

        return "Player 2 won!";
    }
}

/*
Задание:
Игра камень ножницы бумага.
На вход подается два String. Первый и второй
Указывают они одно из этого:
rock - камень
paper - бумага
scissors - ножницы

Метод должен вернуть:
Player 1 won! - победа первого игрока
Player 2 won! - победа второго игрока
Draw! - ничья
 */

/*
Ссылка:
https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
*/
