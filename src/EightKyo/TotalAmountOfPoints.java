package EightKyo;

public class TotalAmountOfPoints {

    public static int points(String[] games) {
        var result = 0;

        for (String game : games) {
            var commandX = game.charAt(0);
            var commandY = game.charAt(game.length() - 1);

            if (commandX == commandY) result += 1;

            if (commandX > commandY) result += 3;
        }

        return result;
    }
}

/*
Задание:

Наша футбольная команда завершила чемпионат.
Результаты матчей нашей команды записываются в виде набора строк.
Каждый матч представлен строкой в формате "x:y",
где x - результат нашей команды,
а y - результат наших соперников.
Например: ["3:1", "2:2", "0:1", ...]

Очки начисляются за каждый матч следующим образом:
если x > y: 3 очка (победа)
если x < y: 0 очков (поражение)
если x = y: 1 очко (ничья)

Нам нужно написать функцию,
которая возьмет этот набор и вернет количество очков,
набранных нашей командой (x) в чемпионате по правилам, приведенным выше.

Условия:
Наша команда всегда проводит 10 матчей в чемпионате
0 <= x <= 4
0 <= y <= 4

 */


/*
Ссылка:
https://www.codewars.com/kata/5bb904724c47249b10000131/train/java
 */