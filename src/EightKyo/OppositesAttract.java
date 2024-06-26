package EightKyo;

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        var sumPetals = flower1 + flower2;
        var evenOdd = sumPetals % 2;

        return evenOdd == 1;
    }
}

/*
Задание:

Timmy & Sarah think they are in love, but around where they live,
they will only know once they pick a flower each.
If one of the flowers has an even number of petals
and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower
and return true if they are in love and false if they aren't.
 */


/*
Лучшее решение:

public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
    return flower1 % 2 != flower2 % 2;
  }

}

Или такое:

public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
    return (flower1+flower2) %2 !=0;
  }

}

если честно, не выглядят они достаточно понятными в коде. Менее читабельны чтоли.
 */